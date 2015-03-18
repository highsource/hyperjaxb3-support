
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
 * <p>Java class for Appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}ScheduleItem">
 *       &lt;sequence>
 *         &lt;element name="GenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://clients.mindbodyonline.com/api/0_5}AppointmentStatus" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Program" type="{http://clients.mindbodyonline.com/api/0_5}Program" minOccurs="0"/>
 *         &lt;element name="SessionType" type="{http://clients.mindbodyonline.com/api/0_5}SessionType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5}Client" minOccurs="0"/>
 *         &lt;element name="FirstAppointment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientService" type="{http://clients.mindbodyonline.com/api/0_5}ClientService" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "genderPreference",
    "duration",
    "action",
    "id",
    "status",
    "startDateTime",
    "endDateTime",
    "notes",
    "staffRequested",
    "program",
    "sessionType",
    "location",
    "staff",
    "client",
    "firstAppointment",
    "clientService",
    "resources"
})
@Entity(name = "Appointment")
@Table(name = "APPOINTMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Appointment
    extends ScheduleItem
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GenderPreference")
    protected String genderPreference;
    @XmlElement(name = "Duration", required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Long id;
    @XmlElement(name = "Status")
    protected AppointmentStatus status;
    @XmlElement(name = "StartDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDateTime;
    @XmlElement(name = "EndDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "StaffRequested", nillable = true)
    protected Boolean staffRequested;
    @XmlElement(name = "Program")
    protected Program program;
    @XmlElement(name = "SessionType")
    protected SessionType sessionType;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "FirstAppointment", nillable = true)
    protected Boolean firstAppointment;
    @XmlElement(name = "ClientService")
    protected ClientService clientService;
    @XmlElement(name = "Resources")
    protected ArrayOfResource resources;

    /**
     * Gets the value of the genderPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GENDER_PREFERENCE", length = 255)
    public String getGenderPreference() {
        return genderPreference;
    }

    /**
     * Sets the value of the genderPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderPreference(String value) {
        this.genderPreference = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "DURATION", precision = 10, scale = 0)
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
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
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "ID", scale = 0)
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentStatus }
     *     
     */
    @Basic
    @Column(name = "STATUS", length = 255)
    @Enumerated(EnumType.STRING)
    public AppointmentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentStatus }
     *     
     */
    public void setStatus(AppointmentStatus value) {
        this.status = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NOTES", length = 255)
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the staffRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "STAFF_REQUESTED")
    public Boolean getStaffRequested() {
        return staffRequested;
    }

    /**
     * Sets the value of the staffRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffRequested(Boolean value) {
        this.staffRequested = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link Program }
     *     
     */
    @ManyToOne(targetEntity = Program.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROGRAM_APPOINTMENT_ID")
    public Program getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link Program }
     *     
     */
    public void setProgram(Program value) {
        this.program = value;
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
    @JoinColumn(name = "SESSION_TYPE_APPOINTMENT_ID")
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
    @JoinColumn(name = "LOCATION__APPOINTMENT_ID")
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
    @JoinColumn(name = "STAFF_APPOINTMENT_ID")
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
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    @ManyToOne(targetEntity = Client.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_APPOINTMENT_ID")
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the firstAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "FIRST_APPOINTMENT")
    public Boolean getFirstAppointment() {
        return firstAppointment;
    }

    /**
     * Sets the value of the firstAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstAppointment(Boolean value) {
        this.firstAppointment = value;
    }

    /**
     * Gets the value of the clientService property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    @ManyToOne(targetEntity = ClientService.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_SERVICE_APPOINTMENT_ID")
    public ClientService getClientService() {
        return clientService;
    }

    /**
     * Sets the value of the clientService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setClientService(ClientService value) {
        this.clientService = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResource }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfResource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RESOURCES_APPOINTMENT_HJID")
    public ArrayOfResource getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResource }
     *     
     */
    public void setResources(ArrayOfResource value) {
        this.resources = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theGenderPreference;
            theGenderPreference = this.getGenderPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "genderPreference", theGenderPreference), currentHashCode, theGenderPreference);
        }
        {
            Integer theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            Long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            AppointmentStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
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
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            Boolean theStaffRequested;
            theStaffRequested = this.getStaffRequested();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staffRequested", theStaffRequested), currentHashCode, theStaffRequested);
        }
        {
            Program theProgram;
            theProgram = this.getProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "program", theProgram), currentHashCode, theProgram);
        }
        {
            SessionType theSessionType;
            theSessionType = this.getSessionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionType", theSessionType), currentHashCode, theSessionType);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staff", theStaff), currentHashCode, theStaff);
        }
        {
            Client theClient;
            theClient = this.getClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "client", theClient), currentHashCode, theClient);
        }
        {
            Boolean theFirstAppointment;
            theFirstAppointment = this.getFirstAppointment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstAppointment", theFirstAppointment), currentHashCode, theFirstAppointment);
        }
        {
            ClientService theClientService;
            theClientService = this.getClientService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientService", theClientService), currentHashCode, theClientService);
        }
        {
            ArrayOfResource theResources;
            theResources = this.getResources();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resources", theResources), currentHashCode, theResources);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Appointment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Appointment that = ((Appointment) object);
        {
            String lhsGenderPreference;
            lhsGenderPreference = this.getGenderPreference();
            String rhsGenderPreference;
            rhsGenderPreference = that.getGenderPreference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "genderPreference", lhsGenderPreference), LocatorUtils.property(thatLocator, "genderPreference", rhsGenderPreference), lhsGenderPreference, rhsGenderPreference)) {
                return false;
            }
        }
        {
            Integer lhsDuration;
            lhsDuration = this.getDuration();
            Integer rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
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
            Long lhsID;
            lhsID = this.getID();
            Long rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            AppointmentStatus lhsStatus;
            lhsStatus = this.getStatus();
            AppointmentStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
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
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
                return false;
            }
        }
        {
            Boolean lhsStaffRequested;
            lhsStaffRequested = this.getStaffRequested();
            Boolean rhsStaffRequested;
            rhsStaffRequested = that.getStaffRequested();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staffRequested", lhsStaffRequested), LocatorUtils.property(thatLocator, "staffRequested", rhsStaffRequested), lhsStaffRequested, rhsStaffRequested)) {
                return false;
            }
        }
        {
            Program lhsProgram;
            lhsProgram = this.getProgram();
            Program rhsProgram;
            rhsProgram = that.getProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "program", lhsProgram), LocatorUtils.property(thatLocator, "program", rhsProgram), lhsProgram, rhsProgram)) {
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
            Location lhsLocation;
            lhsLocation = this.getLocation();
            Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
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
            Client lhsClient;
            lhsClient = this.getClient();
            Client rhsClient;
            rhsClient = that.getClient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "client", lhsClient), LocatorUtils.property(thatLocator, "client", rhsClient), lhsClient, rhsClient)) {
                return false;
            }
        }
        {
            Boolean lhsFirstAppointment;
            lhsFirstAppointment = this.getFirstAppointment();
            Boolean rhsFirstAppointment;
            rhsFirstAppointment = that.getFirstAppointment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstAppointment", lhsFirstAppointment), LocatorUtils.property(thatLocator, "firstAppointment", rhsFirstAppointment), lhsFirstAppointment, rhsFirstAppointment)) {
                return false;
            }
        }
        {
            ClientService lhsClientService;
            lhsClientService = this.getClientService();
            ClientService rhsClientService;
            rhsClientService = that.getClientService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientService", lhsClientService), LocatorUtils.property(thatLocator, "clientService", rhsClientService), lhsClientService, rhsClientService)) {
                return false;
            }
        }
        {
            ArrayOfResource lhsResources;
            lhsResources = this.getResources();
            ArrayOfResource rhsResources;
            rhsResources = that.getResources();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resources", lhsResources), LocatorUtils.property(thatLocator, "resources", rhsResources), lhsResources, rhsResources)) {
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
            String theGenderPreference;
            theGenderPreference = this.getGenderPreference();
            strategy.appendField(locator, this, "genderPreference", buffer, theGenderPreference);
        }
        {
            Integer theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            Long theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            AppointmentStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
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
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        {
            Boolean theStaffRequested;
            theStaffRequested = this.getStaffRequested();
            strategy.appendField(locator, this, "staffRequested", buffer, theStaffRequested);
        }
        {
            Program theProgram;
            theProgram = this.getProgram();
            strategy.appendField(locator, this, "program", buffer, theProgram);
        }
        {
            SessionType theSessionType;
            theSessionType = this.getSessionType();
            strategy.appendField(locator, this, "sessionType", buffer, theSessionType);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            Staff theStaff;
            theStaff = this.getStaff();
            strategy.appendField(locator, this, "staff", buffer, theStaff);
        }
        {
            Client theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            Boolean theFirstAppointment;
            theFirstAppointment = this.getFirstAppointment();
            strategy.appendField(locator, this, "firstAppointment", buffer, theFirstAppointment);
        }
        {
            ClientService theClientService;
            theClientService = this.getClientService();
            strategy.appendField(locator, this, "clientService", buffer, theClientService);
        }
        {
            ArrayOfResource theResources;
            theResources = this.getResources();
            strategy.appendField(locator, this, "resources", buffer, theResources);
        }
        return buffer;
    }

}
