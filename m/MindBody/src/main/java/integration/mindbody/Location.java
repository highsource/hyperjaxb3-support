
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
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="BusinessID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BusinessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalImageURLs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="FacilitySquareFeet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TreatmentRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProSpaFinderSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasClasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Tax2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Tax3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Tax4" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Tax5" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DistanceInMiles" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanBook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "businessID",
    "siteID",
    "businessDescription",
    "additionalImageURLs",
    "facilitySquareFeet",
    "treatmentRooms",
    "proSpaFinderSite",
    "hasClasses",
    "phoneExtension",
    "action",
    "id",
    "name",
    "address",
    "address2",
    "tax1",
    "tax2",
    "tax3",
    "tax4",
    "tax5",
    "phone",
    "city",
    "stateProvCode",
    "postalCode",
    "latitude",
    "longitude",
    "distanceInMiles",
    "imageURL",
    "description",
    "hasSite",
    "canBook"
})
@Entity(name = "Location")
@Table(name = "LOCATION_")
@Inheritance(strategy = InheritanceType.JOINED)
public class Location
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BusinessID", nillable = true)
    protected Integer businessID;
    @XmlElement(name = "SiteID")
    protected Integer siteID;
    @XmlElement(name = "BusinessDescription")
    protected String businessDescription;
    @XmlElement(name = "AdditionalImageURLs")
    protected ArrayOfString additionalImageURLs;
    @XmlElement(name = "FacilitySquareFeet", nillable = true)
    protected Integer facilitySquareFeet;
    @XmlElement(name = "TreatmentRooms", nillable = true)
    protected Integer treatmentRooms;
    @XmlElement(name = "ProSpaFinderSite")
    protected Boolean proSpaFinderSite;
    @XmlElement(name = "HasClasses")
    protected Boolean hasClasses;
    @XmlElement(name = "PhoneExtension")
    protected String phoneExtension;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Tax1", nillable = true)
    protected Float tax1;
    @XmlElement(name = "Tax2", nillable = true)
    protected Float tax2;
    @XmlElement(name = "Tax3", nillable = true)
    protected Float tax3;
    @XmlElement(name = "Tax4", nillable = true)
    protected Float tax4;
    @XmlElement(name = "Tax5", nillable = true)
    protected Float tax5;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateProvCode")
    protected String stateProvCode;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Latitude", nillable = true)
    protected Double latitude;
    @XmlElement(name = "Longitude", nillable = true)
    protected Double longitude;
    @XmlElement(name = "DistanceInMiles", nillable = true)
    protected Double distanceInMiles;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "HasSite", nillable = true)
    protected Boolean hasSite;
    @XmlElement(name = "CanBook", nillable = true)
    protected Boolean canBook;

    /**
     * Gets the value of the businessID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "BUSINESS_ID", precision = 10, scale = 0)
    public Integer getBusinessID() {
        return businessID;
    }

    /**
     * Sets the value of the businessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessID(Integer value) {
        this.businessID = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "SITE_ID", precision = 10, scale = 0)
    public Integer getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteID(Integer value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the businessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BUSINESS_DESCRIPTION", length = 255)
    public String getBusinessDescription() {
        return businessDescription;
    }

    /**
     * Sets the value of the businessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDescription(String value) {
        this.businessDescription = value;
    }

    /**
     * Gets the value of the additionalImageURLs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfString.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDITIONAL_IMAGE_URLS_LOCATI_0")
    public ArrayOfString getAdditionalImageURLs() {
        return additionalImageURLs;
    }

    /**
     * Sets the value of the additionalImageURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAdditionalImageURLs(ArrayOfString value) {
        this.additionalImageURLs = value;
    }

    /**
     * Gets the value of the facilitySquareFeet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "FACILITY_SQUARE_FEET", precision = 10, scale = 0)
    public Integer getFacilitySquareFeet() {
        return facilitySquareFeet;
    }

    /**
     * Sets the value of the facilitySquareFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFacilitySquareFeet(Integer value) {
        this.facilitySquareFeet = value;
    }

    /**
     * Gets the value of the treatmentRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "TREATMENT_ROOMS", precision = 10, scale = 0)
    public Integer getTreatmentRooms() {
        return treatmentRooms;
    }

    /**
     * Sets the value of the treatmentRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTreatmentRooms(Integer value) {
        this.treatmentRooms = value;
    }

    /**
     * Gets the value of the proSpaFinderSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "PRO_SPA_FINDER_SITE")
    public Boolean getProSpaFinderSite() {
        return proSpaFinderSite;
    }

    /**
     * Sets the value of the proSpaFinderSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProSpaFinderSite(Boolean value) {
        this.proSpaFinderSite = value;
    }

    /**
     * Gets the value of the hasClasses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "HAS_CLASSES")
    public Boolean getHasClasses() {
        return hasClasses;
    }

    /**
     * Sets the value of the hasClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasClasses(Boolean value) {
        this.hasClasses = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PHONE_EXTENSION", length = 255)
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
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
     * Gets the value of the tax1 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "TAX_1", precision = 20, scale = 10)
    public Float getTax1() {
        return tax1;
    }

    /**
     * Sets the value of the tax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTax1(Float value) {
        this.tax1 = value;
    }

    /**
     * Gets the value of the tax2 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "TAX_2", precision = 20, scale = 10)
    public Float getTax2() {
        return tax2;
    }

    /**
     * Sets the value of the tax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTax2(Float value) {
        this.tax2 = value;
    }

    /**
     * Gets the value of the tax3 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "TAX_3", precision = 20, scale = 10)
    public Float getTax3() {
        return tax3;
    }

    /**
     * Sets the value of the tax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTax3(Float value) {
        this.tax3 = value;
    }

    /**
     * Gets the value of the tax4 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "TAX_4", precision = 20, scale = 10)
    public Float getTax4() {
        return tax4;
    }

    /**
     * Sets the value of the tax4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTax4(Float value) {
        this.tax4 = value;
    }

    /**
     * Gets the value of the tax5 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "TAX_5", precision = 20, scale = 10)
    public Float getTax5() {
        return tax5;
    }

    /**
     * Sets the value of the tax5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTax5(Float value) {
        this.tax5 = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PHONE", length = 255)
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Gets the value of the stateProvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATE_PROV_CODE", length = 255)
    public String getStateProvCode() {
        return stateProvCode;
    }

    /**
     * Sets the value of the stateProvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvCode(String value) {
        this.stateProvCode = value;
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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Basic
    @Column(name = "LATITUDE", precision = 20, scale = 10)
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Basic
    @Column(name = "LONGITUDE", precision = 20, scale = 10)
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the distanceInMiles property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Basic
    @Column(name = "DISTANCE_IN_MILES", precision = 20, scale = 10)
    public Double getDistanceInMiles() {
        return distanceInMiles;
    }

    /**
     * Sets the value of the distanceInMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceInMiles(Double value) {
        this.distanceInMiles = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", length = 2500)
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the hasSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "HAS_SITE")
    public Boolean getHasSite() {
        return hasSite;
    }

    /**
     * Sets the value of the hasSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSite(Boolean value) {
        this.hasSite = value;
    }

    /**
     * Gets the value of the canBook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "CAN_BOOK")
    public Boolean getCanBook() {
        return canBook;
    }

    /**
     * Sets the value of the canBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBook(Boolean value) {
        this.canBook = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theBusinessID;
            theBusinessID = this.getBusinessID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessID", theBusinessID), currentHashCode, theBusinessID);
        }
        {
            Integer theSiteID;
            theSiteID = this.getSiteID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "siteID", theSiteID), currentHashCode, theSiteID);
        }
        {
            String theBusinessDescription;
            theBusinessDescription = this.getBusinessDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDescription", theBusinessDescription), currentHashCode, theBusinessDescription);
        }
        {
            ArrayOfString theAdditionalImageURLs;
            theAdditionalImageURLs = this.getAdditionalImageURLs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalImageURLs", theAdditionalImageURLs), currentHashCode, theAdditionalImageURLs);
        }
        {
            Integer theFacilitySquareFeet;
            theFacilitySquareFeet = this.getFacilitySquareFeet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilitySquareFeet", theFacilitySquareFeet), currentHashCode, theFacilitySquareFeet);
        }
        {
            Integer theTreatmentRooms;
            theTreatmentRooms = this.getTreatmentRooms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "treatmentRooms", theTreatmentRooms), currentHashCode, theTreatmentRooms);
        }
        {
            Boolean theProSpaFinderSite;
            theProSpaFinderSite = this.getProSpaFinderSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proSpaFinderSite", theProSpaFinderSite), currentHashCode, theProSpaFinderSite);
        }
        {
            Boolean theHasClasses;
            theHasClasses = this.getHasClasses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasClasses", theHasClasses), currentHashCode, theHasClasses);
        }
        {
            String thePhoneExtension;
            thePhoneExtension = this.getPhoneExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phoneExtension", thePhoneExtension), currentHashCode, thePhoneExtension);
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
            Float theTax1;
            theTax1 = this.getTax1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax1", theTax1), currentHashCode, theTax1);
        }
        {
            Float theTax2;
            theTax2 = this.getTax2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax2", theTax2), currentHashCode, theTax2);
        }
        {
            Float theTax3;
            theTax3 = this.getTax3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax3", theTax3), currentHashCode, theTax3);
        }
        {
            Float theTax4;
            theTax4 = this.getTax4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax4", theTax4), currentHashCode, theTax4);
        }
        {
            Float theTax5;
            theTax5 = this.getTax5();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax5", theTax5), currentHashCode, theTax5);
        }
        {
            String thePhone;
            thePhone = this.getPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phone", thePhone), currentHashCode, thePhone);
        }
        {
            String theCity;
            theCity = this.getCity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode, theCity);
        }
        {
            String theStateProvCode;
            theStateProvCode = this.getStateProvCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateProvCode", theStateProvCode), currentHashCode, theStateProvCode);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode);
        }
        {
            Double theLatitude;
            theLatitude = this.getLatitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitude", theLatitude), currentHashCode, theLatitude);
        }
        {
            Double theLongitude;
            theLongitude = this.getLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitude", theLongitude), currentHashCode, theLongitude);
        }
        {
            Double theDistanceInMiles;
            theDistanceInMiles = this.getDistanceInMiles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distanceInMiles", theDistanceInMiles), currentHashCode, theDistanceInMiles);
        }
        {
            String theImageURL;
            theImageURL = this.getImageURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageURL", theImageURL), currentHashCode, theImageURL);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            Boolean theHasSite;
            theHasSite = this.getHasSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hasSite", theHasSite), currentHashCode, theHasSite);
        }
        {
            Boolean theCanBook;
            theCanBook = this.getCanBook();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canBook", theCanBook), currentHashCode, theCanBook);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Location)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Location that = ((Location) object);
        {
            Integer lhsBusinessID;
            lhsBusinessID = this.getBusinessID();
            Integer rhsBusinessID;
            rhsBusinessID = that.getBusinessID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessID", lhsBusinessID), LocatorUtils.property(thatLocator, "businessID", rhsBusinessID), lhsBusinessID, rhsBusinessID)) {
                return false;
            }
        }
        {
            Integer lhsSiteID;
            lhsSiteID = this.getSiteID();
            Integer rhsSiteID;
            rhsSiteID = that.getSiteID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteID", lhsSiteID), LocatorUtils.property(thatLocator, "siteID", rhsSiteID), lhsSiteID, rhsSiteID)) {
                return false;
            }
        }
        {
            String lhsBusinessDescription;
            lhsBusinessDescription = this.getBusinessDescription();
            String rhsBusinessDescription;
            rhsBusinessDescription = that.getBusinessDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDescription", lhsBusinessDescription), LocatorUtils.property(thatLocator, "businessDescription", rhsBusinessDescription), lhsBusinessDescription, rhsBusinessDescription)) {
                return false;
            }
        }
        {
            ArrayOfString lhsAdditionalImageURLs;
            lhsAdditionalImageURLs = this.getAdditionalImageURLs();
            ArrayOfString rhsAdditionalImageURLs;
            rhsAdditionalImageURLs = that.getAdditionalImageURLs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalImageURLs", lhsAdditionalImageURLs), LocatorUtils.property(thatLocator, "additionalImageURLs", rhsAdditionalImageURLs), lhsAdditionalImageURLs, rhsAdditionalImageURLs)) {
                return false;
            }
        }
        {
            Integer lhsFacilitySquareFeet;
            lhsFacilitySquareFeet = this.getFacilitySquareFeet();
            Integer rhsFacilitySquareFeet;
            rhsFacilitySquareFeet = that.getFacilitySquareFeet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilitySquareFeet", lhsFacilitySquareFeet), LocatorUtils.property(thatLocator, "facilitySquareFeet", rhsFacilitySquareFeet), lhsFacilitySquareFeet, rhsFacilitySquareFeet)) {
                return false;
            }
        }
        {
            Integer lhsTreatmentRooms;
            lhsTreatmentRooms = this.getTreatmentRooms();
            Integer rhsTreatmentRooms;
            rhsTreatmentRooms = that.getTreatmentRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "treatmentRooms", lhsTreatmentRooms), LocatorUtils.property(thatLocator, "treatmentRooms", rhsTreatmentRooms), lhsTreatmentRooms, rhsTreatmentRooms)) {
                return false;
            }
        }
        {
            Boolean lhsProSpaFinderSite;
            lhsProSpaFinderSite = this.getProSpaFinderSite();
            Boolean rhsProSpaFinderSite;
            rhsProSpaFinderSite = that.getProSpaFinderSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proSpaFinderSite", lhsProSpaFinderSite), LocatorUtils.property(thatLocator, "proSpaFinderSite", rhsProSpaFinderSite), lhsProSpaFinderSite, rhsProSpaFinderSite)) {
                return false;
            }
        }
        {
            Boolean lhsHasClasses;
            lhsHasClasses = this.getHasClasses();
            Boolean rhsHasClasses;
            rhsHasClasses = that.getHasClasses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasClasses", lhsHasClasses), LocatorUtils.property(thatLocator, "hasClasses", rhsHasClasses), lhsHasClasses, rhsHasClasses)) {
                return false;
            }
        }
        {
            String lhsPhoneExtension;
            lhsPhoneExtension = this.getPhoneExtension();
            String rhsPhoneExtension;
            rhsPhoneExtension = that.getPhoneExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneExtension", lhsPhoneExtension), LocatorUtils.property(thatLocator, "phoneExtension", rhsPhoneExtension), lhsPhoneExtension, rhsPhoneExtension)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            Float lhsTax1;
            lhsTax1 = this.getTax1();
            Float rhsTax1;
            rhsTax1 = that.getTax1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax1", lhsTax1), LocatorUtils.property(thatLocator, "tax1", rhsTax1), lhsTax1, rhsTax1)) {
                return false;
            }
        }
        {
            Float lhsTax2;
            lhsTax2 = this.getTax2();
            Float rhsTax2;
            rhsTax2 = that.getTax2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax2", lhsTax2), LocatorUtils.property(thatLocator, "tax2", rhsTax2), lhsTax2, rhsTax2)) {
                return false;
            }
        }
        {
            Float lhsTax3;
            lhsTax3 = this.getTax3();
            Float rhsTax3;
            rhsTax3 = that.getTax3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax3", lhsTax3), LocatorUtils.property(thatLocator, "tax3", rhsTax3), lhsTax3, rhsTax3)) {
                return false;
            }
        }
        {
            Float lhsTax4;
            lhsTax4 = this.getTax4();
            Float rhsTax4;
            rhsTax4 = that.getTax4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax4", lhsTax4), LocatorUtils.property(thatLocator, "tax4", rhsTax4), lhsTax4, rhsTax4)) {
                return false;
            }
        }
        {
            Float lhsTax5;
            lhsTax5 = this.getTax5();
            Float rhsTax5;
            rhsTax5 = that.getTax5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax5", lhsTax5), LocatorUtils.property(thatLocator, "tax5", rhsTax5), lhsTax5, rhsTax5)) {
                return false;
            }
        }
        {
            String lhsPhone;
            lhsPhone = this.getPhone();
            String rhsPhone;
            rhsPhone = that.getPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone)) {
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
            String lhsStateProvCode;
            lhsStateProvCode = this.getStateProvCode();
            String rhsStateProvCode;
            rhsStateProvCode = that.getStateProvCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateProvCode", lhsStateProvCode), LocatorUtils.property(thatLocator, "stateProvCode", rhsStateProvCode), lhsStateProvCode, rhsStateProvCode)) {
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
            Double lhsLatitude;
            lhsLatitude = this.getLatitude();
            Double rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                return false;
            }
        }
        {
            Double lhsLongitude;
            lhsLongitude = this.getLongitude();
            Double rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                return false;
            }
        }
        {
            Double lhsDistanceInMiles;
            lhsDistanceInMiles = this.getDistanceInMiles();
            Double rhsDistanceInMiles;
            rhsDistanceInMiles = that.getDistanceInMiles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceInMiles", lhsDistanceInMiles), LocatorUtils.property(thatLocator, "distanceInMiles", rhsDistanceInMiles), lhsDistanceInMiles, rhsDistanceInMiles)) {
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
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            Boolean lhsHasSite;
            lhsHasSite = this.getHasSite();
            Boolean rhsHasSite;
            rhsHasSite = that.getHasSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasSite", lhsHasSite), LocatorUtils.property(thatLocator, "hasSite", rhsHasSite), lhsHasSite, rhsHasSite)) {
                return false;
            }
        }
        {
            Boolean lhsCanBook;
            lhsCanBook = this.getCanBook();
            Boolean rhsCanBook;
            rhsCanBook = that.getCanBook();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canBook", lhsCanBook), LocatorUtils.property(thatLocator, "canBook", rhsCanBook), lhsCanBook, rhsCanBook)) {
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
            Integer theBusinessID;
            theBusinessID = this.getBusinessID();
            strategy.appendField(locator, this, "businessID", buffer, theBusinessID);
        }
        {
            Integer theSiteID;
            theSiteID = this.getSiteID();
            strategy.appendField(locator, this, "siteID", buffer, theSiteID);
        }
        {
            String theBusinessDescription;
            theBusinessDescription = this.getBusinessDescription();
            strategy.appendField(locator, this, "businessDescription", buffer, theBusinessDescription);
        }
        {
            ArrayOfString theAdditionalImageURLs;
            theAdditionalImageURLs = this.getAdditionalImageURLs();
            strategy.appendField(locator, this, "additionalImageURLs", buffer, theAdditionalImageURLs);
        }
        {
            Integer theFacilitySquareFeet;
            theFacilitySquareFeet = this.getFacilitySquareFeet();
            strategy.appendField(locator, this, "facilitySquareFeet", buffer, theFacilitySquareFeet);
        }
        {
            Integer theTreatmentRooms;
            theTreatmentRooms = this.getTreatmentRooms();
            strategy.appendField(locator, this, "treatmentRooms", buffer, theTreatmentRooms);
        }
        {
            Boolean theProSpaFinderSite;
            theProSpaFinderSite = this.getProSpaFinderSite();
            strategy.appendField(locator, this, "proSpaFinderSite", buffer, theProSpaFinderSite);
        }
        {
            Boolean theHasClasses;
            theHasClasses = this.getHasClasses();
            strategy.appendField(locator, this, "hasClasses", buffer, theHasClasses);
        }
        {
            String thePhoneExtension;
            thePhoneExtension = this.getPhoneExtension();
            strategy.appendField(locator, this, "phoneExtension", buffer, thePhoneExtension);
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
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
            Float theTax1;
            theTax1 = this.getTax1();
            strategy.appendField(locator, this, "tax1", buffer, theTax1);
        }
        {
            Float theTax2;
            theTax2 = this.getTax2();
            strategy.appendField(locator, this, "tax2", buffer, theTax2);
        }
        {
            Float theTax3;
            theTax3 = this.getTax3();
            strategy.appendField(locator, this, "tax3", buffer, theTax3);
        }
        {
            Float theTax4;
            theTax4 = this.getTax4();
            strategy.appendField(locator, this, "tax4", buffer, theTax4);
        }
        {
            Float theTax5;
            theTax5 = this.getTax5();
            strategy.appendField(locator, this, "tax5", buffer, theTax5);
        }
        {
            String thePhone;
            thePhone = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, thePhone);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            String theStateProvCode;
            theStateProvCode = this.getStateProvCode();
            strategy.appendField(locator, this, "stateProvCode", buffer, theStateProvCode);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
        }
        {
            Double theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude);
        }
        {
            Double theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude);
        }
        {
            Double theDistanceInMiles;
            theDistanceInMiles = this.getDistanceInMiles();
            strategy.appendField(locator, this, "distanceInMiles", buffer, theDistanceInMiles);
        }
        {
            String theImageURL;
            theImageURL = this.getImageURL();
            strategy.appendField(locator, this, "imageURL", buffer, theImageURL);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            Boolean theHasSite;
            theHasSite = this.getHasSite();
            strategy.appendField(locator, this, "hasSite", buffer, theHasSite);
        }
        {
            Boolean theCanBook;
            theCanBook = this.getCanBook();
            strategy.appendField(locator, this, "canBook", buffer, theCanBook);
        }
        return buffer;
    }

}
