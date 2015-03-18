
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
 * <p>Java class for GetClassSchedulesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassSchedulesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClassScheduleIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassSchedulesRequest", propOrder = {
    "locationIDs",
    "classScheduleIDs",
    "staffIDs",
    "programIDs",
    "sessionTypeIDs",
    "startDate",
    "endDate"
})
public class GetClassSchedulesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocationIDs")
    protected ArrayOfInt locationIDs;
    @XmlElement(name = "ClassScheduleIDs")
    protected ArrayOfInt classScheduleIDs;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "StartDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationIDs", theLocationIDs), currentHashCode, theLocationIDs);
        }
        {
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classScheduleIDs", theClassScheduleIDs), currentHashCode, theClassScheduleIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staffIDs", theStaffIDs), currentHashCode, theStaffIDs);
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
            Date theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate);
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClassSchedulesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClassSchedulesRequest that = ((GetClassSchedulesRequest) object);
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
            ArrayOfInt lhsClassScheduleIDs;
            lhsClassScheduleIDs = this.getClassScheduleIDs();
            ArrayOfInt rhsClassScheduleIDs;
            rhsClassScheduleIDs = that.getClassScheduleIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classScheduleIDs", lhsClassScheduleIDs), LocatorUtils.property(thatLocator, "classScheduleIDs", rhsClassScheduleIDs), lhsClassScheduleIDs, rhsClassScheduleIDs)) {
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
            Date lhsStartDate;
            lhsStartDate = this.getStartDate();
            Date rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate)) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate)) {
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
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            strategy.appendField(locator, this, "locationIDs", buffer, theLocationIDs);
        }
        {
            ArrayOfInt theClassScheduleIDs;
            theClassScheduleIDs = this.getClassScheduleIDs();
            strategy.appendField(locator, this, "classScheduleIDs", buffer, theClassScheduleIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            strategy.appendField(locator, this, "staffIDs", buffer, theStaffIDs);
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
            Date theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate);
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate);
        }
        return buffer;
    }

}
