import integration.mindbody.*;
import integration.mindbody.Class;
import jaxbjpa.PersistenceMarshalingIntegrationTest;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static util.SharedMethods.createFactory;
import static util.SharedMethods.getFutureDate;

/**
 * Created by sergeyshapoval on 17.03.2015.
 */
public class SoapPersistenceEquals {

	private static Logger logger = Logger.getLogger(PersistenceMarshalingIntegrationTest.class);
	private static EntityManager entityManager;
	public static ClassX0020ServiceSoap classService;
	public static ClientX0020ServiceSoap clientService;
	public static SourceCredentials sourceCredentials;
	public static EnumSet<StatusCode> acceptedStatusCodes = EnumSet.of(StatusCode.SUCCESS, StatusCode.INTERNAL_EXCEPTION);
	public static int testStudioId = -99;
	public static final String MINDBODY_SOURCE_NAME = "SomuchmoreUG";
	public static final String MINDBODY_PASSWORD = "0OzLhF4qcep9MXSP2JQuCNxX8CM=";
	public static final String MINDBODY_API_CLASS_ADDRESS = "https://api.mindbodyonline.com/0_5/ClassService.asmx";
	public static final String MINDBODY_API_CLIENT_ADDRESS = "https://api.mindbodyonline.com/0_5/ClientService.asmx";


	@BeforeClass
	public static void setUp() throws Exception {
		Properties persistenceProperties = new Properties();
		InputStream is = null;
		try {
			is = PersistenceMarshalingIntegrationTest.class.getClassLoader().getResourceAsStream( "persistence.properties");
			persistenceProperties.load(is);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException ignored) {
					logger.error("wrong path to properties", ignored);
				}
			}
		}

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("integration.mindbody.model", persistenceProperties);
		entityManager = entityManagerFactory.createEntityManager();

		classService = (ClassX0020ServiceSoap) createFactory(MINDBODY_API_CLASS_ADDRESS, ClassX0020ServiceSoap.class);
		clientService = (ClientX0020ServiceSoap) createFactory(MINDBODY_API_CLIENT_ADDRESS, ClientX0020ServiceSoap.class);


		sourceCredentials = new SourceCredentials();
		sourceCredentials.setSourceName(MINDBODY_SOURCE_NAME);
		sourceCredentials.setPassword(MINDBODY_PASSWORD);
		ArrayOfInt siteIds = new ArrayOfInt();
		siteIds.getInt().add(testStudioId);
		sourceCredentials.setSiteIDs(siteIds);

	}

	@AfterClass
	public static void finalization(){
		if (entityManager != null){
			entityManager.close();
		}
	}



	@Test
	public void soapRequestPersistCompare(){
		GetClassesRequest getClassesRequest = getTommorowClassesRequest();
		GetClassesResult getClassesResult = classService.getClasses(getClassesRequest);
		List<Class>  classList = getClassesResult.getClasses().getClazz();
		assertTrue(classList.size() > 0);

		persistObjectList(classList);
		Class persistedClass = entityManager.find(Class.class, getRandomId(classList));

//		setSmallRequest(getClassesRequest, persistedClass);

		List<Class> classListSmall = classService.getClasses(getClassesRequest).getClasses().getClazz();

		Class classFromSmallRequest = findClassById(persistedClass, classListSmall);

		assertEquals("RoundSOapPersistenceTest failed", persistedClass, classFromSmallRequest);

	}

	private Class findClassById(Class persistedClass, List<Class> classListSmall) {
		Class classFromSmallRequest = null;

		for (Class currentClazz : classListSmall){
			if (currentClazz.getID().equals(persistedClass.getID())){
				classFromSmallRequest = currentClazz;
				break;
			}
		}
		return classFromSmallRequest;
	}

	private static void setSmallRequest(GetClassesRequest getClassesRequest, Class persistedClass) {
		getClassesRequest.setStartDateTime(persistedClass.getStartDateTime());
		getClassesRequest.setEndDateTime(persistedClass.getEndDateTime());
		ArrayOfInt classDescriptionsArray = new ArrayOfInt();
		classDescriptionsArray.getInt().add(persistedClass.getClassDescription().getID());
		getClassesRequest.setClassDescriptionIDs(classDescriptionsArray);
	}

	private static Long getRandomId(List<Class> classList) {
		Class randomClass = classList.get(new Random().nextInt(classList.size()));
		return randomClass.getHjid();
	}

	private static void persistObjectList(List<?> objectList) {
		for (Object object : objectList){
			entityManager.getTransaction().begin();
			logger.info(object);
			entityManager.persist(object);
			entityManager.getTransaction().commit();

		}
	}

	private static GetClassesRequest getTommorowClassesRequest() {
		GetClassesRequest getClassesRequest = new GetClassesRequest();
		getClassesRequest.setEndDateTime(getFutureDate(2));
		getClassesRequest.setStartDateTime(getFutureDate(1));
		getClassesRequest.setHideCanceledClasses(true);
		getClassesRequest.setSourceCredentials(sourceCredentials);
		return getClassesRequest;
	}


}
