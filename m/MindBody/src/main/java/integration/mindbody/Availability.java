
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
 * <p>Java class for Availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Availability">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}ScheduleItem">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="SessionType" type="{http://clients.mindbodyonline.com/api/0_5}SessionType" minOccurs="0"/>
 *         &lt;element name="Programs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfProgram" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BookableEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Availability", propOrder = {
    "id",
    "staff",
    "sessionType",
    "programs",
    "startDateTime",
    "endDateTime",
    "bookableEndDateTime",
    "location"
})
@Entity(name = "Availability")
@Table(name = "AVAILABILITY")
@Inheritance(strategy = InheritanceType.JOINED)
public class Availability
    extends ScheduleItem
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "SessionType")
    protected SessionType sessionType;
    @XmlElement(name = "Programs")
    protected ArrayOfProgram programs;
    @XmlElement(name = "StartDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDateTime;
    @XmlElement(name = "EndDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "BookableEndDateTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date bookableEndDateTime;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Gets the value of the id property.
     * 
     */
    @Id
    @Column(name = "ID", scale = 0)
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    @ManyToOne(targetEntity = Staff.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STAFF_AVAILABILITY_ID")
    public Staff getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setStaff(Staff value) {
        this.staff = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionType }
     *     
     */
    @ManyToOne(targetEntity = SessionType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SESSION_TYPE_AVAILABILITY_ID")
    public SessionType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionType }
     *     
     */
    public void setSessionType(SessionType value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgram }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfProgram.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROGRAMS_AVAILABILITY_HJID")
    public ArrayOfProgram getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgram }
     *     
     */
    public void setPrograms(ArrayOfProgram value) {
        this.programs = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
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
    @Basic
    @Column(name = "END_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
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
     * Gets the value of the bookableEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BOOKABLE_END_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBookableEndDateTime() {
        return bookableEndDateTime;
    }

    /**
     * Sets the value of the bookableEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookableEndDateTime(Date value) {
        this.bookableEndDateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    @ManyToOne(targetEntity = Location.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATION__AVAILABILITY_ID")
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            int theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staff", theStaff), currentHashCode, theStaff);
        }
        {
            SessionType theSessionType;
            theSessionType = this.getSessionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionType", theSessionType), currentHashCode, theSessionType);
        }
        {
            ArrayOfProgram thePrograms;
            thePrograms = this.getPrograms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programs", thePrograms), currentHashCode, thePrograms);
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
            Date theBookableEndDateTime;
            theBookableEndDateTime = this.getBookableEndDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookableEndDateTime", theBookableEndDateTime), currentHashCode, theBookableEndDateTime);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Availability)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Availability that = ((Availability) object);
        {
            int lhsID;
            lhsID = this.getID();
            int rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Staff lhsStaff;
            lhsStaff = this.getStaff();
            Staff rhsStaff;
            rhsStaff = that.getStaff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staff", lhsStaff), LocatorUtils.property(thatLocator, "staff", rhsStaff), lhsStaff, rhsStaff)) {
                return false;
            }
        }
        {
            SessionType lhsSessionType;
            lhsSessionType = this.getSessionType();
            SessionType rhsSessionType;
            rhsSessionType = that.getSessionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionType", lhsSessionType), LocatorUtils.property(thatLocator, "sessionType", rhsSessionType), lhsSessionType, rhsSessionType)) {
                return false;
            }
        }
        {
            ArrayOfProgram lhsPrograms;
            lhsPrograms = this.getPrograms();
            ArrayOfProgram rhsPrograms;
            rhsPrograms = that.getPrograms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programs", lhsPrograms), LocatorUtils.property(thatLocator, "programs", rhsPrograms), lhsPrograms, rhsPrograms)) {
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
            Date lhsBookableEndDateTime;
            lhsBookableEndDateTime = this.getBookableEndDateTime();
            Date rhsBookableEndDateTime;
            rhsBookableEndDateTime = that.getBookableEndDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookableEndDateTime", lhsBookableEndDateTime), LocatorUtils.property(thatLocator, "bookableEndDateTime", rhsBookableEndDateTime), lhsBookableEndDateTime, rhsBookableEndDateTime)) {
                return false;
            }
        }
        {
            Location lhsLocation;
            lhsLocation = this.getLocation();
            Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
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
            int theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            strategy.appendField(locator, this, "staff", buffer, theStaff);
        }
        {
            SessionType theSessionType;
            theSessionType = this.getSessionType();
            strategy.appendField(locator, this, "sessionType", buffer, theSessionType);
        }
        {
            ArrayOfProgram thePrograms;
            thePrograms = this.getPrograms();
            strategy.appendField(locator, this, "programs", buffer, thePrograms);
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
            Date theBookableEndDateTime;
            theBookableEndDateTime = this.getBookableEndDateTime();
            strategy.appendField(locator, this, "bookableEndDateTime", buffer, theBookableEndDateTime);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        return buffer;
    }

}
