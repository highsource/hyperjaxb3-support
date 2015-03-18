
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
 * <p>Java class for AddClientsToClassesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClientsToClassesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ClassIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequirePayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Waitlist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "AddClientsToClassesRequest", propOrder = {
    "clientIDs",
    "classIDs",
    "test",
    "requirePayment",
    "waitlist",
    "sendEmail"
})
public class AddClientsToClassesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "ClassIDs")
    protected ArrayOfInt classIDs;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "RequirePayment", required = true, type = Boolean.class, nillable = true)
    protected Boolean requirePayment;
    @XmlElement(name = "Waitlist", required = true, type = Boolean.class, nillable = true)
    protected Boolean waitlist;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;

    /**
     * Gets the value of the clientIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getClientIDs() {
        return clientIDs;
    }

    /**
     * Sets the value of the clientIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setClientIDs(ArrayOfString value) {
        this.clientIDs = value;
    }

    /**
     * Gets the value of the classIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassIDs() {
        return classIDs;
    }

    /**
     * Sets the value of the classIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassIDs(ArrayOfInt value) {
        this.classIDs = value;
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
     * Gets the value of the requirePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequirePayment() {
        return requirePayment;
    }

    /**
     * Sets the value of the requirePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePayment(Boolean value) {
        this.requirePayment = value;
    }

    /**
     * Gets the value of the waitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWaitlist() {
        return waitlist;
    }

    /**
     * Sets the value of the waitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlist(Boolean value) {
        this.waitlist = value;
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
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDs", theClientIDs), currentHashCode, theClientIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classIDs", theClassIDs), currentHashCode, theClassIDs);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "test", theTest), currentHashCode, theTest);
        }
        {
            Boolean theRequirePayment;
            theRequirePayment = this.getRequirePayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requirePayment", theRequirePayment), currentHashCode, theRequirePayment);
        }
        {
            Boolean theWaitlist;
            theWaitlist = this.getWaitlist();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitlist", theWaitlist), currentHashCode, theWaitlist);
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
        if (!(object instanceof AddClientsToClassesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AddClientsToClassesRequest that = ((AddClientsToClassesRequest) object);
        {
            ArrayOfString lhsClientIDs;
            lhsClientIDs = this.getClientIDs();
            ArrayOfString rhsClientIDs;
            rhsClientIDs = that.getClientIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIDs", lhsClientIDs), LocatorUtils.property(thatLocator, "clientIDs", rhsClientIDs), lhsClientIDs, rhsClientIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsClassIDs;
            lhsClassIDs = this.getClassIDs();
            ArrayOfInt rhsClassIDs;
            rhsClassIDs = that.getClassIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classIDs", lhsClassIDs), LocatorUtils.property(thatLocator, "classIDs", rhsClassIDs), lhsClassIDs, rhsClassIDs)) {
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
            Boolean lhsRequirePayment;
            lhsRequirePayment = this.getRequirePayment();
            Boolean rhsRequirePayment;
            rhsRequirePayment = that.getRequirePayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requirePayment", lhsRequirePayment), LocatorUtils.property(thatLocator, "requirePayment", rhsRequirePayment), lhsRequirePayment, rhsRequirePayment)) {
                return false;
            }
        }
        {
            Boolean lhsWaitlist;
            lhsWaitlist = this.getWaitlist();
            Boolean rhsWaitlist;
            rhsWaitlist = that.getWaitlist();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waitlist", lhsWaitlist), LocatorUtils.property(thatLocator, "waitlist", rhsWaitlist), lhsWaitlist, rhsWaitlist)) {
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
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            strategy.appendField(locator, this, "clientIDs", buffer, theClientIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            strategy.appendField(locator, this, "classIDs", buffer, theClassIDs);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            strategy.appendField(locator, this, "test", buffer, theTest);
        }
        {
            Boolean theRequirePayment;
            theRequirePayment = this.getRequirePayment();
            strategy.appendField(locator, this, "requirePayment", buffer, theRequirePayment);
        }
        {
            Boolean theWaitlist;
            theWaitlist = this.getWaitlist();
            strategy.appendField(locator, this, "waitlist", buffer, theWaitlist);
        }
        {
            Boolean theSendEmail;
            theSendEmail = this.getSendEmail();
            strategy.appendField(locator, this, "sendEmail", buffer, theSendEmail);
        }
        return buffer;
    }

}
