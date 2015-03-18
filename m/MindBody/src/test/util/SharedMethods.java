package util;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.validation.JAXRSBeanValidationInInterceptor;
import org.apache.cxf.jaxrs.validation.JAXRSBeanValidationOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by sergeyshapoval on 17.03.2015.
 */
public class SharedMethods {

	public static Date getFutureDate(int daysForward) {
		return new Date(new Date().getTime() + daysForward*24*60*60*1000);
	}

	public static void persistTransaction(Object object, EntityManager saveManager) {
		saveManager.getTransaction().begin();
		saveManager.persist(object);
		saveManager.getTransaction().commit();
	}

	public static Object createFactory(String webServiceAddress, Class clazz){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getInInterceptors().add(new JAXRSBeanValidationInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.getOutInterceptors().add(new JAXRSBeanValidationOutInterceptor());

		factory.setAddress(webServiceAddress);
		factory.setServiceClass(clazz);
//		factory.setWsdlLocation(webServiceAddress + "?WSDL");
		factory.setProperties(new HashMap<String, Object>(){{
			put("schema-validation-enabled", true);
		}});
		return factory.create();
	}

}
