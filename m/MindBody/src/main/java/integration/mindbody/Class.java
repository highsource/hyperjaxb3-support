
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
 * <p>Java class for Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Class">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ClassScheduleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Visits" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfVisit" minOccurs="0"/>
 *         &lt;element name="Clients" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClient" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://clients.mindbodyonline.com/api/0_5}Resource" minOccurs="0"/>
 *         &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalBooked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalBookedWaitlist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebBooked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SemesterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Substitute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWaitlistAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnrolled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClassDescription" type="{http://clients.mindbodyonline.com/api/0_5}ClassDescription" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "classScheduleID",
    "visits",
    "clients",
    "location",
    "resource",
    "maxCapacity",
    "webCapacity",
    "totalBooked",
    "totalBookedWaitlist",
    "webBooked",
    "semesterID",
    "isCanceled",
    "substitute",
    "active",
    "isWaitlistAvailable",
    "isEnrolled",
    "hideCancel",
    "action",
    "id",
    "isAvailable",
    "startDateTime",
    "endDateTime",
    "classDescription",
    "staff"
})
@Entity(name = "Class")
@Table(name = "CLASS_")
public class Class
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassScheduleID")
    protected Integer classScheduleID;
    @XmlElement(name = "Visits")
    protected ArrayOfVisit visits;
    @XmlElement(name = "Clients")
    protected ArrayOfClient clients;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Resource")
    protected Resource resource;
    @XmlElement(name = "MaxCapacity", required = true, type = Integer.class, nillable = true)
    protected Integer maxCapacity;
    @XmlElement(name = "WebCapacity", required = true, type = Integer.class, nillable = true)
    protected Integer webCapacity;
    @XmlElement(name = "TotalBooked", required = true, type = Integer.class, nillable = true)
    protected Integer totalBooked;
    @XmlElement(name = "TotalBookedWaitlist", required = true, type = Integer.class, nillable = true)
    protected Integer totalBookedWaitlist;
    @XmlElement(name = "WebBooked", required = true, type = Integer.class, nillable = true)
    protected Integer webBooked;
    @XmlElement(name = "SemesterID", nillable = true)
    protected Integer semesterID;
    @XmlElement(name = "IsCanceled")
    protected Boolean isCanceled;
    @XmlElement(name = "Substitute")
    protected Boolean substitute;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "IsWaitlistAvailable")
    protected Boolean isWaitlistAvailable;
    @XmlElement(name = "IsEnrolled")
    protected Boolean isEnrolled;
    @XmlElement(name = "HideCancel")
    protected Boolean hideCancel;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Integer id;
    @XmlElement(name = "IsAvailable", nillable = true)
    protected Boolean isAvailable;
    @XmlElement(name = "StartDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDateTime;
    @XmlElement(name = "EndDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "ClassDescription")
    protected ClassDescription classDescription;
    @XmlElement(name = "Staff")
    protected Staff staff;

    /**
     * Gets the value of the classScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "CLASSSCHEDULEID", precision = 10, scale = 0)
    public Integer getClassScheduleID() {
        return classScheduleID;
    }

    /**
     * Sets the value of the classScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassScheduleID(Integer value) {
        this.classScheduleID = value;
    }

    /**
     * Gets the value of the visits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisit }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfVisit.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VISITS_CLASS__HJID")
    public ArrayOfVisit getVisits() {
        return visits;
    }

    /**
     * Sets the value of the visits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisit }
     *     
     */
    public void setVisits(ArrayOfVisit value) {
        this.visits = value;
    }

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClient }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfClient.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENTS_CLASS__HJID")
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
    @JoinColumns({
        @JoinColumn(name = "LOCATION__CLASS__ID"),
        @JoinColumn(name = "LOCATION__CLASS__HJID")
    })
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

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    @ManyToOne(targetEntity = Resource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumns({
        @JoinColumn(name = "RESOURCE__CLASS__ID"),
        @JoinColumn(name = "RESOURCE__CLASS__HJID")
    })
    public Resource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

    /**
     * Gets the value of the maxCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "MAXCAPACITY", precision = 10, scale = 0)
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCapacity(Integer value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the webCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "WEBCAPACITY", precision = 10, scale = 0)
    public Integer getWebCapacity() {
        return webCapacity;
    }

    /**
     * Sets the value of the webCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebCapacity(Integer value) {
        this.webCapacity = value;
    }

    /**
     * Gets the value of the totalBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "TOTALBOOKED", precision = 10, scale = 0)
    public Integer getTotalBooked() {
        return totalBooked;
    }

    /**
     * Sets the value of the totalBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBooked(Integer value) {
        this.totalBooked = value;
    }

    /**
     * Gets the value of the totalBookedWaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "TOTALBOOKEDWAITLIST", precision = 10, scale = 0)
    public Integer getTotalBookedWaitlist() {
        return totalBookedWaitlist;
    }

    /**
     * Sets the value of the totalBookedWaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBookedWaitlist(Integer value) {
        this.totalBookedWaitlist = value;
    }

    /**
     * Gets the value of the webBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "WEBBOOKED", precision = 10, scale = 0)
    public Integer getWebBooked() {
        return webBooked;
    }

    /**
     * Sets the value of the webBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebBooked(Integer value) {
        this.webBooked = value;
    }

    /**
     * Gets the value of the semesterID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "SEMESTERID", precision = 10, scale = 0)
    public Integer getSemesterID() {
        return semesterID;
    }

    /**
     * Sets the value of the semesterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSemesterID(Integer value) {
        this.semesterID = value;
    }

    /**
     * Gets the value of the isCanceled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ISCANCELED")
    public Boolean getIsCanceled() {
        return isCanceled;
    }

    /**
     * Sets the value of the isCanceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCanceled(Boolean value) {
        this.isCanceled = value;
    }

    /**
     * Gets the value of the substitute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "SUBSTITUTE")
    public Boolean getSubstitute() {
        return substitute;
    }

    /**
     * Sets the value of the substitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitute(Boolean value) {
        this.substitute = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ACTIVE")
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the isWaitlistAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ISWAITLISTAVAILABLE")
    public Boolean getIsWaitlistAvailable() {
        return isWaitlistAvailable;
    }

    /**
     * Sets the value of the isWaitlistAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaitlistAvailable(Boolean value) {
        this.isWaitlistAvailable = value;
    }

    /**
     * Gets the value of the isEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ISENROLLED")
    public Boolean getIsEnrolled() {
        return isEnrolled;
    }

    /**
     * Sets the value of the isEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnrolled(Boolean value) {
        this.isEnrolled = value;
    }

    /**
     * Gets the value of the hideCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "HIDECANCEL")
    public Boolean getHideCancel() {
        return hideCancel;
    }

    /**
     * Sets the value of the hideCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideCancel(Boolean value) {
        this.hideCancel = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    @Basic
    @Column(name = "ACTION_", length = 255)
    @Enumerated(EnumType.STRING)
    public ActionCode getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setAction(ActionCode value) {
        this.action = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Id
    @Column(name = "ID", scale = 0)
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ISAVAILABLE")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
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
    @Column(name = "STARTDATETIME")
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
    @Column(name = "ENDDATETIME")
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
     * Gets the value of the classDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDescription }
     *     
     */
    @ManyToOne(targetEntity = ClassDescription.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumns({
        @JoinColumn(name = "CLASSDESCRIPTION_CLASS__ID"),
        @JoinColumn(name = "CLASSDESCRIPTION_CLASS__HJID")
    })
    public ClassDescription getClassDescription() {
        return classDescription;
    }

    /**
     * Sets the value of the classDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescription }
     *     
     */
    public void setClassDescription(ClassDescription value) {
        this.classDescription = value;
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
    @JoinColumns({
        @JoinColumn(name = "STAFF_CLASS__ID"),
        @JoinColumn(name = "STAFF_CLASS__HJID")
    })
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theClassScheduleID;
            theClassScheduleID = this.getClassScheduleID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classScheduleID", theClassScheduleID), currentHashCode, theClassScheduleID);
        }
        {
            ArrayOfVisit theVisits;
            theVisits = this.getVisits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "visits", theVisits), currentHashCode, theVisits);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clients", theClients), currentHashCode, theClients);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            Resource theResource;
            theResource = this.getResource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resource", theResource), currentHashCode, theResource);
        }
        {
            Integer theMaxCapacity;
            theMaxCapacity = this.getMaxCapacity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxCapacity", theMaxCapacity), currentHashCode, theMaxCapacity);
        }
        {
            Integer theWebCapacity;
            theWebCapacity = this.getWebCapacity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webCapacity", theWebCapacity), currentHashCode, theWebCapacity);
        }
        {
            Integer theTotalBooked;
            theTotalBooked = this.getTotalBooked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalBooked", theTotalBooked), currentHashCode, theTotalBooked);
        }
        {
            Integer theTotalBookedWaitlist;
            theTotalBookedWaitlist = this.getTotalBookedWaitlist();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalBookedWaitlist", theTotalBookedWaitlist), currentHashCode, theTotalBookedWaitlist);
        }
        {
            Integer theWebBooked;
            theWebBooked = this.getWebBooked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webBooked", theWebBooked), currentHashCode, theWebBooked);
        }
        {
            Integer theSemesterID;
            theSemesterID = this.getSemesterID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semesterID", theSemesterID), currentHashCode, theSemesterID);
        }
        {
            Boolean theIsCanceled;
            theIsCanceled = this.getIsCanceled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCanceled", theIsCanceled), currentHashCode, theIsCanceled);
        }
        {
            Boolean theSubstitute;
            theSubstitute = this.getSubstitute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substitute", theSubstitute), currentHashCode, theSubstitute);
        }
        {
            Boolean theActive;
            theActive = this.getActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            Boolean theIsWaitlistAvailable;
            theIsWaitlistAvailable = this.getIsWaitlistAvailable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isWaitlistAvailable", theIsWaitlistAvailable), currentHashCode, theIsWaitlistAvailable);
        }
        {
            Boolean theIsEnrolled;
            theIsEnrolled = this.getIsEnrolled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isEnrolled", theIsEnrolled), currentHashCode, theIsEnrolled);
        }
        {
            Boolean theHideCancel;
            theHideCancel = this.getHideCancel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hideCancel", theHideCancel), currentHashCode, theHideCancel);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            Integer theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Boolean theIsAvailable;
            theIsAvailable = this.getIsAvailable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAvailable", theIsAvailable), currentHashCode, theIsAvailable);
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
            ClassDescription theClassDescription;
            theClassDescription = this.getClassDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescription", theClassDescription), currentHashCode, theClassDescription);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staff", theStaff), currentHashCode, theStaff);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Class)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Class that = ((Class) object);
        {
            Integer lhsClassScheduleID;
            lhsClassScheduleID = this.getClassScheduleID();
            Integer rhsClassScheduleID;
            rhsClassScheduleID = that.getClassScheduleID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classScheduleID", lhsClassScheduleID), LocatorUtils.property(thatLocator, "classScheduleID", rhsClassScheduleID), lhsClassScheduleID, rhsClassScheduleID)) {
                return false;
            }
        }
        {
            ArrayOfVisit lhsVisits;
            lhsVisits = this.getVisits();
            ArrayOfVisit rhsVisits;
            rhsVisits = that.getVisits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "visits", lhsVisits), LocatorUtils.property(thatLocator, "visits", rhsVisits), lhsVisits, rhsVisits)) {
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
            Location lhsLocation;
            lhsLocation = this.getLocation();
            Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            Resource lhsResource;
            lhsResource = this.getResource();
            Resource rhsResource;
            rhsResource = that.getResource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resource", lhsResource), LocatorUtils.property(thatLocator, "resource", rhsResource), lhsResource, rhsResource)) {
                return false;
            }
        }
        {
            Integer lhsMaxCapacity;
            lhsMaxCapacity = this.getMaxCapacity();
            Integer rhsMaxCapacity;
            rhsMaxCapacity = that.getMaxCapacity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxCapacity", lhsMaxCapacity), LocatorUtils.property(thatLocator, "maxCapacity", rhsMaxCapacity), lhsMaxCapacity, rhsMaxCapacity)) {
                return false;
            }
        }
        {
            Integer lhsWebCapacity;
            lhsWebCapacity = this.getWebCapacity();
            Integer rhsWebCapacity;
            rhsWebCapacity = that.getWebCapacity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webCapacity", lhsWebCapacity), LocatorUtils.property(thatLocator, "webCapacity", rhsWebCapacity), lhsWebCapacity, rhsWebCapacity)) {
                return false;
            }
        }
        {
            Integer lhsTotalBooked;
            lhsTotalBooked = this.getTotalBooked();
            Integer rhsTotalBooked;
            rhsTotalBooked = that.getTotalBooked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalBooked", lhsTotalBooked), LocatorUtils.property(thatLocator, "totalBooked", rhsTotalBooked), lhsTotalBooked, rhsTotalBooked)) {
                return false;
            }
        }
        {
            Integer lhsTotalBookedWaitlist;
            lhsTotalBookedWaitlist = this.getTotalBookedWaitlist();
            Integer rhsTotalBookedWaitlist;
            rhsTotalBookedWaitlist = that.getTotalBookedWaitlist();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalBookedWaitlist", lhsTotalBookedWaitlist), LocatorUtils.property(thatLocator, "totalBookedWaitlist", rhsTotalBookedWaitlist), lhsTotalBookedWaitlist, rhsTotalBookedWaitlist)) {
                return false;
            }
        }
        {
            Integer lhsWebBooked;
            lhsWebBooked = this.getWebBooked();
            Integer rhsWebBooked;
            rhsWebBooked = that.getWebBooked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webBooked", lhsWebBooked), LocatorUtils.property(thatLocator, "webBooked", rhsWebBooked), lhsWebBooked, rhsWebBooked)) {
                return false;
            }
        }
        {
            Integer lhsSemesterID;
            lhsSemesterID = this.getSemesterID();
            Integer rhsSemesterID;
            rhsSemesterID = that.getSemesterID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semesterID", lhsSemesterID), LocatorUtils.property(thatLocator, "semesterID", rhsSemesterID), lhsSemesterID, rhsSemesterID)) {
                return false;
            }
        }
        {
            Boolean lhsIsCanceled;
            lhsIsCanceled = this.getIsCanceled();
            Boolean rhsIsCanceled;
            rhsIsCanceled = that.getIsCanceled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCanceled", lhsIsCanceled), LocatorUtils.property(thatLocator, "isCanceled", rhsIsCanceled), lhsIsCanceled, rhsIsCanceled)) {
                return false;
            }
        }
        {
            Boolean lhsSubstitute;
            lhsSubstitute = this.getSubstitute();
            Boolean rhsSubstitute;
            rhsSubstitute = that.getSubstitute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substitute", lhsSubstitute), LocatorUtils.property(thatLocator, "substitute", rhsSubstitute), lhsSubstitute, rhsSubstitute)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.getActive();
            Boolean rhsActive;
            rhsActive = that.getActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        {
            Boolean lhsIsWaitlistAvailable;
            lhsIsWaitlistAvailable = this.getIsWaitlistAvailable();
            Boolean rhsIsWaitlistAvailable;
            rhsIsWaitlistAvailable = that.getIsWaitlistAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isWaitlistAvailable", lhsIsWaitlistAvailable), LocatorUtils.property(thatLocator, "isWaitlistAvailable", rhsIsWaitlistAvailable), lhsIsWaitlistAvailable, rhsIsWaitlistAvailable)) {
                return false;
            }
        }
        {
            Boolean lhsIsEnrolled;
            lhsIsEnrolled = this.getIsEnrolled();
            Boolean rhsIsEnrolled;
            rhsIsEnrolled = that.getIsEnrolled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isEnrolled", lhsIsEnrolled), LocatorUtils.property(thatLocator, "isEnrolled", rhsIsEnrolled), lhsIsEnrolled, rhsIsEnrolled)) {
                return false;
            }
        }
        {
            Boolean lhsHideCancel;
            lhsHideCancel = this.getHideCancel();
            Boolean rhsHideCancel;
            rhsHideCancel = that.getHideCancel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hideCancel", lhsHideCancel), LocatorUtils.property(thatLocator, "hideCancel", rhsHideCancel), lhsHideCancel, rhsHideCancel)) {
                return false;
            }
        }
        {
            ActionCode lhsAction;
            lhsAction = this.getAction();
            ActionCode rhsAction;
            rhsAction = that.getAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction)) {
                return false;
            }
        }
        {
            Integer lhsID;
            lhsID = this.getID();
            Integer rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Boolean lhsIsAvailable;
            lhsIsAvailable = this.getIsAvailable();
            Boolean rhsIsAvailable;
            rhsIsAvailable = that.getIsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAvailable", lhsIsAvailable), LocatorUtils.property(thatLocator, "isAvailable", rhsIsAvailable), lhsIsAvailable, rhsIsAvailable)) {
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
            ClassDescription lhsClassDescription;
            lhsClassDescription = this.getClassDescription();
            ClassDescription rhsClassDescription;
            rhsClassDescription = that.getClassDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescription", lhsClassDescription), LocatorUtils.property(thatLocator, "classDescription", rhsClassDescription), lhsClassDescription, rhsClassDescription)) {
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
            Integer theClassScheduleID;
            theClassScheduleID = this.getClassScheduleID();
            strategy.appendField(locator, this, "classScheduleID", buffer, theClassScheduleID);
        }
        {
            ArrayOfVisit theVisits;
            theVisits = this.getVisits();
            strategy.appendField(locator, this, "visits", buffer, theVisits);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            strategy.appendField(locator, this, "clients", buffer, theClients);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            Resource theResource;
            theResource = this.getResource();
            strategy.appendField(locator, this, "resource", buffer, theResource);
        }
        {
            Integer theMaxCapacity;
            theMaxCapacity = this.getMaxCapacity();
            strategy.appendField(locator, this, "maxCapacity", buffer, theMaxCapacity);
        }
        {
            Integer theWebCapacity;
            theWebCapacity = this.getWebCapacity();
            strategy.appendField(locator, this, "webCapacity", buffer, theWebCapacity);
        }
        {
            Integer theTotalBooked;
            theTotalBooked = this.getTotalBooked();
            strategy.appendField(locator, this, "totalBooked", buffer, theTotalBooked);
        }
        {
            Integer theTotalBookedWaitlist;
            theTotalBookedWaitlist = this.getTotalBookedWaitlist();
            strategy.appendField(locator, this, "totalBookedWaitlist", buffer, theTotalBookedWaitlist);
        }
        {
            Integer theWebBooked;
            theWebBooked = this.getWebBooked();
            strategy.appendField(locator, this, "webBooked", buffer, theWebBooked);
        }
        {
            Integer theSemesterID;
            theSemesterID = this.getSemesterID();
            strategy.appendField(locator, this, "semesterID", buffer, theSemesterID);
        }
        {
            Boolean theIsCanceled;
            theIsCanceled = this.getIsCanceled();
            strategy.appendField(locator, this, "isCanceled", buffer, theIsCanceled);
        }
        {
            Boolean theSubstitute;
            theSubstitute = this.getSubstitute();
            strategy.appendField(locator, this, "substitute", buffer, theSubstitute);
        }
        {
            Boolean theActive;
            theActive = this.getActive();
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        {
            Boolean theIsWaitlistAvailable;
            theIsWaitlistAvailable = this.getIsWaitlistAvailable();
            strategy.appendField(locator, this, "isWaitlistAvailable", buffer, theIsWaitlistAvailable);
        }
        {
            Boolean theIsEnrolled;
            theIsEnrolled = this.getIsEnrolled();
            strategy.appendField(locator, this, "isEnrolled", buffer, theIsEnrolled);
        }
        {
            Boolean theHideCancel;
            theHideCancel = this.getHideCancel();
            strategy.appendField(locator, this, "hideCancel", buffer, theHideCancel);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            Integer theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Boolean theIsAvailable;
            theIsAvailable = this.getIsAvailable();
            strategy.appendField(locator, this, "isAvailable", buffer, theIsAvailable);
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
            ClassDescription theClassDescription;
            theClassDescription = this.getClassDescription();
            strategy.appendField(locator, this, "classDescription", buffer, theClassDescription);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            strategy.appendField(locator, this, "staff", buffer, theStaff);
        }
        return buffer;
    }

}
