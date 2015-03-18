package jaxbjpa;

import integration.mindbody.*;
import integration.mindbody.Class;
import integration.mindbody.GetClasses;
import integration.mindbody.GetClassesRequest;
import integration.mindbody.GetClassesResponse;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static util.SharedMethods.*;

/**
 * Created by sergeyshapoval on 16.03.2015.
 */
public class PersistenceMarshalingIntegrationTest {

	private static Logger logger = Logger.getLogger(PersistenceMarshalingIntegrationTest.class);
	private static JAXBContext context;
	private static EntityManager entityManager;

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
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("integration.mindbody");
		entityManager = entityManagerFactory.createEntityManager();
		context = JAXBContext.newInstance("integration.mindbody");
	}

	@AfterClass
	public static void finalization(){
		if (entityManager != null){
			entityManager.close();
		}
	}

	@Test
	public void testRoundTrip() throws JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();
		GetClassesResponse response = (GetClassesResponse) unmarshaller.unmarshal(new File("src/test/resources/response.xml"));
		List<Class> classes = response.getGetClassesResult().getClasses().getClazz();
		Class testClass = classes.iterator().next();

		persistTransaction(testClass, entityManager);
		Long id = testClass.getHjid();

		Class persistedTestClass = entityManager.find(Class.class, id);
		assertEquals("Objects are not equal.", testClass, persistedTestClass);

		ArrayOfInt classIds = new ArrayOfInt();
		List<Integer> listClassIds = classIds.getInt();

		for (Class clazz: classes){
			listClassIds.add(clazz.getID());
		}

		GetClassesRequest classesRequest = new GetClassesRequest();
		classesRequest.setStartDateTime(new Date());
		classesRequest.setEndDateTime(getFutureDate(7));
		classesRequest.setClassIDs(classIds);
		GetClasses getClasses = new GetClasses();
		getClasses.setRequest(classesRequest);

		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(getClasses, System.out);
	}



}
