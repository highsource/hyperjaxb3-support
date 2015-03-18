import integration.mindbody.*;
import integration.mindbody.Class;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;
import static util.SharedMethods.createFactory;
import static util.SharedMethods.getFutureDate;

/**
 * Created by sergeyshapoval on 17.03.2015.
 */
public class ClientClassServiceTest {
	private static Logger logger = Logger.getLogger(ClientClassServiceTest.class);
	public static final String MINDBODY_SOURCE_NAME = "SomuchmoreUG";
	public static final String MINDBODY_PASSWORD = "0OzLhF4qcep9MXSP2JQuCNxX8CM=";
	public static final String MINDBODY_API_CLASS_ADDRESS = "https://api.mindbodyonline.com/0_5/ClassService.asmx";
	public static final String MINDBODY_API_CLIENT_ADDRESS = "https://api.mindbodyonline.com/0_5/ClientService.asmx";
	public static String newClientId;

	public static ClassX0020ServiceSoap classService;
	public static ClientX0020ServiceSoap clientService;
	public static SourceCredentials sourceCredentials;
	public static EnumSet<StatusCode> acceptedStatusCodes = EnumSet.of(StatusCode.SUCCESS, StatusCode.INTERNAL_EXCEPTION);
	public static String unpaidClassName = "Yoga";
	public static String unpaidStaffLastName = "Smith";
	public static int daysQty = 7;
	public static int testStudioId = -99;


	@BeforeClass
	public static void setUp(){
		classService = (ClassX0020ServiceSoap) createFactory(MINDBODY_API_CLASS_ADDRESS, ClassX0020ServiceSoap.class);
		clientService = (ClientX0020ServiceSoap) createFactory(MINDBODY_API_CLIENT_ADDRESS, ClientX0020ServiceSoap.class);
		newClientId = UUID.randomUUID().toString();

		sourceCredentials = new SourceCredentials();
		sourceCredentials.setSourceName(MINDBODY_SOURCE_NAME);
		sourceCredentials.setPassword(MINDBODY_PASSWORD);
		ArrayOfInt siteIds = new ArrayOfInt();
		siteIds.getInt().add(testStudioId);
		sourceCredentials.setSiteIDs(siteIds);
	}

	@Test
	public void clientCreation(){
		String newClientId = UUID.randomUUID().toString();
		AddOrUpdateClientsResult addOrUpdateClientsResult = getAddOrUpdateClientsResult(newClientId);
		assertTrue(acceptedStatusCodes.contains(addOrUpdateClientsResult.getStatus()));

		List<Client> clients = getClientsToVerify(newClientId);
		assertEquals("No clients was added, MindBody Database doesn't contain " + newClientId,
				clients.size(), 1);

	}

	private List<Client> getClientsToVerify(String newClientId) {
		ArrayOfString clientIds = new ArrayOfString();
		clientIds.getString().add(newClientId);
		GetClientsRequest getClientsRequest = new GetClientsRequest();
		getClientsRequest.setClientIDs(clientIds);
		getClientsRequest.setSourceCredentials(sourceCredentials);

		GetClients getClients = new GetClients();
		getClients.setRequest(getClientsRequest);
		return clientService.getClients(getClientsRequest).getClients().getClient();
	}

	private AddOrUpdateClientsResult getAddOrUpdateClientsResult(String newClientId) {
		ArrayOfClient clientArray = new ArrayOfClient();
		Client newClient = getClientWithObligatoryFields(newClientId);
		clientArray.getClient().add(newClient);

		AddOrUpdateClientsRequest addClientRequest = new AddOrUpdateClientsRequest();
		addClientRequest.setClients(clientArray);
		addClientRequest.setSourceCredentials(sourceCredentials);

		return clientService.addOrUpdateClients(addClientRequest);
	}

	private Client getClientWithObligatoryFields(String newClientId) {
		Client newClient = new Client();
		logger.info(newClientId);
		newClient.setID(newClientId);
		newClient.setFirstName(newClientId);
		newClient.setLastName(newClientId);
		newClient.setEmail(newClientId);
		return newClient;
	}

	@Test
	public void weekClassesRequest(){
		GetClassesRequest getClasses = new GetClassesRequest();
		getClasses.setEndDateTime(getFutureDate(daysQty));
		getClasses.setStartDateTime(new Date());
		getClasses.setHideCanceledClasses(true);
		getClasses.setSourceCredentials(sourceCredentials);
		GetClassesResult getClassesResult = classService.getClasses(getClasses);
		assertTrue(getClassesResult.getClasses().getClazz().size() > 0);
	}

	/*
	if not allowed for online booking:
	  status = FAILED_ACTION,
	  errorcode = 201
	  "ClientID 100015656 has no available payments for ClassID 24376" in messages in client in clients in clazz in classes in result (faster to test to String)
	  we can filter such classes to eliminate requests and send notifications to Studios
	*/
	@Test
	public void addNewClientToUnpaidClass(){
		AddOrUpdateClientsResult addOrUpdateClientsResult = getAddOrUpdateClientsResult(newClientId);
		assertTrue(acceptedStatusCodes.contains(addOrUpdateClientsResult.getStatus()));

		Class classForReservation = getUnPaidClassObject();
		assertNotNull(classForReservation);

		AddClientsToClassesResult addClientsToClassesResult = getAddClientsToClassesResult(classForReservation.getID(), newClientId);
		assertEquals(addClientsToClassesResult.getErrorCode(), 200);
	}

	private AddClientsToClassesResult getAddClientsToClassesResult(int desiredClassId, String customerId) {
		AddClientsToClassesRequest addClientsToClassesRequest = new AddClientsToClassesRequest();
		addClientsToClassesRequest.setSourceCredentials(sourceCredentials);

		ArrayOfInt classIds = new ArrayOfInt();
		classIds.getInt().add(desiredClassId);
		addClientsToClassesRequest.setClassIDs(classIds);

		ArrayOfString clientIds = new ArrayOfString();
		clientIds.getString().add(customerId);
		addClientsToClassesRequest.setClientIDs(clientIds);

		AddClientsToClassesResult addClientsToClassesResult = classService.addClientsToClasses(addClientsToClassesRequest);
		logger.info(addClientsToClassesResult);
		return addClientsToClassesResult;
	}

	/*
	Daily Work Out - Jake Hay - Paid online signups
	Yoga - Ken Berry - Unpaid online signups
	Yoga - John Smith - Unpaid online signups (211, 223 Class Description)
	*/

	private Class getUnPaidClassObject() {
		GetClassesRequest getClasses = new GetClassesRequest();
		getClasses.setEndDateTime(getFutureDate(daysQty));
		getClasses.setStartDateTime(new Date());
		getClasses.setHideCanceledClasses(true);
		getClasses.setSourceCredentials(sourceCredentials);
		GetClassesResult getClassesResult = classService.getClasses(getClasses);

		Class classForReservation = null;
		for (Class currentClass : getClassesResult.getClasses().getClazz()){
			String description = currentClass.getClassDescription().getName();
			if (!description.equals(unpaidClassName)){
				continue;
			}
			String currentLastname = currentClass.getStaff().getLastName();
			if (currentLastname.contains(unpaidStaffLastName)){
				classForReservation = currentClass;
				break;
			}
		}
		return classForReservation;
	}
}
