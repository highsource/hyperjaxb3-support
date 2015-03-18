
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
 * <p>Java class for GetWaitlistEntriesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWaitlistEntriesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassScheduleIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="WaitlistEntryIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClassIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="HidePastEntries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWaitlistEntriesRequest", propOrder = {
    "classScheduleIDs",
    "clientIDs",
    "waitlistEntryIDs",
    "classIDs",
    "hidePastEntries"
})
public class GetWaitlistEntriesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassScheduleIDs")
    protected ArrayOfInt classScheduleIDs;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "WaitlistEntryIDs")
    protected ArrayOfInt waitlistEntryIDs;
    @XmlElement(name = "ClassIDs")
    protected ArrayOfInt classIDs;
    @XmlElement(name = "HidePastEntries", required = true, type = Boolean.class, nillable = true)
    protected Boolean hidePastEntries;

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
     * Gets the value of the waitlistEntryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getWaitlistEntryIDs() {
        return waitlistEntryIDs;
    }

    /**
     * Sets the value of the waitlistEntryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setWaitlistEntryIDs(ArrayOfInt value) {
        this.waitlistEntryIDs = value;
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
     * Gets the value of the hidePastEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHidePastEntries() {
        return hidePastEntries;
    }

    /**
     * Sets the value of the hidePastEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidePastEntries(Boolean value) {
        this.hidePastEntries = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classScheduleIDs", theClassScheduleIDs), currentHashCode, theClassScheduleIDs);
        }
        {
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDs", theClientIDs), currentHashCode, theClientIDs);
        }
        {
            ArrayOfInt theWaitlistEntryIDs;
            theWaitlistEntryIDs = this.getWaitlistEntryIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitlistEntryIDs", theWaitlistEntryIDs), currentHashCode, theWaitlistEntryIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classIDs", theClassIDs), currentHashCode, theClassIDs);
        }
        {
            Boolean theHidePastEntries;
            theHidePastEntries = this.getHidePastEntries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hidePastEntries", theHidePastEntries), currentHashCode, theHidePastEntries);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetWaitlistEntriesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetWaitlistEntriesRequest that = ((GetWaitlistEntriesRequest) object);
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
            ArrayOfString lhsClientIDs;
            lhsClientIDs = this.getClientIDs();
            ArrayOfString rhsClientIDs;
            rhsClientIDs = that.getClientIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIDs", lhsClientIDs), LocatorUtils.property(thatLocator, "clientIDs", rhsClientIDs), lhsClientIDs, rhsClientIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsWaitlistEntryIDs;
            lhsWaitlistEntryIDs = this.getWaitlistEntryIDs();
            ArrayOfInt rhsWaitlistEntryIDs;
            rhsWaitlistEntryIDs = that.getWaitlistEntryIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waitlistEntryIDs", lhsWaitlistEntryIDs), LocatorUtils.property(thatLocator, "waitlistEntryIDs", rhsWaitlistEntryIDs), lhsWaitlistEntryIDs, rhsWaitlistEntryIDs)) {
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
            Boolean lhsHidePastEntries;
            lhsHidePastEntries = this.getHidePastEntries();
            Boolean rhsHidePastEntries;
            rhsHidePastEntries = that.getHidePastEntries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hidePastEntries", lhsHidePastEntries), LocatorUtils.property(thatLocator, "hidePastEntries", rhsHidePastEntries), lhsHidePastEntries, rhsHidePastEntries)) {
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
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            strategy.appendField(locator, this, "classScheduleIDs", buffer, theClassScheduleIDs);
        }
        {
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            strategy.appendField(locator, this, "clientIDs", buffer, theClientIDs);
        }
        {
            ArrayOfInt theWaitlistEntryIDs;
            theWaitlistEntryIDs = this.getWaitlistEntryIDs();
            strategy.appendField(locator, this, "waitlistEntryIDs", buffer, theWaitlistEntryIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            strategy.appendField(locator, this, "classIDs", buffer, theClassIDs);
        }
        {
            Boolean theHidePastEntries;
            theHidePastEntries = this.getHidePastEntries();
            strategy.appendField(locator, this, "hidePastEntries", buffer, theHidePastEntries);
        }
        return buffer;
    }

}
