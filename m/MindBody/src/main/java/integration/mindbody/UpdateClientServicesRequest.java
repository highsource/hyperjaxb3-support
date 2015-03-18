
package integration.mindbody;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for UpdateClientServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateClientServicesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientServices" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClientService" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateClientServicesRequest", propOrder = {
    "clientServices",
    "test"
})
public class UpdateClientServicesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientServices")
    protected ArrayOfClientService clientServices;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;

    /**
     * Gets the value of the clientServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientService }
     *     
     */
    public ArrayOfClientService getClientServices() {
        return clientServices;
    }

    /**
     * Sets the value of the clientServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientService }
     *     
     */
    public void setClientServices(ArrayOfClientService value) {
        this.clientServices = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfClientService theClientServices;
            theClientServices = this.getClientServices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientServices", theClientServices), currentHashCode, theClientServices);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "test", theTest), currentHashCode, theTest);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UpdateClientServicesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UpdateClientServicesRequest that = ((UpdateClientServicesRequest) object);
        {
            ArrayOfClientService lhsClientServices;
            lhsClientServices = this.getClientServices();
            ArrayOfClientService rhsClientServices;
            rhsClientServices = that.getClientServices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientServices", lhsClientServices), LocatorUtils.property(thatLocator, "clientServices", rhsClientServices), lhsClientServices, rhsClientServices)) {
                return false;
            }
        }
        {
            Boolean lhsTest;
            lhsTest = this.getTest();
            Boolean rhsTest;
            rhsTest = that.getTest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "test", lhsTest), LocatorUtils.property(thatLocator, "test", rhsTest), lhsTest, rhsTest)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            ArrayOfClientService theClientServices;
            theClientServices = this.getClientServices();
            strategy.appendField(locator, this, "clientServices", buffer, theClientServices);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            strategy.appendField(locator, this, "test", buffer, theTest);
        }
        return buffer;
    }

}
