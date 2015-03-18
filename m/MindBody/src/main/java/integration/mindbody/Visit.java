
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
 * <p>Java class for Visit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppointmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppointmentGenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LateCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5}Client" minOccurs="0"/>
 *         &lt;element name="WebSignup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="SignedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MakeUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://clients.mindbodyonline.com/api/0_5}ClientService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visit", propOrder = {
    "id",
    "classID",
    "appointmentID",
    "appointmentGenderPreference",
    "startDateTime",
    "lateCancelled",
    "endDateTime",
    "name",
    "staff",
    "location",
    "client",
    "webSignup",
    "action",
    "signedIn",
    "makeUp",
    "service"
})
@Entity(name = "Visit")
@Table(name = "VISIT")
public class Visit
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "ClassID")
    protected Integer classID;
    @XmlElement(name = "AppointmentID")
    protected Integer appointmentID;
    @XmlElement(name = "AppointmentGenderPreference")
    protected String appointmentGenderPreference;
    @XmlElement(name = "StartDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDateTime;
    @XmlElement(name = "LateCancelled")
    protected Boolean lateCancelled;
    @XmlElement(name = "EndDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDateTime;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "WebSignup")
    protected Boolean webSignup;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "SignedIn", nillable = true)
    protected Boolean signedIn;
    @XmlElement(name = "MakeUp", nillable = true)
    protected Boolean makeUp;
    @XmlElement(name = "Service")
    protected ClientService service;

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
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "CLASSID", precision = 10, scale = 0)
    public Integer getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassID(Integer value) {
        this.classID = value;
    }

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "APPOINTMENTID", precision = 10, scale = 0)
    public Integer getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentID(Integer value) {
        this.appointmentID = value;
    }

    /**
     * Gets the value of the appointmentGenderPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "APPOINTMENTGENDERPREFERENCE", length = 255)
    public String getAppointmentGenderPreference() {
        return appointmentGenderPreference;
    }

    /**
     * Sets the value of the appointmentGenderPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentGenderPreference(String value) {
        this.appointmentGenderPreference = value;
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
     * Gets the value of the lateCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "LATECANCELLED")
    public Boolean getLateCancelled() {
        return lateCancelled;
    }

    /**
     * Sets the value of the lateCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateCancelled(Boolean value) {
        this.lateCancelled = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
        @JoinColumn(name = "STAFF_VISIT_ID"),
        @JoinColumn(name = "STAFF_VISIT_HJID")
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
        @JoinColumn(name = "LOCATION__VISIT_ID"),
        @JoinColumn(name = "LOCATION__VISIT_HJID")
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
    @JoinColumns({
        @JoinColumn(name = "CLIENT_VISIT_ID"),
        @JoinColumn(name = "CLIENT_VISIT_HJID")
    })
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
     * Gets the value of the webSignup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "WEBSIGNUP")
    public Boolean getWebSignup() {
        return webSignup;
    }

    /**
     * Sets the value of the webSignup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebSignup(Boolean value) {
        this.webSignup = value;
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
     * Gets the value of the signedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "SIGNEDIN")
    public Boolean getSignedIn() {
        return signedIn;
    }

    /**
     * Sets the value of the signedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignedIn(Boolean value) {
        this.signedIn = value;
    }

    /**
     * Gets the value of the makeUp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "MAKEUP")
    public Boolean getMakeUp() {
        return makeUp;
    }

    /**
     * Sets the value of the makeUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeUp(Boolean value) {
        this.makeUp = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    @ManyToOne(targetEntity = ClientService.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumns({
        @JoinColumn(name = "SERVICE_VISIT_ID"),
        @JoinColumn(name = "SERVICE_VISIT_HJID")
    })
    public ClientService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setService(ClientService value) {
        this.service = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Integer theClassID;
            theClassID = this.getClassID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classID", theClassID), currentHashCode, theClassID);
        }
        {
            Integer theAppointmentID;
            theAppointmentID = this.getAppointmentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appointmentID", theAppointmentID), currentHashCode, theAppointmentID);
        }
        {
            String theAppointmentGenderPreference;
            theAppointmentGenderPreference = this.getAppointmentGenderPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appointmentGenderPreference", theAppointmentGenderPreference), currentHashCode, theAppointmentGenderPreference);
        }
        {
            Date theStartDateTime;
            theStartDateTime = this.getStartDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDateTime", theStartDateTime), currentHashCode, theStartDateTime);
        }
        {
            Boolean theLateCancelled;
            theLateCancelled = this.getLateCancelled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lateCancelled", theLateCancelled), currentHashCode, theLateCancelled);
        }
        {
            Date theEndDateTime;
            theEndDateTime = this.getEndDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDateTime", theEndDateTime), currentHashCode, theEndDateTime);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        {
            Client theClient;
            theClient = this.getClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "client", theClient), currentHashCode, theClient);
        }
        {
            Boolean theWebSignup;
            theWebSignup = this.getWebSignup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSignup", theWebSignup), currentHashCode, theWebSignup);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            Boolean theSignedIn;
            theSignedIn = this.getSignedIn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signedIn", theSignedIn), currentHashCode, theSignedIn);
        }
        {
            Boolean theMakeUp;
            theMakeUp = this.getMakeUp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "makeUp", theMakeUp), currentHashCode, theMakeUp);
        }
        {
            ClientService theService;
            theService = this.getService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "service", theService), currentHashCode, theService);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Visit)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Visit that = ((Visit) object);
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
            Integer lhsClassID;
            lhsClassID = this.getClassID();
            Integer rhsClassID;
            rhsClassID = that.getClassID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classID", lhsClassID), LocatorUtils.property(thatLocator, "classID", rhsClassID), lhsClassID, rhsClassID)) {
                return false;
            }
        }
        {
            Integer lhsAppointmentID;
            lhsAppointmentID = this.getAppointmentID();
            Integer rhsAppointmentID;
            rhsAppointmentID = that.getAppointmentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appointmentID", lhsAppointmentID), LocatorUtils.property(thatLocator, "appointmentID", rhsAppointmentID), lhsAppointmentID, rhsAppointmentID)) {
                return false;
            }
        }
        {
            String lhsAppointmentGenderPreference;
            lhsAppointmentGenderPreference = this.getAppointmentGenderPreference();
            String rhsAppointmentGenderPreference;
            rhsAppointmentGenderPreference = that.getAppointmentGenderPreference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appointmentGenderPreference", lhsAppointmentGenderPreference), LocatorUtils.property(thatLocator, "appointmentGenderPreference", rhsAppointmentGenderPreference), lhsAppointmentGenderPreference, rhsAppointmentGenderPreference)) {
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
            Boolean lhsLateCancelled;
            lhsLateCancelled = this.getLateCancelled();
            Boolean rhsLateCancelled;
            rhsLateCancelled = that.getLateCancelled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lateCancelled", lhsLateCancelled), LocatorUtils.property(thatLocator, "lateCancelled", rhsLateCancelled), lhsLateCancelled, rhsLateCancelled)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            Boolean lhsWebSignup;
            lhsWebSignup = this.getWebSignup();
            Boolean rhsWebSignup;
            rhsWebSignup = that.getWebSignup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSignup", lhsWebSignup), LocatorUtils.property(thatLocator, "webSignup", rhsWebSignup), lhsWebSignup, rhsWebSignup)) {
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
            Boolean lhsSignedIn;
            lhsSignedIn = this.getSignedIn();
            Boolean rhsSignedIn;
            rhsSignedIn = that.getSignedIn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signedIn", lhsSignedIn), LocatorUtils.property(thatLocator, "signedIn", rhsSignedIn), lhsSignedIn, rhsSignedIn)) {
                return false;
            }
        }
        {
            Boolean lhsMakeUp;
            lhsMakeUp = this.getMakeUp();
            Boolean rhsMakeUp;
            rhsMakeUp = that.getMakeUp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "makeUp", lhsMakeUp), LocatorUtils.property(thatLocator, "makeUp", rhsMakeUp), lhsMakeUp, rhsMakeUp)) {
                return false;
            }
        }
        {
            ClientService lhsService;
            lhsService = this.getService();
            ClientService rhsService;
            rhsService = that.getService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "service", lhsService), LocatorUtils.property(thatLocator, "service", rhsService), lhsService, rhsService)) {
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
            Long theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Integer theClassID;
            theClassID = this.getClassID();
            strategy.appendField(locator, this, "classID", buffer, theClassID);
        }
        {
            Integer theAppointmentID;
            theAppointmentID = this.getAppointmentID();
            strategy.appendField(locator, this, "appointmentID", buffer, theAppointmentID);
        }
        {
            String theAppointmentGenderPreference;
            theAppointmentGenderPreference = this.getAppointmentGenderPreference();
            strategy.appendField(locator, this, "appointmentGenderPreference", buffer, theAppointmentGenderPreference);
        }
        {
            Date theStartDateTime;
            theStartDateTime = this.getStartDateTime();
            strategy.appendField(locator, this, "startDateTime", buffer, theStartDateTime);
        }
        {
            Boolean theLateCancelled;
            theLateCancelled = this.getLateCancelled();
            strategy.appendField(locator, this, "lateCancelled", buffer, theLateCancelled);
        }
        {
            Date theEndDateTime;
            theEndDateTime = this.getEndDateTime();
            strategy.appendField(locator, this, "endDateTime", buffer, theEndDateTime);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
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
        {
            Client theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            Boolean theWebSignup;
            theWebSignup = this.getWebSignup();
            strategy.appendField(locator, this, "webSignup", buffer, theWebSignup);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            Boolean theSignedIn;
            theSignedIn = this.getSignedIn();
            strategy.appendField(locator, this, "signedIn", buffer, theSignedIn);
        }
        {
            Boolean theMakeUp;
            theMakeUp = this.getMakeUp();
            strategy.appendField(locator, this, "makeUp", buffer, theMakeUp);
        }
        {
            ClientService theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        return buffer;
    }

}
