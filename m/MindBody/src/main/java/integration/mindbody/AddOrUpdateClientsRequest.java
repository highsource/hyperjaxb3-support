
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
 * <p>Java class for AddOrUpdateClientsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateClientsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="UpdateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Clients" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClient" minOccurs="0"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateClientsRequest", propOrder = {
    "updateAction",
    "test",
    "clients",
    "sendEmail"
})
public class AddOrUpdateClientsRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UpdateAction")
    protected String updateAction;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "Clients")
    protected ArrayOfClient clients;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateAction(String value) {
        this.updateAction = value;
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

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClient }
     *     
     */
    public ArrayOfClient getClients() {
        return clients;
    }

    /**
     * Sets the value of the clients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClient }
     *     
     */
    public void setClients(ArrayOfClient value) {
        this.clients = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theUpdateAction;
            theUpdateAction = this.getUpdateAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateAction", theUpdateAction), currentHashCode, theUpdateAction);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "test", theTest), currentHashCode, theTest);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clients", theClients), currentHashCode, theClients);
        }
        {
            Boolean theSendEmail;
            theSendEmail = this.getSendEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendEmail", theSendEmail), currentHashCode, theSendEmail);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddOrUpdateClientsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AddOrUpdateClientsRequest that = ((AddOrUpdateClientsRequest) object);
        {
            String lhsUpdateAction;
            lhsUpdateAction = this.getUpdateAction();
            String rhsUpdateAction;
            rhsUpdateAction = that.getUpdateAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateAction", lhsUpdateAction), LocatorUtils.property(thatLocator, "updateAction", rhsUpdateAction), lhsUpdateAction, rhsUpdateAction)) {
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
        {
            ArrayOfClient lhsClients;
            lhsClients = this.getClients();
            ArrayOfClient rhsClients;
            rhsClients = that.getClients();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clients", lhsClients), LocatorUtils.property(thatLocator, "clients", rhsClients), lhsClients, rhsClients)) {
                return false;
            }
        }
        {
            Boolean lhsSendEmail;
            lhsSendEmail = this.getSendEmail();
            Boolean rhsSendEmail;
            rhsSendEmail = that.getSendEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendEmail", lhsSendEmail), LocatorUtils.property(thatLocator, "sendEmail", rhsSendEmail), lhsSendEmail, rhsSendEmail)) {
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
            String theUpdateAction;
            theUpdateAction = this.getUpdateAction();
            strategy.appendField(locator, this, "updateAction", buffer, theUpdateAction);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            strategy.appendField(locator, this, "test", buffer, theTest);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            strategy.appendField(locator, this, "clients", buffer, theClients);
        }
        {
            Boolean theSendEmail;
            theSendEmail = this.getSendEmail();
            strategy.appendField(locator, this, "sendEmail", buffer, theSendEmail);
        }
        return buffer;
    }

}
