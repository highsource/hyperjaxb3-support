
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
 * <p>Java class for GetClassesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptionIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClassIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SemesterIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="HideCanceledClasses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SchedulingWindow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassesRequest", propOrder = {
    "classDescriptionIDs",
    "classIDs",
    "staffIDs",
    "startDateTime",
    "endDateTime",
    "clientID",
    "programIDs",
    "sessionTypeIDs",
    "locationIDs",
    "semesterIDs",
    "hideCanceledClasses",
    "schedulingWindow"
})
public class GetClassesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassDescriptionIDs")
    protected ArrayOfInt classDescriptionIDs;
    @XmlElement(name = "ClassIDs")
    protected ArrayOfInt classIDs;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "StartDateTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDateTime;
    @XmlElement(name = "EndDateTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "LocationIDs")
    protected ArrayOfInt locationIDs;
    @XmlElement(name = "SemesterIDs")
    protected ArrayOfInt semesterIDs;
    @XmlElement(name = "HideCanceledClasses", required = true, type = Boolean.class, nillable = true)
    protected Boolean hideCanceledClasses;
    @XmlElement(name = "SchedulingWindow", required = true, type = Boolean.class, nillable = true)
    protected Boolean schedulingWindow;

    /**
     * Gets the value of the classDescriptionIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassDescriptionIDs() {
        return classDescriptionIDs;
    }

    /**
     * Sets the value of the classDescriptionIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassDescriptionIDs(ArrayOfInt value) {
        this.classDescriptionIDs = value;
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
     * Gets the value of the staffIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getStaffIDs() {
        return staffIDs;
    }

    /**
     * Sets the value of the staffIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setStaffIDs(ArrayOfLong value) {
        this.staffIDs = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(Date value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(Date value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the programIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProgramIDs() {
        return programIDs;
    }

    /**
     * Sets the value of the programIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProgramIDs(ArrayOfInt value) {
        this.programIDs = value;
    }

    /**
     * Gets the value of the sessionTypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSessionTypeIDs() {
        return sessionTypeIDs;
    }

    /**
     * Sets the value of the sessionTypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSessionTypeIDs(ArrayOfInt value) {
        this.sessionTypeIDs = value;
    }

    /**
     * Gets the value of the locationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationIDs() {
        return locationIDs;
    }

    /**
     * Sets the value of the locationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationIDs(ArrayOfInt value) {
        this.locationIDs = value;
    }

    /**
     * Gets the value of the semesterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSemesterIDs() {
        return semesterIDs;
    }

    /**
     * Sets the value of the semesterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSemesterIDs(ArrayOfInt value) {
        this.semesterIDs = value;
    }

    /**
     * Gets the value of the hideCanceledClasses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHideCanceledClasses() {
        return hideCanceledClasses;
    }

    /**
     * Sets the value of the hideCanceledClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideCanceledClasses(Boolean value) {
        this.hideCanceledClasses = value;
    }

    /**
     * Gets the value of the schedulingWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSchedulingWindow() {
        return schedulingWindow;
    }

    /**
     * Sets the value of the schedulingWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchedulingWindow(Boolean value) {
        this.schedulingWindow = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfInt theClassDescriptionIDs;
            theClassDescriptionIDs = this.getClassDescriptionIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescriptionIDs", theClassDescriptionIDs), currentHashCode, theClassDescriptionIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classIDs", theClassIDs), currentHashCode, theClassIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staffIDs", theStaffIDs), currentHashCode, theStaffIDs);
        }
        {
            Date theStartDateTime;
            theStartDateTime = this.getStartDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDateTime", theStartDateTime), currentHashCode, theStartDateTime);
        }
        {
            Date theEndDateTime;
            theEndDateTime = this.getEndDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDateTime", theEndDateTime), currentHashCode, theEndDateTime);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programIDs", theProgramIDs), currentHashCode, theProgramIDs);
        }
        {
            ArrayOfInt theSessionTypeIDs;
            theSessionTypeIDs = this.getSessionTypeIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionTypeIDs", theSessionTypeIDs), currentHashCode, theSessionTypeIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationIDs", theLocationIDs), currentHashCode, theLocationIDs);
        }
        {
            ArrayOfInt theSemesterIDs;
            theSemesterIDs = this.getSemesterIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semesterIDs", theSemesterIDs), currentHashCode, theSemesterIDs);
        }
        {
            Boolean theHideCanceledClasses;
            theHideCanceledClasses = this.getHideCanceledClasses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hideCanceledClasses", theHideCanceledClasses), currentHashCode, theHideCanceledClasses);
        }
        {
            Boolean theSchedulingWindow;
            theSchedulingWindow = this.getSchedulingWindow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulingWindow", theSchedulingWindow), currentHashCode, theSchedulingWindow);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClassesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClassesRequest that = ((GetClassesRequest) object);
        {
            ArrayOfInt lhsClassDescriptionIDs;
            lhsClassDescriptionIDs = this.getClassDescriptionIDs();
            ArrayOfInt rhsClassDescriptionIDs;
            rhsClassDescriptionIDs = that.getClassDescriptionIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescriptionIDs", lhsClassDescriptionIDs), LocatorUtils.property(thatLocator, "classDescriptionIDs", rhsClassDescriptionIDs), lhsClassDescriptionIDs, rhsClassDescriptionIDs)) {
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
            ArrayOfLong lhsStaffIDs;
            lhsStaffIDs = this.getStaffIDs();
            ArrayOfLong rhsStaffIDs;
            rhsStaffIDs = that.getStaffIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staffIDs", lhsStaffIDs), LocatorUtils.property(thatLocator, "staffIDs", rhsStaffIDs), lhsStaffIDs, rhsStaffIDs)) {
                return false;
            }
        }
        {
            Date lhsStartDateTime;
            lhsStartDateTime = this.getStartDateTime();
            Date rhsStartDateTime;
            rhsStartDateTime = that.getStartDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDateTime", lhsStartDateTime), LocatorUtils.property(thatLocator, "startDateTime", rhsStartDateTime), lhsStartDateTime, rhsStartDateTime)) {
                return false;
            }
        }
        {
            Date lhsEndDateTime;
            lhsEndDateTime = this.getEndDateTime();
            Date rhsEndDateTime;
            rhsEndDateTime = that.getEndDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDateTime", lhsEndDateTime), LocatorUtils.property(thatLocator, "endDateTime", rhsEndDateTime), lhsEndDateTime, rhsEndDateTime)) {
                return false;
            }
        }
        {
            String lhsClientID;
            lhsClientID = this.getClientID();
            String rhsClientID;
            rhsClientID = that.getClientID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientID", lhsClientID), LocatorUtils.property(thatLocator, "clientID", rhsClientID), lhsClientID, rhsClientID)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsProgramIDs;
            lhsProgramIDs = this.getProgramIDs();
            ArrayOfInt rhsProgramIDs;
            rhsProgramIDs = that.getProgramIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programIDs", lhsProgramIDs), LocatorUtils.property(thatLocator, "programIDs", rhsProgramIDs), lhsProgramIDs, rhsProgramIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsSessionTypeIDs;
            lhsSessionTypeIDs = this.getSessionTypeIDs();
            ArrayOfInt rhsSessionTypeIDs;
            rhsSessionTypeIDs = that.getSessionTypeIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionTypeIDs", lhsSessionTypeIDs), LocatorUtils.property(thatLocator, "sessionTypeIDs", rhsSessionTypeIDs), lhsSessionTypeIDs, rhsSessionTypeIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsLocationIDs;
            lhsLocationIDs = this.getLocationIDs();
            ArrayOfInt rhsLocationIDs;
            rhsLocationIDs = that.getLocationIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationIDs", lhsLocationIDs), LocatorUtils.property(thatLocator, "locationIDs", rhsLocationIDs), lhsLocationIDs, rhsLocationIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsSemesterIDs;
            lhsSemesterIDs = this.getSemesterIDs();
            ArrayOfInt rhsSemesterIDs;
            rhsSemesterIDs = that.getSemesterIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semesterIDs", lhsSemesterIDs), LocatorUtils.property(thatLocator, "semesterIDs", rhsSemesterIDs), lhsSemesterIDs, rhsSemesterIDs)) {
                return false;
            }
        }
        {
            Boolean lhsHideCanceledClasses;
            lhsHideCanceledClasses = this.getHideCanceledClasses();
            Boolean rhsHideCanceledClasses;
            rhsHideCanceledClasses = that.getHideCanceledClasses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hideCanceledClasses", lhsHideCanceledClasses), LocatorUtils.property(thatLocator, "hideCanceledClasses", rhsHideCanceledClasses), lhsHideCanceledClasses, rhsHideCanceledClasses)) {
                return false;
            }
        }
        {
            Boolean lhsSchedulingWindow;
            lhsSchedulingWindow = this.getSchedulingWindow();
            Boolean rhsSchedulingWindow;
            rhsSchedulingWindow = that.getSchedulingWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulingWindow", lhsSchedulingWindow), LocatorUtils.property(thatLocator, "schedulingWindow", rhsSchedulingWindow), lhsSchedulingWindow, rhsSchedulingWindow)) {
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
            ArrayOfInt theClassDescriptionIDs;
            theClassDescriptionIDs = this.getClassDescriptionIDs();
            strategy.appendField(locator, this, "classDescriptionIDs", buffer, theClassDescriptionIDs);
        }
        {
            ArrayOfInt theClassIDs;
            theClassIDs = this.getClassIDs();
            strategy.appendField(locator, this, "classIDs", buffer, theClassIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            strategy.appendField(locator, this, "staffIDs", buffer, theStaffIDs);
        }
        {
            Date theStartDateTime;
            theStartDateTime = this.getStartDateTime();
            strategy.appendField(locator, this, "startDateTime", buffer, theStartDateTime);
        }
        {
            Date theEndDateTime;
            theEndDateTime = this.getEndDateTime();
            strategy.appendField(locator, this, "endDateTime", buffer, theEndDateTime);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            strategy.appendField(locator, this, "clientID", buffer, theClientID);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            strategy.appendField(locator, this, "programIDs", buffer, theProgramIDs);
        }
        {
            ArrayOfInt theSessionTypeIDs;
            theSessionTypeIDs = this.getSessionTypeIDs();
            strategy.appendField(locator, this, "sessionTypeIDs", buffer, theSessionTypeIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            strategy.appendField(locator, this, "locationIDs", buffer, theLocationIDs);
        }
        {
            ArrayOfInt theSemesterIDs;
            theSemesterIDs = this.getSemesterIDs();
            strategy.appendField(locator, this, "semesterIDs", buffer, theSemesterIDs);
        }
        {
            Boolean theHideCanceledClasses;
            theHideCanceledClasses = this.getHideCanceledClasses();
            strategy.appendField(locator, this, "hideCanceledClasses", buffer, theHideCanceledClasses);
        }
        {
            Boolean theSchedulingWindow;
            theSchedulingWindow = this.getSchedulingWindow();
            strategy.appendField(locator, this, "schedulingWindow", buffer, theSchedulingWindow);
        }
        return buffer;
    }

}
