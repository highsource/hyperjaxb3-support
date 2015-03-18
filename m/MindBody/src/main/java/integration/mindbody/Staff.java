
package integration.mindbody;

import java.io.Serializable;
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
 * <p>Java class for Staff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="Appointments" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfAppointment" minOccurs="0"/>
 *         &lt;element name="Unavailabilities" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfUnavailability" minOccurs="0"/>
 *         &lt;element name="Availabilities" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfAvailability" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoginLocations" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfLocation" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staff", propOrder = {
    "appointments",
    "unavailabilities",
    "availabilities",
    "email",
    "mobilePhone",
    "homePhone",
    "workPhone",
    "address",
    "address2",
    "city",
    "state",
    "country",
    "postalCode",
    "foreignZip",
    "sortOrder",
    "loginLocations",
    "action",
    "id",
    "name",
    "firstName",
    "lastName",
    "imageURL",
    "bio",
    "isMale"
})
@Entity(name = "Staff")
@Table(name = "STAFF")
@Inheritance(strategy = InheritanceType.JOINED)
public class Staff
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Appointments")
    protected ArrayOfAppointment appointments;
    @XmlElement(name = "Unavailabilities")
    protected ArrayOfUnavailability unavailabilities;
    @XmlElement(name = "Availabilities")
    protected ArrayOfAvailability availabilities;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "ForeignZip")
    protected String foreignZip;
    @XmlElement(name = "SortOrder")
    protected Integer sortOrder;
    @XmlElement(name = "LoginLocations")
    protected ArrayOfLocation loginLocations;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Long id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "Bio")
    protected String bio;
    protected boolean isMale;

    /**
     * Gets the value of the appointments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppointment }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfAppointment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "APPOINTMENTS_STAFF_HJID")
    public ArrayOfAppointment getAppointments() {
        return appointments;
    }

    /**
     * Sets the value of the appointments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppointment }
     *     
     */
    public void setAppointments(ArrayOfAppointment value) {
        this.appointments = value;
    }

    /**
     * Gets the value of the unavailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnavailability }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfUnavailability.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "UNAVAILABILITIES_STAFF_HJID")
    public ArrayOfUnavailability getUnavailabilities() {
        return unavailabilities;
    }

    /**
     * Sets the value of the unavailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnavailability }
     *     
     */
    public void setUnavailabilities(ArrayOfUnavailability value) {
        this.unavailabilities = value;
    }

    /**
     * Gets the value of the availabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfAvailability.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AVAILABILITIES_STAFF_HJID")
    public ArrayOfAvailability getAvailabilities() {
        return availabilities;
    }

    /**
     * Sets the value of the availabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setAvailabilities(ArrayOfAvailability value) {
        this.availabilities = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDRESS", length = 255)
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDRESS_2", length = 255)
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
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
     * Gets the value of the foreignZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FOREIGN_ZIP", length = 255)
    public String getForeignZip() {
        return foreignZip;
    }

    /**
     * Sets the value of the foreignZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignZip(String value) {
        this.foreignZip = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "SORT_ORDER", precision = 10, scale = 0)
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the loginLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfLocation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOGIN_LOCATIONS_STAFF_HJID")
    public ArrayOfLocation getLoginLocations() {
        return loginLocations;
    }

    /**
     * Sets the value of the loginLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setLoginLocations(ArrayOfLocation value) {
        this.loginLocations = value;
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
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "IMAGE_URL", length = 255)
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the bio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BIO", length = 750)
    public String getBio() {
        return bio;
    }

    /**
     * Sets the value of the bio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBio(String value) {
        this.bio = value;
    }

    /**
     * Gets the value of the isMale property.
     * 
     */
    @Basic
    @Column(name = "IS_MALE")
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * Sets the value of the isMale property.
     * 
     */
    public void setIsMale(boolean value) {
        this.isMale = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfAppointment theAppointments;
            theAppointments = this.getAppointments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appointments", theAppointments), currentHashCode, theAppointments);
        }
        {
            ArrayOfUnavailability theUnavailabilities;
            theUnavailabilities = this.getUnavailabilities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unavailabilities", theUnavailabilities), currentHashCode, theUnavailabilities);
        }
        {
            ArrayOfAvailability theAvailabilities;
            theAvailabilities = this.getAvailabilities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availabilities", theAvailabilities), currentHashCode, theAvailabilities);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
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
            String theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            String theAddress2;
            theAddress2 = this.getAddress2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address2", theAddress2), currentHashCode, theAddress2);
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
            String theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode);
        }
        {
            String theForeignZip;
            theForeignZip = this.getForeignZip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "foreignZip", theForeignZip), currentHashCode, theForeignZip);
        }
        {
            Integer theSortOrder;
            theSortOrder = this.getSortOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortOrder", theSortOrder), currentHashCode, theSortOrder);
        }
        {
            ArrayOfLocation theLoginLocations;
            theLoginLocations = this.getLoginLocations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loginLocations", theLoginLocations), currentHashCode, theLoginLocations);
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            String theImageURL;
            theImageURL = this.getImageURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageURL", theImageURL), currentHashCode, theImageURL);
        }
        {
            String theBio;
            theBio = this.getBio();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bio", theBio), currentHashCode, theBio);
        }
        {
            boolean theIsMale;
            theIsMale = this.isIsMale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isMale", theIsMale), currentHashCode, theIsMale);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Staff)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Staff that = ((Staff) object);
        {
            ArrayOfAppointment lhsAppointments;
            lhsAppointments = this.getAppointments();
            ArrayOfAppointment rhsAppointments;
            rhsAppointments = that.getAppointments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appointments", lhsAppointments), LocatorUtils.property(thatLocator, "appointments", rhsAppointments), lhsAppointments, rhsAppointments)) {
                return false;
            }
        }
        {
            ArrayOfUnavailability lhsUnavailabilities;
            lhsUnavailabilities = this.getUnavailabilities();
            ArrayOfUnavailability rhsUnavailabilities;
            rhsUnavailabilities = that.getUnavailabilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unavailabilities", lhsUnavailabilities), LocatorUtils.property(thatLocator, "unavailabilities", rhsUnavailabilities), lhsUnavailabilities, rhsUnavailabilities)) {
                return false;
            }
        }
        {
            ArrayOfAvailability lhsAvailabilities;
            lhsAvailabilities = this.getAvailabilities();
            ArrayOfAvailability rhsAvailabilities;
            rhsAvailabilities = that.getAvailabilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availabilities", lhsAvailabilities), LocatorUtils.property(thatLocator, "availabilities", rhsAvailabilities), lhsAvailabilities, rhsAvailabilities)) {
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
            String lhsAddress;
            lhsAddress = this.getAddress();
            String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            String lhsAddress2;
            lhsAddress2 = this.getAddress2();
            String rhsAddress2;
            rhsAddress2 = that.getAddress2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address2", lhsAddress2), LocatorUtils.property(thatLocator, "address2", rhsAddress2), lhsAddress2, rhsAddress2)) {
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
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
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
            String lhsForeignZip;
            lhsForeignZip = this.getForeignZip();
            String rhsForeignZip;
            rhsForeignZip = that.getForeignZip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreignZip", lhsForeignZip), LocatorUtils.property(thatLocator, "foreignZip", rhsForeignZip), lhsForeignZip, rhsForeignZip)) {
                return false;
            }
        }
        {
            Integer lhsSortOrder;
            lhsSortOrder = this.getSortOrder();
            Integer rhsSortOrder;
            rhsSortOrder = that.getSortOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortOrder", lhsSortOrder), LocatorUtils.property(thatLocator, "sortOrder", rhsSortOrder), lhsSortOrder, rhsSortOrder)) {
                return false;
            }
        }
        {
            ArrayOfLocation lhsLoginLocations;
            lhsLoginLocations = this.getLoginLocations();
            ArrayOfLocation rhsLoginLocations;
            rhsLoginLocations = that.getLoginLocations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loginLocations", lhsLoginLocations), LocatorUtils.property(thatLocator, "loginLocations", rhsLoginLocations), lhsLoginLocations, rhsLoginLocations)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            String lhsImageURL;
            lhsImageURL = this.getImageURL();
            String rhsImageURL;
            rhsImageURL = that.getImageURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageURL", lhsImageURL), LocatorUtils.property(thatLocator, "imageURL", rhsImageURL), lhsImageURL, rhsImageURL)) {
                return false;
            }
        }
        {
            String lhsBio;
            lhsBio = this.getBio();
            String rhsBio;
            rhsBio = that.getBio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bio", lhsBio), LocatorUtils.property(thatLocator, "bio", rhsBio), lhsBio, rhsBio)) {
                return false;
            }
        }
        {
            boolean lhsIsMale;
            lhsIsMale = this.isIsMale();
            boolean rhsIsMale;
            rhsIsMale = that.isIsMale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isMale", lhsIsMale), LocatorUtils.property(thatLocator, "isMale", rhsIsMale), lhsIsMale, rhsIsMale)) {
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
            ArrayOfAppointment theAppointments;
            theAppointments = this.getAppointments();
            strategy.appendField(locator, this, "appointments", buffer, theAppointments);
        }
        {
            ArrayOfUnavailability theUnavailabilities;
            theUnavailabilities = this.getUnavailabilities();
            strategy.appendField(locator, this, "unavailabilities", buffer, theUnavailabilities);
        }
        {
            ArrayOfAvailability theAvailabilities;
            theAvailabilities = this.getAvailabilities();
            strategy.appendField(locator, this, "availabilities", buffer, theAvailabilities);
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail);
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
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            String theAddress2;
            theAddress2 = this.getAddress2();
            strategy.appendField(locator, this, "address2", buffer, theAddress2);
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
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
        }
        {
            String theForeignZip;
            theForeignZip = this.getForeignZip();
            strategy.appendField(locator, this, "foreignZip", buffer, theForeignZip);
        }
        {
            Integer theSortOrder;
            theSortOrder = this.getSortOrder();
            strategy.appendField(locator, this, "sortOrder", buffer, theSortOrder);
        }
        {
            ArrayOfLocation theLoginLocations;
            theLoginLocations = this.getLoginLocations();
            strategy.appendField(locator, this, "loginLocations", buffer, theLoginLocations);
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            strategy.appendField(locator, this, "lastName", buffer, theLastName);
        }
        {
            String theImageURL;
            theImageURL = this.getImageURL();
            strategy.appendField(locator, this, "imageURL", buffer, theImageURL);
        }
        {
            String theBio;
            theBio = this.getBio();
            strategy.appendField(locator, this, "bio", buffer, theBio);
        }
        {
            boolean theIsMale;
            theIsMale = this.isIsMale();
            strategy.appendField(locator, this, "isMale", buffer, theIsMale);
        }
        return buffer;
    }

}
