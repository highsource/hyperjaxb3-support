
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
 * <p>Java class for Client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Client">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="NewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ClientIndexes" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClientIndex" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientCreditCard" type="{http://clients.mindbodyonline.com/api/0_5}ClientCreditCard" minOccurs="0"/>
 *         &lt;element name="LastFormulaNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointmentGenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientRelationships" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClientRelationship" minOccurs="0"/>
 *         &lt;element name="Reps" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfRep" minOccurs="0"/>
 *         &lt;element name="CustomClientFields" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfCustomClientField" minOccurs="0"/>
 *         &lt;element name="LiabilityRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyContactInfoEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalEmailOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FirstAppointmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReferredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeLocation" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *         &lt;element name="YellowAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsProspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
    "newID",
    "accountBalance",
    "clientIndexes",
    "username",
    "password",
    "notes",
    "clientCreditCard",
    "lastFormulaNotes",
    "appointmentGenderPreference",
    "gender",
    "isCompany",
    "inactive",
    "clientRelationships",
    "reps",
    "customClientFields",
    "liabilityRelease",
    "emergencyContactInfoName",
    "emergencyContactInfoRelationship",
    "emergencyContactInfoPhone",
    "emergencyContactInfoEmail",
    "promotionalEmailOptIn",
    "action",
    "id",
    "firstName",
    "middleName",
    "lastName",
    "email",
    "emailOptIn",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "postalCode",
    "country",
    "mobilePhone",
    "homePhone",
    "workPhone",
    "workExtension",
    "birthDate",
    "firstAppointmentDate",
    "referredBy",
    "homeLocation",
    "yellowAlert",
    "redAlert",
    "photoURL",
    "isProspect"
})
@Entity(name = "Client")
@Table(name = "CLIENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Client
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NewID")
    protected String newID;
    @XmlElement(name = "AccountBalance")
    protected Double accountBalance;
    @XmlElement(name = "ClientIndexes")
    protected ArrayOfClientIndex clientIndexes;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "ClientCreditCard")
    protected ClientCreditCard clientCreditCard;
    @XmlElement(name = "LastFormulaNotes")
    protected String lastFormulaNotes;
    @XmlElement(name = "AppointmentGenderPreference")
    protected String appointmentGenderPreference;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "IsCompany", nillable = true)
    protected Boolean isCompany;
    @XmlElement(name = "Inactive", nillable = true)
    protected Boolean inactive;
    @XmlElement(name = "ClientRelationships")
    protected ArrayOfClientRelationship clientRelationships;
    @XmlElement(name = "Reps")
    protected ArrayOfRep reps;
    @XmlElement(name = "CustomClientFields")
    protected ArrayOfCustomClientField customClientFields;
    @XmlElement(name = "LiabilityRelease", nillable = true)
    protected Boolean liabilityRelease;
    @XmlElement(name = "EmergencyContactInfoName")
    protected String emergencyContactInfoName;
    @XmlElement(name = "EmergencyContactInfoRelationship")
    protected String emergencyContactInfoRelationship;
    @XmlElement(name = "EmergencyContactInfoPhone")
    protected String emergencyContactInfoPhone;
    @XmlElement(name = "EmergencyContactInfoEmail")
    protected String emergencyContactInfoEmail;
    @XmlElement(name = "PromotionalEmailOptIn", nillable = true)
    protected Boolean promotionalEmailOptIn;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "EmailOptIn", nillable = true)
    protected Boolean emailOptIn;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkExtension")
    protected String workExtension;
    @XmlElement(name = "BirthDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthDate;
    @XmlElement(name = "FirstAppointmentDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date firstAppointmentDate;
    @XmlElement(name = "ReferredBy")
    protected String referredBy;
    @XmlElement(name = "HomeLocation")
    protected Location homeLocation;
    @XmlElement(name = "YellowAlert")
    protected String yellowAlert;
    @XmlElement(name = "RedAlert")
    protected String redAlert;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "IsProspect", nillable = true)
    protected Boolean isProspect;

    /**
     * Gets the value of the newID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NEW_ID", length = 255)
    public String getNewID() {
        return newID;
    }

    /**
     * Sets the value of the newID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewID(String value) {
        this.newID = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Basic
    @Column(name = "ACCOUNT_BALANCE", precision = 20, scale = 10)
    public Double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccountBalance(Double value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the clientIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfClientIndex.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_INDEXES_CLIENT_HJID")
    public ArrayOfClientIndex getClientIndexes() {
        return clientIndexes;
    }

    /**
     * Sets the value of the clientIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientIndex }
     *     
     */
    public void setClientIndexes(ArrayOfClientIndex value) {
        this.clientIndexes = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "USERNAME", length = 255)
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PASSWORD_", length = 255)
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the clientCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCreditCard }
     *     
     */
    @ManyToOne(targetEntity = ClientCreditCard.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_CREDIT_CARD_CLIENT_HJ_0")
    public ClientCreditCard getClientCreditCard() {
        return clientCreditCard;
    }

    /**
     * Sets the value of the clientCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCreditCard }
     *     
     */
    public void setClientCreditCard(ClientCreditCard value) {
        this.clientCreditCard = value;
    }

    /**
     * Gets the value of the lastFormulaNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_FORMULA_NOTES", length = 255)
    public String getLastFormulaNotes() {
        return lastFormulaNotes;
    }

    /**
     * Sets the value of the lastFormulaNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFormulaNotes(String value) {
        this.lastFormulaNotes = value;
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
    @Column(name = "APPOINTMENT_GENDER_PREFERENCE", length = 255)
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GENDER", length = 255)
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "IS_COMPANY")
    public Boolean getIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompany(Boolean value) {
        this.isCompany = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "INACTIVE")
    public Boolean getInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the clientRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientRelationship }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfClientRelationship.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_RELATIONSHIPS_CLIENT__0")
    public ArrayOfClientRelationship getClientRelationships() {
        return clientRelationships;
    }

    /**
     * Sets the value of the clientRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientRelationship }
     *     
     */
    public void setClientRelationships(ArrayOfClientRelationship value) {
        this.clientRelationships = value;
    }

    /**
     * Gets the value of the reps property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRep }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfRep.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REPS_CLIENT_HJID")
    public ArrayOfRep getReps() {
        return reps;
    }

    /**
     * Sets the value of the reps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRep }
     *     
     */
    public void setReps(ArrayOfRep value) {
        this.reps = value;
    }

    /**
     * Gets the value of the customClientFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfCustomClientField.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CUSTOM_CLIENT_FIELDS_CLIENT__0")
    public ArrayOfCustomClientField getCustomClientFields() {
        return customClientFields;
    }

    /**
     * Sets the value of the customClientFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public void setCustomClientFields(ArrayOfCustomClientField value) {
        this.customClientFields = value;
    }

    /**
     * Gets the value of the liabilityRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "LIABILITY_RELEASE")
    public Boolean getLiabilityRelease() {
        return liabilityRelease;
    }

    /**
     * Sets the value of the liabilityRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiabilityRelease(Boolean value) {
        this.liabilityRelease = value;
    }

    /**
     * Gets the value of the emergencyContactInfoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMERGENCY_CONTACT_INFO_NAME", length = 255)
    public String getEmergencyContactInfoName() {
        return emergencyContactInfoName;
    }

    /**
     * Sets the value of the emergencyContactInfoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoName(String value) {
        this.emergencyContactInfoName = value;
    }

    /**
     * Gets the value of the emergencyContactInfoRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMERGENCY_CONTACT_INFO_RELAT_0", length = 255)
    public String getEmergencyContactInfoRelationship() {
        return emergencyContactInfoRelationship;
    }

    /**
     * Sets the value of the emergencyContactInfoRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoRelationship(String value) {
        this.emergencyContactInfoRelationship = value;
    }

    /**
     * Gets the value of the emergencyContactInfoPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMERGENCY_CONTACT_INFO_PHONE", length = 255)
    public String getEmergencyContactInfoPhone() {
        return emergencyContactInfoPhone;
    }

    /**
     * Sets the value of the emergencyContactInfoPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoPhone(String value) {
        this.emergencyContactInfoPhone = value;
    }

    /**
     * Gets the value of the emergencyContactInfoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMERGENCY_CONTACT_INFO_EMAIL", length = 255)
    public String getEmergencyContactInfoEmail() {
        return emergencyContactInfoEmail;
    }

    /**
     * Sets the value of the emergencyContactInfoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactInfoEmail(String value) {
        this.emergencyContactInfoEmail = value;
    }

    /**
     * Gets the value of the promotionalEmailOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "PROMOTIONAL_EMAIL_OPT_IN")
    public Boolean getPromotionalEmailOptIn() {
        return promotionalEmailOptIn;
    }

    /**
     * Sets the value of the promotionalEmailOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionalEmailOptIn(Boolean value) {
        this.promotionalEmailOptIn = value;
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
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ID")
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME", length = 255)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MIDDLE_NAME", length = 255)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_NAME", length = 255)
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EMAIL", length = 255)
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "EMAIL_OPT_IN")
    public Boolean getEmailOptIn() {
        return emailOptIn;
    }

    /**
     * Sets the value of the emailOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailOptIn(Boolean value) {
        this.emailOptIn = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDRESS_LINE_1", length = 255)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDRESS_LINE_2", length = 255)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CITY", length = 255)
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATE_", length = 255)
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POSTAL_CODE", length = 255)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COUNTRY", length = 255)
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MOBILE_PHONE", length = 255)
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HOME_PHONE", length = 255)
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "WORK_PHONE", length = 255)
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "WORK_EXTENSION", length = 255)
    public String getWorkExtension() {
        return workExtension;
    }

    /**
     * Sets the value of the workExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkExtension(String value) {
        this.workExtension = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the firstAppointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_APPOINTMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFirstAppointmentDate() {
        return firstAppointmentDate;
    }

    /**
     * Sets the value of the firstAppointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAppointmentDate(Date value) {
        this.firstAppointmentDate = value;
    }

    /**
     * Gets the value of the referredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REFERRED_BY", length = 255)
    public String getReferredBy() {
        return referredBy;
    }

    /**
     * Sets the value of the referredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferredBy(String value) {
        this.referredBy = value;
    }

    /**
     * Gets the value of the homeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    @ManyToOne(targetEntity = Location.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "HOME_LOCATION_CLIENT_ID")
    public Location getHomeLocation() {
        return homeLocation;
    }

    /**
     * Sets the value of the homeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setHomeLocation(Location value) {
        this.homeLocation = value;
    }

    /**
     * Gets the value of the yellowAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "YELLOW_ALERT", length = 255)
    public String getYellowAlert() {
        return yellowAlert;
    }

    /**
     * Sets the value of the yellowAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowAlert(String value) {
        this.yellowAlert = value;
    }

    /**
     * Gets the value of the redAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RED_ALERT", length = 255)
    public String getRedAlert() {
        return redAlert;
    }

    /**
     * Sets the value of the redAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedAlert(String value) {
        this.redAlert = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PHOTO_URL", length = 255)
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the isProspect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "IS_PROSPECT")
    public Boolean getIsProspect() {
        return isProspect;
    }

    /**
     * Sets the value of the isProspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProspect(Boolean value) {
        this.isProspect = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theNewID;
            theNewID = this.getNewID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newID", theNewID), currentHashCode, theNewID);
        }
        {
            Double theAccountBalance;
            theAccountBalance = this.getAccountBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountBalance", theAccountBalance), currentHashCode, theAccountBalance);
        }
        {
            ArrayOfClientIndex theClientIndexes;
            theClientIndexes = this.getClientIndexes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIndexes", theClientIndexes), currentHashCode, theClientIndexes);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "username", theUsername), currentHashCode, theUsername);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        {
            ClientCreditCard theClientCreditCard;
            theClientCreditCard = this.getClientCreditCard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientCreditCard", theClientCreditCard), currentHashCode, theClientCreditCard);
        }
        {
            String theLastFormulaNotes;
            theLastFormulaNotes = this.getLastFormulaNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFormulaNotes", theLastFormulaNotes), currentHashCode, theLastFormulaNotes);
        }
        {
            String theAppointmentGenderPreference;
            theAppointmentGenderPreference = this.getAppointmentGenderPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appointmentGenderPreference", theAppointmentGenderPreference), currentHashCode, theAppointmentGenderPreference);
        }
        {
            String theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            Boolean theIsCompany;
            theIsCompany = this.getIsCompany();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCompany", theIsCompany), currentHashCode, theIsCompany);
        }
        {
            Boolean theInactive;
            theInactive = this.getInactive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inactive", theInactive), currentHashCode, theInactive);
        }
        {
            ArrayOfClientRelationship theClientRelationships;
            theClientRelationships = this.getClientRelationships();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientRelationships", theClientRelationships), currentHashCode, theClientRelationships);
        }
        {
            ArrayOfRep theReps;
            theReps = this.getReps();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reps", theReps), currentHashCode, theReps);
        }
        {
            ArrayOfCustomClientField theCustomClientFields;
            theCustomClientFields = this.getCustomClientFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customClientFields", theCustomClientFields), currentHashCode, theCustomClientFields);
        }
        {
            Boolean theLiabilityRelease;
            theLiabilityRelease = this.getLiabilityRelease();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "liabilityRelease", theLiabilityRelease), currentHashCode, theLiabilityRelease);
        }
        {
            String theEmergencyContactInfoName;
            theEmergencyContactInfoName = this.getEmergencyContactInfoName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyContactInfoName", theEmergencyContactInfoName), currentHashCode, theEmergencyContactInfoName);
        }
        {
            String theEmergencyContactInfoRelationship;
            theEmergencyContactInfoRelationship = this.getEmergencyContactInfoRelationship();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyContactInfoRelationship", theEmergencyContactInfoRelationship), currentHashCode, theEmergencyContactInfoRelationship);
        }
        {
            String theEmergencyContactInfoPhone;
            theEmergencyContactInfoPhone = this.getEmergencyContactInfoPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyContactInfoPhone", theEmergencyContactInfoPhone), currentHashCode, theEmergencyContactInfoPhone);
        }
        {
            String theEmergencyContactInfoEmail;
            theEmergencyContactInfoEmail = this.getEmergencyContactInfoEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emergencyContactInfoEmail", theEmergencyContactInfoEmail), currentHashCode, theEmergencyContactInfoEmail);
        }
        {
            Boolean thePromotionalEmailOptIn;
            thePromotionalEmailOptIn = this.getPromotionalEmailOptIn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promotionalEmailOptIn", thePromotionalEmailOptIn), currentHashCode, thePromotionalEmailOptIn);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theMiddleName;
            theMiddleName = this.getMiddleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "middleName", theMiddleName), currentHashCode, theMiddleName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
        }
        {
            Boolean theEmailOptIn;
            theEmailOptIn = this.getEmailOptIn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailOptIn", theEmailOptIn), currentHashCode, theEmailOptIn);
        }
        {
            String theAddressLine1;
            theAddressLine1 = this.getAddressLine1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine1", theAddressLine1), currentHashCode, theAddressLine1);
        }
        {
            String theAddressLine2;
            theAddressLine2 = this.getAddressLine2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine2", theAddressLine2), currentHashCode, theAddressLine2);
        }
        {
            String theCity;
            theCity = this.getCity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode, theCity);
        }
        {
            String theState;
            theState = this.getState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "state", theState), currentHashCode, theState);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode);
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry);
        }
        {
            String theMobilePhone;
            theMobilePhone = this.getMobilePhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mobilePhone", theMobilePhone), currentHashCode, theMobilePhone);
        }
        {
            String theHomePhone;
            theHomePhone = this.getHomePhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homePhone", theHomePhone), currentHashCode, theHomePhone);
        }
        {
            String theWorkPhone;
            theWorkPhone = this.getWorkPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workPhone", theWorkPhone), currentHashCode, theWorkPhone);
        }
        {
            String theWorkExtension;
            theWorkExtension = this.getWorkExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workExtension", theWorkExtension), currentHashCode, theWorkExtension);
        }
        {
            Date theBirthDate;
            theBirthDate = this.getBirthDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthDate", theBirthDate), currentHashCode, theBirthDate);
        }
        {
            Date theFirstAppointmentDate;
            theFirstAppointmentDate = this.getFirstAppointmentDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstAppointmentDate", theFirstAppointmentDate), currentHashCode, theFirstAppointmentDate);
        }
        {
            String theReferredBy;
            theReferredBy = this.getReferredBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referredBy", theReferredBy), currentHashCode, theReferredBy);
        }
        {
            Location theHomeLocation;
            theHomeLocation = this.getHomeLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeLocation", theHomeLocation), currentHashCode, theHomeLocation);
        }
        {
            String theYellowAlert;
            theYellowAlert = this.getYellowAlert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "yellowAlert", theYellowAlert), currentHashCode, theYellowAlert);
        }
        {
            String theRedAlert;
            theRedAlert = this.getRedAlert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redAlert", theRedAlert), currentHashCode, theRedAlert);
        }
        {
            String thePhotoURL;
            thePhotoURL = this.getPhotoURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "photoURL", thePhotoURL), currentHashCode, thePhotoURL);
        }
        {
            Boolean theIsProspect;
            theIsProspect = this.getIsProspect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isProspect", theIsProspect), currentHashCode, theIsProspect);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Client)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Client that = ((Client) object);
        {
            String lhsNewID;
            lhsNewID = this.getNewID();
            String rhsNewID;
            rhsNewID = that.getNewID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newID", lhsNewID), LocatorUtils.property(thatLocator, "newID", rhsNewID), lhsNewID, rhsNewID)) {
                return false;
            }
        }
        {
            Double lhsAccountBalance;
            lhsAccountBalance = this.getAccountBalance();
            Double rhsAccountBalance;
            rhsAccountBalance = that.getAccountBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountBalance", lhsAccountBalance), LocatorUtils.property(thatLocator, "accountBalance", rhsAccountBalance), lhsAccountBalance, rhsAccountBalance)) {
                return false;
            }
        }
        {
            ArrayOfClientIndex lhsClientIndexes;
            lhsClientIndexes = this.getClientIndexes();
            ArrayOfClientIndex rhsClientIndexes;
            rhsClientIndexes = that.getClientIndexes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIndexes", lhsClientIndexes), LocatorUtils.property(thatLocator, "clientIndexes", rhsClientIndexes), lhsClientIndexes, rhsClientIndexes)) {
                return false;
            }
        }
        {
            String lhsUsername;
            lhsUsername = this.getUsername();
            String rhsUsername;
            rhsUsername = that.getUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "username", lhsUsername), LocatorUtils.property(thatLocator, "username", rhsUsername), lhsUsername, rhsUsername)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
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
            ClientCreditCard lhsClientCreditCard;
            lhsClientCreditCard = this.getClientCreditCard();
            ClientCreditCard rhsClientCreditCard;
            rhsClientCreditCard = that.getClientCreditCard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientCreditCard", lhsClientCreditCard), LocatorUtils.property(thatLocator, "clientCreditCard", rhsClientCreditCard), lhsClientCreditCard, rhsClientCreditCard)) {
                return false;
            }
        }
        {
            String lhsLastFormulaNotes;
            lhsLastFormulaNotes = this.getLastFormulaNotes();
            String rhsLastFormulaNotes;
            rhsLastFormulaNotes = that.getLastFormulaNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFormulaNotes", lhsLastFormulaNotes), LocatorUtils.property(thatLocator, "lastFormulaNotes", rhsLastFormulaNotes), lhsLastFormulaNotes, rhsLastFormulaNotes)) {
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
            String lhsGender;
            lhsGender = this.getGender();
            String rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            Boolean lhsIsCompany;
            lhsIsCompany = this.getIsCompany();
            Boolean rhsIsCompany;
            rhsIsCompany = that.getIsCompany();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCompany", lhsIsCompany), LocatorUtils.property(thatLocator, "isCompany", rhsIsCompany), lhsIsCompany, rhsIsCompany)) {
                return false;
            }
        }
        {
            Boolean lhsInactive;
            lhsInactive = this.getInactive();
            Boolean rhsInactive;
            rhsInactive = that.getInactive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inactive", lhsInactive), LocatorUtils.property(thatLocator, "inactive", rhsInactive), lhsInactive, rhsInactive)) {
                return false;
            }
        }
        {
            ArrayOfClientRelationship lhsClientRelationships;
            lhsClientRelationships = this.getClientRelationships();
            ArrayOfClientRelationship rhsClientRelationships;
            rhsClientRelationships = that.getClientRelationships();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientRelationships", lhsClientRelationships), LocatorUtils.property(thatLocator, "clientRelationships", rhsClientRelationships), lhsClientRelationships, rhsClientRelationships)) {
                return false;
            }
        }
        {
            ArrayOfRep lhsReps;
            lhsReps = this.getReps();
            ArrayOfRep rhsReps;
            rhsReps = that.getReps();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reps", lhsReps), LocatorUtils.property(thatLocator, "reps", rhsReps), lhsReps, rhsReps)) {
                return false;
            }
        }
        {
            ArrayOfCustomClientField lhsCustomClientFields;
            lhsCustomClientFields = this.getCustomClientFields();
            ArrayOfCustomClientField rhsCustomClientFields;
            rhsCustomClientFields = that.getCustomClientFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customClientFields", lhsCustomClientFields), LocatorUtils.property(thatLocator, "customClientFields", rhsCustomClientFields), lhsCustomClientFields, rhsCustomClientFields)) {
                return false;
            }
        }
        {
            Boolean lhsLiabilityRelease;
            lhsLiabilityRelease = this.getLiabilityRelease();
            Boolean rhsLiabilityRelease;
            rhsLiabilityRelease = that.getLiabilityRelease();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "liabilityRelease", lhsLiabilityRelease), LocatorUtils.property(thatLocator, "liabilityRelease", rhsLiabilityRelease), lhsLiabilityRelease, rhsLiabilityRelease)) {
                return false;
            }
        }
        {
            String lhsEmergencyContactInfoName;
            lhsEmergencyContactInfoName = this.getEmergencyContactInfoName();
            String rhsEmergencyContactInfoName;
            rhsEmergencyContactInfoName = that.getEmergencyContactInfoName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyContactInfoName", lhsEmergencyContactInfoName), LocatorUtils.property(thatLocator, "emergencyContactInfoName", rhsEmergencyContactInfoName), lhsEmergencyContactInfoName, rhsEmergencyContactInfoName)) {
                return false;
            }
        }
        {
            String lhsEmergencyContactInfoRelationship;
            lhsEmergencyContactInfoRelationship = this.getEmergencyContactInfoRelationship();
            String rhsEmergencyContactInfoRelationship;
            rhsEmergencyContactInfoRelationship = that.getEmergencyContactInfoRelationship();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyContactInfoRelationship", lhsEmergencyContactInfoRelationship), LocatorUtils.property(thatLocator, "emergencyContactInfoRelationship", rhsEmergencyContactInfoRelationship), lhsEmergencyContactInfoRelationship, rhsEmergencyContactInfoRelationship)) {
                return false;
            }
        }
        {
            String lhsEmergencyContactInfoPhone;
            lhsEmergencyContactInfoPhone = this.getEmergencyContactInfoPhone();
            String rhsEmergencyContactInfoPhone;
            rhsEmergencyContactInfoPhone = that.getEmergencyContactInfoPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyContactInfoPhone", lhsEmergencyContactInfoPhone), LocatorUtils.property(thatLocator, "emergencyContactInfoPhone", rhsEmergencyContactInfoPhone), lhsEmergencyContactInfoPhone, rhsEmergencyContactInfoPhone)) {
                return false;
            }
        }
        {
            String lhsEmergencyContactInfoEmail;
            lhsEmergencyContactInfoEmail = this.getEmergencyContactInfoEmail();
            String rhsEmergencyContactInfoEmail;
            rhsEmergencyContactInfoEmail = that.getEmergencyContactInfoEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emergencyContactInfoEmail", lhsEmergencyContactInfoEmail), LocatorUtils.property(thatLocator, "emergencyContactInfoEmail", rhsEmergencyContactInfoEmail), lhsEmergencyContactInfoEmail, rhsEmergencyContactInfoEmail)) {
                return false;
            }
        }
        {
            Boolean lhsPromotionalEmailOptIn;
            lhsPromotionalEmailOptIn = this.getPromotionalEmailOptIn();
            Boolean rhsPromotionalEmailOptIn;
            rhsPromotionalEmailOptIn = that.getPromotionalEmailOptIn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promotionalEmailOptIn", lhsPromotionalEmailOptIn), LocatorUtils.property(thatLocator, "promotionalEmailOptIn", rhsPromotionalEmailOptIn), lhsPromotionalEmailOptIn, rhsPromotionalEmailOptIn)) {
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
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsMiddleName;
            lhsMiddleName = this.getMiddleName();
            String rhsMiddleName;
            rhsMiddleName = that.getMiddleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "middleName", lhsMiddleName), LocatorUtils.property(thatLocator, "middleName", rhsMiddleName), lhsMiddleName, rhsMiddleName)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            Boolean lhsEmailOptIn;
            lhsEmailOptIn = this.getEmailOptIn();
            Boolean rhsEmailOptIn;
            rhsEmailOptIn = that.getEmailOptIn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailOptIn", lhsEmailOptIn), LocatorUtils.property(thatLocator, "emailOptIn", rhsEmailOptIn), lhsEmailOptIn, rhsEmailOptIn)) {
                return false;
            }
        }
        {
            String lhsAddressLine1;
            lhsAddressLine1 = this.getAddressLine1();
            String rhsAddressLine1;
            rhsAddressLine1 = that.getAddressLine1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine1", lhsAddressLine1), LocatorUtils.property(thatLocator, "addressLine1", rhsAddressLine1), lhsAddressLine1, rhsAddressLine1)) {
                return false;
            }
        }
        {
            String lhsAddressLine2;
            lhsAddressLine2 = this.getAddressLine2();
            String rhsAddressLine2;
            rhsAddressLine2 = that.getAddressLine2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine2", lhsAddressLine2), LocatorUtils.property(thatLocator, "addressLine2", rhsAddressLine2), lhsAddressLine2, rhsAddressLine2)) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            String lhsState;
            lhsState = this.getState();
            String rhsState;
            rhsState = that.getState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "state", lhsState), LocatorUtils.property(thatLocator, "state", rhsState), lhsState, rhsState)) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode)) {
                return false;
            }
        }
        {
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
                return false;
            }
        }
        {
            String lhsMobilePhone;
            lhsMobilePhone = this.getMobilePhone();
            String rhsMobilePhone;
            rhsMobilePhone = that.getMobilePhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilePhone", lhsMobilePhone), LocatorUtils.property(thatLocator, "mobilePhone", rhsMobilePhone), lhsMobilePhone, rhsMobilePhone)) {
                return false;
            }
        }
        {
            String lhsHomePhone;
            lhsHomePhone = this.getHomePhone();
            String rhsHomePhone;
            rhsHomePhone = that.getHomePhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homePhone", lhsHomePhone), LocatorUtils.property(thatLocator, "homePhone", rhsHomePhone), lhsHomePhone, rhsHomePhone)) {
                return false;
            }
        }
        {
            String lhsWorkPhone;
            lhsWorkPhone = this.getWorkPhone();
            String rhsWorkPhone;
            rhsWorkPhone = that.getWorkPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workPhone", lhsWorkPhone), LocatorUtils.property(thatLocator, "workPhone", rhsWorkPhone), lhsWorkPhone, rhsWorkPhone)) {
                return false;
            }
        }
        {
            String lhsWorkExtension;
            lhsWorkExtension = this.getWorkExtension();
            String rhsWorkExtension;
            rhsWorkExtension = that.getWorkExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workExtension", lhsWorkExtension), LocatorUtils.property(thatLocator, "workExtension", rhsWorkExtension), lhsWorkExtension, rhsWorkExtension)) {
                return false;
            }
        }
        {
            Date lhsBirthDate;
            lhsBirthDate = this.getBirthDate();
            Date rhsBirthDate;
            rhsBirthDate = that.getBirthDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDate", lhsBirthDate), LocatorUtils.property(thatLocator, "birthDate", rhsBirthDate), lhsBirthDate, rhsBirthDate)) {
                return false;
            }
        }
        {
            Date lhsFirstAppointmentDate;
            lhsFirstAppointmentDate = this.getFirstAppointmentDate();
            Date rhsFirstAppointmentDate;
            rhsFirstAppointmentDate = that.getFirstAppointmentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstAppointmentDate", lhsFirstAppointmentDate), LocatorUtils.property(thatLocator, "firstAppointmentDate", rhsFirstAppointmentDate), lhsFirstAppointmentDate, rhsFirstAppointmentDate)) {
                return false;
            }
        }
        {
            String lhsReferredBy;
            lhsReferredBy = this.getReferredBy();
            String rhsReferredBy;
            rhsReferredBy = that.getReferredBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referredBy", lhsReferredBy), LocatorUtils.property(thatLocator, "referredBy", rhsReferredBy), lhsReferredBy, rhsReferredBy)) {
                return false;
            }
        }
        {
            Location lhsHomeLocation;
            lhsHomeLocation = this.getHomeLocation();
            Location rhsHomeLocation;
            rhsHomeLocation = that.getHomeLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeLocation", lhsHomeLocation), LocatorUtils.property(thatLocator, "homeLocation", rhsHomeLocation), lhsHomeLocation, rhsHomeLocation)) {
                return false;
            }
        }
        {
            String lhsYellowAlert;
            lhsYellowAlert = this.getYellowAlert();
            String rhsYellowAlert;
            rhsYellowAlert = that.getYellowAlert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yellowAlert", lhsYellowAlert), LocatorUtils.property(thatLocator, "yellowAlert", rhsYellowAlert), lhsYellowAlert, rhsYellowAlert)) {
                return false;
            }
        }
        {
            String lhsRedAlert;
            lhsRedAlert = this.getRedAlert();
            String rhsRedAlert;
            rhsRedAlert = that.getRedAlert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "redAlert", lhsRedAlert), LocatorUtils.property(thatLocator, "redAlert", rhsRedAlert), lhsRedAlert, rhsRedAlert)) {
                return false;
            }
        }
        {
            String lhsPhotoURL;
            lhsPhotoURL = this.getPhotoURL();
            String rhsPhotoURL;
            rhsPhotoURL = that.getPhotoURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photoURL", lhsPhotoURL), LocatorUtils.property(thatLocator, "photoURL", rhsPhotoURL), lhsPhotoURL, rhsPhotoURL)) {
                return false;
            }
        }
        {
            Boolean lhsIsProspect;
            lhsIsProspect = this.getIsProspect();
            Boolean rhsIsProspect;
            rhsIsProspect = that.getIsProspect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isProspect", lhsIsProspect), LocatorUtils.property(thatLocator, "isProspect", rhsIsProspect), lhsIsProspect, rhsIsProspect)) {
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
            String theNewID;
            theNewID = this.getNewID();
            strategy.appendField(locator, this, "newID", buffer, theNewID);
        }
        {
            Double theAccountBalance;
            theAccountBalance = this.getAccountBalance();
            strategy.appendField(locator, this, "accountBalance", buffer, theAccountBalance);
        }
        {
            ArrayOfClientIndex theClientIndexes;
            theClientIndexes = this.getClientIndexes();
            strategy.appendField(locator, this, "clientIndexes", buffer, theClientIndexes);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            strategy.appendField(locator, this, "username", buffer, theUsername);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        {
            ClientCreditCard theClientCreditCard;
            theClientCreditCard = this.getClientCreditCard();
            strategy.appendField(locator, this, "clientCreditCard", buffer, theClientCreditCard);
        }
        {
            String theLastFormulaNotes;
            theLastFormulaNotes = this.getLastFormulaNotes();
            strategy.appendField(locator, this, "lastFormulaNotes", buffer, theLastFormulaNotes);
        }
        {
            String theAppointmentGenderPreference;
            theAppointmentGenderPreference = this.getAppointmentGenderPreference();
            strategy.appendField(locator, this, "appointmentGenderPreference", buffer, theAppointmentGenderPreference);
        }
        {
            String theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            Boolean theIsCompany;
            theIsCompany = this.getIsCompany();
            strategy.appendField(locator, this, "isCompany", buffer, theIsCompany);
        }
        {
            Boolean theInactive;
            theInactive = this.getInactive();
            strategy.appendField(locator, this, "inactive", buffer, theInactive);
        }
        {
            ArrayOfClientRelationship theClientRelationships;
            theClientRelationships = this.getClientRelationships();
            strategy.appendField(locator, this, "clientRelationships", buffer, theClientRelationships);
        }
        {
            ArrayOfRep theReps;
            theReps = this.getReps();
            strategy.appendField(locator, this, "reps", buffer, theReps);
        }
        {
            ArrayOfCustomClientField theCustomClientFields;
            theCustomClientFields = this.getCustomClientFields();
            strategy.appendField(locator, this, "customClientFields", buffer, theCustomClientFields);
        }
        {
            Boolean theLiabilityRelease;
            theLiabilityRelease = this.getLiabilityRelease();
            strategy.appendField(locator, this, "liabilityRelease", buffer, theLiabilityRelease);
        }
        {
            String theEmergencyContactInfoName;
            theEmergencyContactInfoName = this.getEmergencyContactInfoName();
            strategy.appendField(locator, this, "emergencyContactInfoName", buffer, theEmergencyContactInfoName);
        }
        {
            String theEmergencyContactInfoRelationship;
            theEmergencyContactInfoRelationship = this.getEmergencyContactInfoRelationship();
            strategy.appendField(locator, this, "emergencyContactInfoRelationship", buffer, theEmergencyContactInfoRelationship);
        }
        {
            String theEmergencyContactInfoPhone;
            theEmergencyContactInfoPhone = this.getEmergencyContactInfoPhone();
            strategy.appendField(locator, this, "emergencyContactInfoPhone", buffer, theEmergencyContactInfoPhone);
        }
        {
            String theEmergencyContactInfoEmail;
            theEmergencyContactInfoEmail = this.getEmergencyContactInfoEmail();
            strategy.appendField(locator, this, "emergencyContactInfoEmail", buffer, theEmergencyContactInfoEmail);
        }
        {
            Boolean thePromotionalEmailOptIn;
            thePromotionalEmailOptIn = this.getPromotionalEmailOptIn();
            strategy.appendField(locator, this, "promotionalEmailOptIn", buffer, thePromotionalEmailOptIn);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName);
        }
        {
            String theMiddleName;
            theMiddleName = this.getMiddleName();
            strategy.appendField(locator, this, "middleName", buffer, theMiddleName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            strategy.appendField(locator, this, "lastName", buffer, theLastName);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail);
        }
        {
            Boolean theEmailOptIn;
            theEmailOptIn = this.getEmailOptIn();
            strategy.appendField(locator, this, "emailOptIn", buffer, theEmailOptIn);
        }
        {
            String theAddressLine1;
            theAddressLine1 = this.getAddressLine1();
            strategy.appendField(locator, this, "addressLine1", buffer, theAddressLine1);
        }
        {
            String theAddressLine2;
            theAddressLine2 = this.getAddressLine2();
            strategy.appendField(locator, this, "addressLine2", buffer, theAddressLine2);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            String theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            String theMobilePhone;
            theMobilePhone = this.getMobilePhone();
            strategy.appendField(locator, this, "mobilePhone", buffer, theMobilePhone);
        }
        {
            String theHomePhone;
            theHomePhone = this.getHomePhone();
            strategy.appendField(locator, this, "homePhone", buffer, theHomePhone);
        }
        {
            String theWorkPhone;
            theWorkPhone = this.getWorkPhone();
            strategy.appendField(locator, this, "workPhone", buffer, theWorkPhone);
        }
        {
            String theWorkExtension;
            theWorkExtension = this.getWorkExtension();
            strategy.appendField(locator, this, "workExtension", buffer, theWorkExtension);
        }
        {
            Date theBirthDate;
            theBirthDate = this.getBirthDate();
            strategy.appendField(locator, this, "birthDate", buffer, theBirthDate);
        }
        {
            Date theFirstAppointmentDate;
            theFirstAppointmentDate = this.getFirstAppointmentDate();
            strategy.appendField(locator, this, "firstAppointmentDate", buffer, theFirstAppointmentDate);
        }
        {
            String theReferredBy;
            theReferredBy = this.getReferredBy();
            strategy.appendField(locator, this, "referredBy", buffer, theReferredBy);
        }
        {
            Location theHomeLocation;
            theHomeLocation = this.getHomeLocation();
            strategy.appendField(locator, this, "homeLocation", buffer, theHomeLocation);
        }
        {
            String theYellowAlert;
            theYellowAlert = this.getYellowAlert();
            strategy.appendField(locator, this, "yellowAlert", buffer, theYellowAlert);
        }
        {
            String theRedAlert;
            theRedAlert = this.getRedAlert();
            strategy.appendField(locator, this, "redAlert", buffer, theRedAlert);
        }
        {
            String thePhotoURL;
            thePhotoURL = this.getPhotoURL();
            strategy.appendField(locator, this, "photoURL", buffer, thePhotoURL);
        }
        {
            Boolean theIsProspect;
            theIsProspect = this.getIsProspect();
            strategy.appendField(locator, this, "isProspect", buffer, theIsProspect);
        }
        return buffer;
    }

}
