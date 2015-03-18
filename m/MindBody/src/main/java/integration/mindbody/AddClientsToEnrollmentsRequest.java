
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for AddClientsToEnrollmentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClientsToEnrollmentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ClassScheduleIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="CourseIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="EnrollDateForward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EnrollOpen" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfDateTime" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Waitlist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddClientsToEnrollmentsRequest", propOrder = {
    "clientIDs",
    "classScheduleIDs",
    "courseIDs",
    "enrollDateForward",
    "enrollOpen",
    "test",
    "sendEmail",
    "waitlist"
})
public class AddClientsToEnrollmentsRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "ClassScheduleIDs")
    protected ArrayOfInt classScheduleIDs;
    @XmlElement(name = "CourseIDs")
    protected ArrayOfInt courseIDs;
    @XmlElement(name = "EnrollDateForward", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date enrollDateForward;
    @XmlElement(name = "EnrollOpen")
    protected ArrayOfDateTime enrollOpen;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "Waitlist", required = true, type = Boolean.class, nillable = true)
    protected Boolean waitlist;

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
     * Gets the value of the classScheduleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassScheduleIDs() {
        return classScheduleIDs;
    }

    /**
     * Sets the value of the classScheduleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassScheduleIDs(ArrayOfInt value) {
        this.classScheduleIDs = value;
    }

    /**
     * Gets the value of the courseIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCourseIDs() {
        return courseIDs;
    }

    /**
     * Sets the value of the courseIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCourseIDs(ArrayOfInt value) {
        this.courseIDs = value;
    }

    /**
     * Gets the value of the enrollDateForward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEnrollDateForward() {
        return enrollDateForward;
    }

    /**
     * Sets the value of the enrollDateForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollDateForward(Date value) {
        this.enrollDateForward = value;
    }

    /**
     * Gets the value of the enrollOpen property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public ArrayOfDateTime getEnrollOpen() {
        return enrollOpen;
    }

    /**
     * Sets the value of the enrollOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public void setEnrollOpen(ArrayOfDateTime value) {
        this.enrollOpen = value;
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDs", theClientIDs), currentHashCode, theClientIDs);
        }
        {
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classScheduleIDs", theClassScheduleIDs), currentHashCode, theClassScheduleIDs);
        }
        {
            ArrayOfInt theCourseIDs;
            theCourseIDs = this.getCourseIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "courseIDs", theCourseIDs), currentHashCode, theCourseIDs);
        }
        {
            Date theEnrollDateForward;
            theEnrollDateForward = this.getEnrollDateForward();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enrollDateForward", theEnrollDateForward), currentHashCode, theEnrollDateForward);
        }
        {
            ArrayOfDateTime theEnrollOpen;
            theEnrollOpen = this.getEnrollOpen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enrollOpen", theEnrollOpen), currentHashCode, theEnrollOpen);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "test", theTest), currentHashCode, theTest);
        }
        {
            Boolean theSendEmail;
            theSendEmail = this.getSendEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendEmail", theSendEmail), currentHashCode, theSendEmail);
        }
        {
            Boolean theWaitlist;
            theWaitlist = this.getWaitlist();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitlist", theWaitlist), currentHashCode, theWaitlist);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddClientsToEnrollmentsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AddClientsToEnrollmentsRequest that = ((AddClientsToEnrollmentsRequest) object);
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
            ArrayOfInt lhsClassScheduleIDs;
            lhsClassScheduleIDs = this.getClassScheduleIDs();
            ArrayOfInt rhsClassScheduleIDs;
            rhsClassScheduleIDs = that.getClassScheduleIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classScheduleIDs", lhsClassScheduleIDs), LocatorUtils.property(thatLocator, "classScheduleIDs", rhsClassScheduleIDs), lhsClassScheduleIDs, rhsClassScheduleIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsCourseIDs;
            lhsCourseIDs = this.getCourseIDs();
            ArrayOfInt rhsCourseIDs;
            rhsCourseIDs = that.getCourseIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courseIDs", lhsCourseIDs), LocatorUtils.property(thatLocator, "courseIDs", rhsCourseIDs), lhsCourseIDs, rhsCourseIDs)) {
                return false;
            }
        }
        {
            Date lhsEnrollDateForward;
            lhsEnrollDateForward = this.getEnrollDateForward();
            Date rhsEnrollDateForward;
            rhsEnrollDateForward = that.getEnrollDateForward();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enrollDateForward", lhsEnrollDateForward), LocatorUtils.property(thatLocator, "enrollDateForward", rhsEnrollDateForward), lhsEnrollDateForward, rhsEnrollDateForward)) {
                return false;
            }
        }
        {
            ArrayOfDateTime lhsEnrollOpen;
            lhsEnrollOpen = this.getEnrollOpen();
            ArrayOfDateTime rhsEnrollOpen;
            rhsEnrollOpen = that.getEnrollOpen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enrollOpen", lhsEnrollOpen), LocatorUtils.property(thatLocator, "enrollOpen", rhsEnrollOpen), lhsEnrollOpen, rhsEnrollOpen)) {
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
            Boolean lhsSendEmail;
            lhsSendEmail = this.getSendEmail();
            Boolean rhsSendEmail;
            rhsSendEmail = that.getSendEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendEmail", lhsSendEmail), LocatorUtils.property(thatLocator, "sendEmail", rhsSendEmail), lhsSendEmail, rhsSendEmail)) {
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
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            strategy.appendField(locator, this, "classScheduleIDs", buffer, theClassScheduleIDs);
        }
        {
            ArrayOfInt theCourseIDs;
            theCourseIDs = this.getCourseIDs();
            strategy.appendField(locator, this, "courseIDs", buffer, theCourseIDs);
        }
        {
            Date theEnrollDateForward;
            theEnrollDateForward = this.getEnrollDateForward();
            strategy.appendField(locator, this, "enrollDateForward", buffer, theEnrollDateForward);
        }
        {
            ArrayOfDateTime theEnrollOpen;
            theEnrollOpen = this.getEnrollOpen();
            strategy.appendField(locator, this, "enrollOpen", buffer, theEnrollOpen);
        }
        {
            Boolean theTest;
            theTest = this.getTest();
            strategy.appendField(locator, this, "test", buffer, theTest);
        }
        {
            Boolean theSendEmail;
            theSendEmail = this.getSendEmail();
            strategy.appendField(locator, this, "sendEmail", buffer, theSendEmail);
        }
        {
            Boolean theWaitlist;
            theWaitlist = this.getWaitlist();
            strategy.appendField(locator, this, "waitlist", buffer, theWaitlist);
        }
        return buffer;
    }

}
