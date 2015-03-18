
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
import javax.persistence.IdClass;
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
 * <p>Java class for ClassSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="Classes" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClass" minOccurs="0"/>
 *         &lt;element name="Clients" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClient" minOccurs="0"/>
 *         &lt;element name="Course" type="{http://clients.mindbodyonline.com/api/0_5}Course" minOccurs="0"/>
 *         &lt;element name="SemesterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassDescription" type="{http://clients.mindbodyonline.com/api/0_5}ClassDescription" minOccurs="0"/>
 *         &lt;element name="DaySunday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayMonday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayTuesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayWednesday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayThursday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayFriday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DaySaturday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOpenEnrollment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowDateForwardEnrollment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
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
@XmlType(name = "ClassSchedule", propOrder = {
    "classes",
    "clients",
    "course",
    "semesterID",
    "isAvailable",
    "action",
    "id",
    "classDescription",
    "daySunday",
    "dayMonday",
    "dayTuesday",
    "dayWednesday",
    "dayThursday",
    "dayFriday",
    "daySaturday",
    "allowOpenEnrollment",
    "allowDateForwardEnrollment",
    "startTime",
    "endTime",
    "startDate",
    "endDate",
    "staff",
    "location"
})
@Entity(name = "ClassSchedule")
@Table(name = "CLASSSCHEDULE")
@IdClass(ClassScheduleId.class)
public class ClassSchedule
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Classes")
    protected ArrayOfClass classes;
    @XmlElement(name = "Clients")
    protected ArrayOfClient clients;
    @XmlElement(name = "Course")
    protected Course course;
    @XmlElement(name = "SemesterID", nillable = true)
    protected Integer semesterID;
    @XmlElement(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Integer id;
    @XmlElement(name = "ClassDescription")
    protected ClassDescription classDescription;
    @XmlElement(name = "DaySunday", nillable = true)
    protected Boolean daySunday;
    @XmlElement(name = "DayMonday", nillable = true)
    protected Boolean dayMonday;
    @XmlElement(name = "DayTuesday", nillable = true)
    protected Boolean dayTuesday;
    @XmlElement(name = "DayWednesday", nillable = true)
    protected Boolean dayWednesday;
    @XmlElement(name = "DayThursday", nillable = true)
    protected Boolean dayThursday;
    @XmlElement(name = "DayFriday", nillable = true)
    protected Boolean dayFriday;
    @XmlElement(name = "DaySaturday", nillable = true)
    protected Boolean daySaturday;
    @XmlElement(name = "AllowOpenEnrollment")
    protected Boolean allowOpenEnrollment;
    @XmlElement(name = "AllowDateForwardEnrollment")
    protected Boolean allowDateForwardEnrollment;
    @XmlElement(name = "StartTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startTime;
    @XmlElement(name = "EndTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClass }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfClass.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLASSES_CLASSSCHEDULE_HJID")
    public ArrayOfClass getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClass }
     *     
     */
    public void setClasses(ArrayOfClass value) {
        this.classes = value;
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
    @JoinColumn(name = "CLIENTS_CLASSSCHEDULE_HJID")
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
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link Course }
     *     
     */
    @ManyToOne(targetEntity = Course.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COURSE_CLASSSCHEDULE_ID")
    public Course getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link Course }
     *     
     */
    public void setCourse(Course value) {
        this.course = value;
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
        @JoinColumn(name = "CLASSDESCRIPTION_CLASSSCHEDU_0"),
        @JoinColumn(name = "CLASSDESCRIPTION_CLASSSCHEDU_1")
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
     * Gets the value of the daySunday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYSUNDAY")
    public Boolean getDaySunday() {
        return daySunday;
    }

    /**
     * Sets the value of the daySunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaySunday(Boolean value) {
        this.daySunday = value;
    }

    /**
     * Gets the value of the dayMonday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYMONDAY")
    public Boolean getDayMonday() {
        return dayMonday;
    }

    /**
     * Sets the value of the dayMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayMonday(Boolean value) {
        this.dayMonday = value;
    }

    /**
     * Gets the value of the dayTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYTUESDAY")
    public Boolean getDayTuesday() {
        return dayTuesday;
    }

    /**
     * Sets the value of the dayTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayTuesday(Boolean value) {
        this.dayTuesday = value;
    }

    /**
     * Gets the value of the dayWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYWEDNESDAY")
    public Boolean getDayWednesday() {
        return dayWednesday;
    }

    /**
     * Sets the value of the dayWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayWednesday(Boolean value) {
        this.dayWednesday = value;
    }

    /**
     * Gets the value of the dayThursday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYTHURSDAY")
    public Boolean getDayThursday() {
        return dayThursday;
    }

    /**
     * Sets the value of the dayThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayThursday(Boolean value) {
        this.dayThursday = value;
    }

    /**
     * Gets the value of the dayFriday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYFRIDAY")
    public Boolean getDayFriday() {
        return dayFriday;
    }

    /**
     * Sets the value of the dayFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayFriday(Boolean value) {
        this.dayFriday = value;
    }

    /**
     * Gets the value of the daySaturday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "DAYSATURDAY")
    public Boolean getDaySaturday() {
        return daySaturday;
    }

    /**
     * Sets the value of the daySaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaySaturday(Boolean value) {
        this.daySaturday = value;
    }

    /**
     * Gets the value of the allowOpenEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ALLOWOPENENROLLMENT")
    public Boolean getAllowOpenEnrollment() {
        return allowOpenEnrollment;
    }

    /**
     * Sets the value of the allowOpenEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOpenEnrollment(Boolean value) {
        this.allowOpenEnrollment = value;
    }

    /**
     * Gets the value of the allowDateForwardEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ALLOWDATEFORWARDENROLLMENT")
    public Boolean getAllowDateForwardEnrollment() {
        return allowDateForwardEnrollment;
    }

    /**
     * Sets the value of the allowDateForwardEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDateForwardEnrollment(Boolean value) {
        this.allowDateForwardEnrollment = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STARTTIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Date value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ENDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Date value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
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
    @Basic
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
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
        @JoinColumn(name = "STAFF_CLASSSCHEDULE_ID"),
        @JoinColumn(name = "STAFF_CLASSSCHEDULE_HJID")
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
        @JoinColumn(name = "LOCATION__CLASSSCHEDULE_ID"),
        @JoinColumn(name = "LOCATION__CLASSSCHEDULE_HJID")
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfClass theClasses;
            theClasses = this.getClasses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classes", theClasses), currentHashCode, theClasses);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clients", theClients), currentHashCode, theClients);
        }
        {
            Course theCourse;
            theCourse = this.getCourse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "course", theCourse), currentHashCode, theCourse);
        }
        {
            Integer theSemesterID;
            theSemesterID = this.getSemesterID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semesterID", theSemesterID), currentHashCode, theSemesterID);
        }
        {
            Boolean theIsAvailable;
            theIsAvailable = this.getIsAvailable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAvailable", theIsAvailable), currentHashCode, theIsAvailable);
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
            ClassDescription theClassDescription;
            theClassDescription = this.getClassDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescription", theClassDescription), currentHashCode, theClassDescription);
        }
        {
            Boolean theDaySunday;
            theDaySunday = this.getDaySunday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daySunday", theDaySunday), currentHashCode, theDaySunday);
        }
        {
            Boolean theDayMonday;
            theDayMonday = this.getDayMonday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayMonday", theDayMonday), currentHashCode, theDayMonday);
        }
        {
            Boolean theDayTuesday;
            theDayTuesday = this.getDayTuesday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayTuesday", theDayTuesday), currentHashCode, theDayTuesday);
        }
        {
            Boolean theDayWednesday;
            theDayWednesday = this.getDayWednesday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayWednesday", theDayWednesday), currentHashCode, theDayWednesday);
        }
        {
            Boolean theDayThursday;
            theDayThursday = this.getDayThursday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayThursday", theDayThursday), currentHashCode, theDayThursday);
        }
        {
            Boolean theDayFriday;
            theDayFriday = this.getDayFriday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayFriday", theDayFriday), currentHashCode, theDayFriday);
        }
        {
            Boolean theDaySaturday;
            theDaySaturday = this.getDaySaturday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daySaturday", theDaySaturday), currentHashCode, theDaySaturday);
        }
        {
            Boolean theAllowOpenEnrollment;
            theAllowOpenEnrollment = this.getAllowOpenEnrollment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOpenEnrollment", theAllowOpenEnrollment), currentHashCode, theAllowOpenEnrollment);
        }
        {
            Boolean theAllowDateForwardEnrollment;
            theAllowDateForwardEnrollment = this.getAllowDateForwardEnrollment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowDateForwardEnrollment", theAllowDateForwardEnrollment), currentHashCode, theAllowDateForwardEnrollment);
        }
        {
            Date theStartTime;
            theStartTime = this.getStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTime", theStartTime), currentHashCode, theStartTime);
        }
        {
            Date theEndTime;
            theEndTime = this.getEndTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTime", theEndTime), currentHashCode, theEndTime);
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
        {
            Staff theStaff;
            theStaff = this.getStaff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staff", theStaff), currentHashCode, theStaff);
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
        if (!(object instanceof ClassSchedule)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ClassSchedule that = ((ClassSchedule) object);
        {
            ArrayOfClass lhsClasses;
            lhsClasses = this.getClasses();
            ArrayOfClass rhsClasses;
            rhsClasses = that.getClasses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classes", lhsClasses), LocatorUtils.property(thatLocator, "classes", rhsClasses), lhsClasses, rhsClasses)) {
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
            Course lhsCourse;
            lhsCourse = this.getCourse();
            Course rhsCourse;
            rhsCourse = that.getCourse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "course", lhsCourse), LocatorUtils.property(thatLocator, "course", rhsCourse), lhsCourse, rhsCourse)) {
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
            Boolean lhsIsAvailable;
            lhsIsAvailable = this.getIsAvailable();
            Boolean rhsIsAvailable;
            rhsIsAvailable = that.getIsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAvailable", lhsIsAvailable), LocatorUtils.property(thatLocator, "isAvailable", rhsIsAvailable), lhsIsAvailable, rhsIsAvailable)) {
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
            ClassDescription lhsClassDescription;
            lhsClassDescription = this.getClassDescription();
            ClassDescription rhsClassDescription;
            rhsClassDescription = that.getClassDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescription", lhsClassDescription), LocatorUtils.property(thatLocator, "classDescription", rhsClassDescription), lhsClassDescription, rhsClassDescription)) {
                return false;
            }
        }
        {
            Boolean lhsDaySunday;
            lhsDaySunday = this.getDaySunday();
            Boolean rhsDaySunday;
            rhsDaySunday = that.getDaySunday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daySunday", lhsDaySunday), LocatorUtils.property(thatLocator, "daySunday", rhsDaySunday), lhsDaySunday, rhsDaySunday)) {
                return false;
            }
        }
        {
            Boolean lhsDayMonday;
            lhsDayMonday = this.getDayMonday();
            Boolean rhsDayMonday;
            rhsDayMonday = that.getDayMonday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayMonday", lhsDayMonday), LocatorUtils.property(thatLocator, "dayMonday", rhsDayMonday), lhsDayMonday, rhsDayMonday)) {
                return false;
            }
        }
        {
            Boolean lhsDayTuesday;
            lhsDayTuesday = this.getDayTuesday();
            Boolean rhsDayTuesday;
            rhsDayTuesday = that.getDayTuesday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayTuesday", lhsDayTuesday), LocatorUtils.property(thatLocator, "dayTuesday", rhsDayTuesday), lhsDayTuesday, rhsDayTuesday)) {
                return false;
            }
        }
        {
            Boolean lhsDayWednesday;
            lhsDayWednesday = this.getDayWednesday();
            Boolean rhsDayWednesday;
            rhsDayWednesday = that.getDayWednesday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayWednesday", lhsDayWednesday), LocatorUtils.property(thatLocator, "dayWednesday", rhsDayWednesday), lhsDayWednesday, rhsDayWednesday)) {
                return false;
            }
        }
        {
            Boolean lhsDayThursday;
            lhsDayThursday = this.getDayThursday();
            Boolean rhsDayThursday;
            rhsDayThursday = that.getDayThursday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayThursday", lhsDayThursday), LocatorUtils.property(thatLocator, "dayThursday", rhsDayThursday), lhsDayThursday, rhsDayThursday)) {
                return false;
            }
        }
        {
            Boolean lhsDayFriday;
            lhsDayFriday = this.getDayFriday();
            Boolean rhsDayFriday;
            rhsDayFriday = that.getDayFriday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayFriday", lhsDayFriday), LocatorUtils.property(thatLocator, "dayFriday", rhsDayFriday), lhsDayFriday, rhsDayFriday)) {
                return false;
            }
        }
        {
            Boolean lhsDaySaturday;
            lhsDaySaturday = this.getDaySaturday();
            Boolean rhsDaySaturday;
            rhsDaySaturday = that.getDaySaturday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daySaturday", lhsDaySaturday), LocatorUtils.property(thatLocator, "daySaturday", rhsDaySaturday), lhsDaySaturday, rhsDaySaturday)) {
                return false;
            }
        }
        {
            Boolean lhsAllowOpenEnrollment;
            lhsAllowOpenEnrollment = this.getAllowOpenEnrollment();
            Boolean rhsAllowOpenEnrollment;
            rhsAllowOpenEnrollment = that.getAllowOpenEnrollment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOpenEnrollment", lhsAllowOpenEnrollment), LocatorUtils.property(thatLocator, "allowOpenEnrollment", rhsAllowOpenEnrollment), lhsAllowOpenEnrollment, rhsAllowOpenEnrollment)) {
                return false;
            }
        }
        {
            Boolean lhsAllowDateForwardEnrollment;
            lhsAllowDateForwardEnrollment = this.getAllowDateForwardEnrollment();
            Boolean rhsAllowDateForwardEnrollment;
            rhsAllowDateForwardEnrollment = that.getAllowDateForwardEnrollment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowDateForwardEnrollment", lhsAllowDateForwardEnrollment), LocatorUtils.property(thatLocator, "allowDateForwardEnrollment", rhsAllowDateForwardEnrollment), lhsAllowDateForwardEnrollment, rhsAllowDateForwardEnrollment)) {
                return false;
            }
        }
        {
            Date lhsStartTime;
            lhsStartTime = this.getStartTime();
            Date rhsStartTime;
            rhsStartTime = that.getStartTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTime", lhsStartTime), LocatorUtils.property(thatLocator, "startTime", rhsStartTime), lhsStartTime, rhsStartTime)) {
                return false;
            }
        }
        {
            Date lhsEndTime;
            lhsEndTime = this.getEndTime();
            Date rhsEndTime;
            rhsEndTime = that.getEndTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTime", lhsEndTime), LocatorUtils.property(thatLocator, "endTime", rhsEndTime), lhsEndTime, rhsEndTime)) {
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
            ArrayOfClass theClasses;
            theClasses = this.getClasses();
            strategy.appendField(locator, this, "classes", buffer, theClasses);
        }
        {
            ArrayOfClient theClients;
            theClients = this.getClients();
            strategy.appendField(locator, this, "clients", buffer, theClients);
        }
        {
            Course theCourse;
            theCourse = this.getCourse();
            strategy.appendField(locator, this, "course", buffer, theCourse);
        }
        {
            Integer theSemesterID;
            theSemesterID = this.getSemesterID();
            strategy.appendField(locator, this, "semesterID", buffer, theSemesterID);
        }
        {
            Boolean theIsAvailable;
            theIsAvailable = this.getIsAvailable();
            strategy.appendField(locator, this, "isAvailable", buffer, theIsAvailable);
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
            ClassDescription theClassDescription;
            theClassDescription = this.getClassDescription();
            strategy.appendField(locator, this, "classDescription", buffer, theClassDescription);
        }
        {
            Boolean theDaySunday;
            theDaySunday = this.getDaySunday();
            strategy.appendField(locator, this, "daySunday", buffer, theDaySunday);
        }
        {
            Boolean theDayMonday;
            theDayMonday = this.getDayMonday();
            strategy.appendField(locator, this, "dayMonday", buffer, theDayMonday);
        }
        {
            Boolean theDayTuesday;
            theDayTuesday = this.getDayTuesday();
            strategy.appendField(locator, this, "dayTuesday", buffer, theDayTuesday);
        }
        {
            Boolean theDayWednesday;
            theDayWednesday = this.getDayWednesday();
            strategy.appendField(locator, this, "dayWednesday", buffer, theDayWednesday);
        }
        {
            Boolean theDayThursday;
            theDayThursday = this.getDayThursday();
            strategy.appendField(locator, this, "dayThursday", buffer, theDayThursday);
        }
        {
            Boolean theDayFriday;
            theDayFriday = this.getDayFriday();
            strategy.appendField(locator, this, "dayFriday", buffer, theDayFriday);
        }
        {
            Boolean theDaySaturday;
            theDaySaturday = this.getDaySaturday();
            strategy.appendField(locator, this, "daySaturday", buffer, theDaySaturday);
        }
        {
            Boolean theAllowOpenEnrollment;
            theAllowOpenEnrollment = this.getAllowOpenEnrollment();
            strategy.appendField(locator, this, "allowOpenEnrollment", buffer, theAllowOpenEnrollment);
        }
        {
            Boolean theAllowDateForwardEnrollment;
            theAllowDateForwardEnrollment = this.getAllowDateForwardEnrollment();
            strategy.appendField(locator, this, "allowDateForwardEnrollment", buffer, theAllowDateForwardEnrollment);
        }
        {
            Date theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime);
        }
        {
            Date theEndTime;
            theEndTime = this.getEndTime();
            strategy.appendField(locator, this, "endTime", buffer, theEndTime);
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
        {
            Staff theStaff;
            theStaff = this.getStaff();
            strategy.appendField(locator, this, "staff", buffer, theStaff);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        return buffer;
    }

}
