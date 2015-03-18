
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for Site complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Site">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageColor4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptsVisa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsDiscover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsMasterCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcceptsAmericanExpress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalWOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxInclusivePrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", propOrder = {
    "id",
    "name",
    "description",
    "logoURL",
    "pageColor1",
    "pageColor2",
    "pageColor3",
    "pageColor4",
    "acceptsVisa",
    "acceptsDiscover",
    "acceptsMasterCard",
    "acceptsAmericanExpress",
    "contactEmail",
    "esa",
    "totalWOD",
    "taxInclusivePrices"
})
@Entity(name = "Site")
@Table(name = "SITE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Site
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "PageColor1")
    protected String pageColor1;
    @XmlElement(name = "PageColor2")
    protected String pageColor2;
    @XmlElement(name = "PageColor3")
    protected String pageColor3;
    @XmlElement(name = "PageColor4")
    protected String pageColor4;
    @XmlElement(name = "AcceptsVisa")
    protected Boolean acceptsVisa;
    @XmlElement(name = "AcceptsDiscover")
    protected Boolean acceptsDiscover;
    @XmlElement(name = "AcceptsMasterCard")
    protected Boolean acceptsMasterCard;
    @XmlElement(name = "AcceptsAmericanExpress")
    protected Boolean acceptsAmericanExpress;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ESA", nillable = true)
    protected Boolean esa;
    @XmlElement(name = "TotalWOD", nillable = true)
    protected Boolean totalWOD;
    @XmlElement(name = "TaxInclusivePrices", nillable = true)
    protected Boolean taxInclusivePrices;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", length = 255)
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
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LOGO_URL", length = 255)
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the pageColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE_COLOR_1", length = 255)
    public String getPageColor1() {
        return pageColor1;
    }

    /**
     * Sets the value of the pageColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor1(String value) {
        this.pageColor1 = value;
    }

    /**
     * Gets the value of the pageColor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE_COLOR_2", length = 255)
    public String getPageColor2() {
        return pageColor2;
    }

    /**
     * Sets the value of the pageColor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor2(String value) {
        this.pageColor2 = value;
    }

    /**
     * Gets the value of the pageColor3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE_COLOR_3", length = 255)
    public String getPageColor3() {
        return pageColor3;
    }

    /**
     * Sets the value of the pageColor3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor3(String value) {
        this.pageColor3 = value;
    }

    /**
     * Gets the value of the pageColor4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE_COLOR_4", length = 255)
    public String getPageColor4() {
        return pageColor4;
    }

    /**
     * Sets the value of the pageColor4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageColor4(String value) {
        this.pageColor4 = value;
    }

    /**
     * Gets the value of the acceptsVisa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ACCEPTS_VISA")
    public Boolean getAcceptsVisa() {
        return acceptsVisa;
    }

    /**
     * Sets the value of the acceptsVisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsVisa(Boolean value) {
        this.acceptsVisa = value;
    }

    /**
     * Gets the value of the acceptsDiscover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ACCEPTS_DISCOVER")
    public Boolean getAcceptsDiscover() {
        return acceptsDiscover;
    }

    /**
     * Sets the value of the acceptsDiscover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsDiscover(Boolean value) {
        this.acceptsDiscover = value;
    }

    /**
     * Gets the value of the acceptsMasterCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ACCEPTS_MASTER_CARD")
    public Boolean getAcceptsMasterCard() {
        return acceptsMasterCard;
    }

    /**
     * Sets the value of the acceptsMasterCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsMasterCard(Boolean value) {
        this.acceptsMasterCard = value;
    }

    /**
     * Gets the value of the acceptsAmericanExpress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ACCEPTS_AMERICAN_EXPRESS")
    public Boolean getAcceptsAmericanExpress() {
        return acceptsAmericanExpress;
    }

    /**
     * Sets the value of the acceptsAmericanExpress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptsAmericanExpress(Boolean value) {
        this.acceptsAmericanExpress = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONTACT_EMAIL", length = 255)
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the esa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ESA")
    public Boolean getESA() {
        return esa;
    }

    /**
     * Sets the value of the esa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setESA(Boolean value) {
        this.esa = value;
    }

    /**
     * Gets the value of the totalWOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "TOTAL_WOD")
    public Boolean getTotalWOD() {
        return totalWOD;
    }

    /**
     * Sets the value of the totalWOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWOD(Boolean value) {
        this.totalWOD = value;
    }

    /**
     * Gets the value of the taxInclusivePrices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "TAX_INCLUSIVE_PRICES")
    public Boolean getTaxInclusivePrices() {
        return taxInclusivePrices;
    }

    /**
     * Sets the value of the taxInclusivePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusivePrices(Boolean value) {
        this.taxInclusivePrices = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theLogoURL;
            theLogoURL = this.getLogoURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logoURL", theLogoURL), currentHashCode, theLogoURL);
        }
        {
            String thePageColor1;
            thePageColor1 = this.getPageColor1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageColor1", thePageColor1), currentHashCode, thePageColor1);
        }
        {
            String thePageColor2;
            thePageColor2 = this.getPageColor2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageColor2", thePageColor2), currentHashCode, thePageColor2);
        }
        {
            String thePageColor3;
            thePageColor3 = this.getPageColor3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageColor3", thePageColor3), currentHashCode, thePageColor3);
        }
        {
            String thePageColor4;
            thePageColor4 = this.getPageColor4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageColor4", thePageColor4), currentHashCode, thePageColor4);
        }
        {
            Boolean theAcceptsVisa;
            theAcceptsVisa = this.getAcceptsVisa();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptsVisa", theAcceptsVisa), currentHashCode, theAcceptsVisa);
        }
        {
            Boolean theAcceptsDiscover;
            theAcceptsDiscover = this.getAcceptsDiscover();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptsDiscover", theAcceptsDiscover), currentHashCode, theAcceptsDiscover);
        }
        {
            Boolean theAcceptsMasterCard;
            theAcceptsMasterCard = this.getAcceptsMasterCard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptsMasterCard", theAcceptsMasterCard), currentHashCode, theAcceptsMasterCard);
        }
        {
            Boolean theAcceptsAmericanExpress;
            theAcceptsAmericanExpress = this.getAcceptsAmericanExpress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptsAmericanExpress", theAcceptsAmericanExpress), currentHashCode, theAcceptsAmericanExpress);
        }
        {
            String theContactEmail;
            theContactEmail = this.getContactEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactEmail", theContactEmail), currentHashCode, theContactEmail);
        }
        {
            Boolean theESA;
            theESA = this.getESA();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "esa", theESA), currentHashCode, theESA);
        }
        {
            Boolean theTotalWOD;
            theTotalWOD = this.getTotalWOD();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalWOD", theTotalWOD), currentHashCode, theTotalWOD);
        }
        {
            Boolean theTaxInclusivePrices;
            theTaxInclusivePrices = this.getTaxInclusivePrices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusivePrices", theTaxInclusivePrices), currentHashCode, theTaxInclusivePrices);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Site)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Site that = ((Site) object);
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            String lhsLogoURL;
            lhsLogoURL = this.getLogoURL();
            String rhsLogoURL;
            rhsLogoURL = that.getLogoURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logoURL", lhsLogoURL), LocatorUtils.property(thatLocator, "logoURL", rhsLogoURL), lhsLogoURL, rhsLogoURL)) {
                return false;
            }
        }
        {
            String lhsPageColor1;
            lhsPageColor1 = this.getPageColor1();
            String rhsPageColor1;
            rhsPageColor1 = that.getPageColor1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageColor1", lhsPageColor1), LocatorUtils.property(thatLocator, "pageColor1", rhsPageColor1), lhsPageColor1, rhsPageColor1)) {
                return false;
            }
        }
        {
            String lhsPageColor2;
            lhsPageColor2 = this.getPageColor2();
            String rhsPageColor2;
            rhsPageColor2 = that.getPageColor2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageColor2", lhsPageColor2), LocatorUtils.property(thatLocator, "pageColor2", rhsPageColor2), lhsPageColor2, rhsPageColor2)) {
                return false;
            }
        }
        {
            String lhsPageColor3;
            lhsPageColor3 = this.getPageColor3();
            String rhsPageColor3;
            rhsPageColor3 = that.getPageColor3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageColor3", lhsPageColor3), LocatorUtils.property(thatLocator, "pageColor3", rhsPageColor3), lhsPageColor3, rhsPageColor3)) {
                return false;
            }
        }
        {
            String lhsPageColor4;
            lhsPageColor4 = this.getPageColor4();
            String rhsPageColor4;
            rhsPageColor4 = that.getPageColor4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageColor4", lhsPageColor4), LocatorUtils.property(thatLocator, "pageColor4", rhsPageColor4), lhsPageColor4, rhsPageColor4)) {
                return false;
            }
        }
        {
            Boolean lhsAcceptsVisa;
            lhsAcceptsVisa = this.getAcceptsVisa();
            Boolean rhsAcceptsVisa;
            rhsAcceptsVisa = that.getAcceptsVisa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptsVisa", lhsAcceptsVisa), LocatorUtils.property(thatLocator, "acceptsVisa", rhsAcceptsVisa), lhsAcceptsVisa, rhsAcceptsVisa)) {
                return false;
            }
        }
        {
            Boolean lhsAcceptsDiscover;
            lhsAcceptsDiscover = this.getAcceptsDiscover();
            Boolean rhsAcceptsDiscover;
            rhsAcceptsDiscover = that.getAcceptsDiscover();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptsDiscover", lhsAcceptsDiscover), LocatorUtils.property(thatLocator, "acceptsDiscover", rhsAcceptsDiscover), lhsAcceptsDiscover, rhsAcceptsDiscover)) {
                return false;
            }
        }
        {
            Boolean lhsAcceptsMasterCard;
            lhsAcceptsMasterCard = this.getAcceptsMasterCard();
            Boolean rhsAcceptsMasterCard;
            rhsAcceptsMasterCard = that.getAcceptsMasterCard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptsMasterCard", lhsAcceptsMasterCard), LocatorUtils.property(thatLocator, "acceptsMasterCard", rhsAcceptsMasterCard), lhsAcceptsMasterCard, rhsAcceptsMasterCard)) {
                return false;
            }
        }
        {
            Boolean lhsAcceptsAmericanExpress;
            lhsAcceptsAmericanExpress = this.getAcceptsAmericanExpress();
            Boolean rhsAcceptsAmericanExpress;
            rhsAcceptsAmericanExpress = that.getAcceptsAmericanExpress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptsAmericanExpress", lhsAcceptsAmericanExpress), LocatorUtils.property(thatLocator, "acceptsAmericanExpress", rhsAcceptsAmericanExpress), lhsAcceptsAmericanExpress, rhsAcceptsAmericanExpress)) {
                return false;
            }
        }
        {
            String lhsContactEmail;
            lhsContactEmail = this.getContactEmail();
            String rhsContactEmail;
            rhsContactEmail = that.getContactEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactEmail", lhsContactEmail), LocatorUtils.property(thatLocator, "contactEmail", rhsContactEmail), lhsContactEmail, rhsContactEmail)) {
                return false;
            }
        }
        {
            Boolean lhsESA;
            lhsESA = this.getESA();
            Boolean rhsESA;
            rhsESA = that.getESA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "esa", lhsESA), LocatorUtils.property(thatLocator, "esa", rhsESA), lhsESA, rhsESA)) {
                return false;
            }
        }
        {
            Boolean lhsTotalWOD;
            lhsTotalWOD = this.getTotalWOD();
            Boolean rhsTotalWOD;
            rhsTotalWOD = that.getTotalWOD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalWOD", lhsTotalWOD), LocatorUtils.property(thatLocator, "totalWOD", rhsTotalWOD), lhsTotalWOD, rhsTotalWOD)) {
                return false;
            }
        }
        {
            Boolean lhsTaxInclusivePrices;
            lhsTaxInclusivePrices = this.getTaxInclusivePrices();
            Boolean rhsTaxInclusivePrices;
            rhsTaxInclusivePrices = that.getTaxInclusivePrices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusivePrices", lhsTaxInclusivePrices), LocatorUtils.property(thatLocator, "taxInclusivePrices", rhsTaxInclusivePrices), lhsTaxInclusivePrices, rhsTaxInclusivePrices)) {
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
        {
            int theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theLogoURL;
            theLogoURL = this.getLogoURL();
            strategy.appendField(locator, this, "logoURL", buffer, theLogoURL);
        }
        {
            String thePageColor1;
            thePageColor1 = this.getPageColor1();
            strategy.appendField(locator, this, "pageColor1", buffer, thePageColor1);
        }
        {
            String thePageColor2;
            thePageColor2 = this.getPageColor2();
            strategy.appendField(locator, this, "pageColor2", buffer, thePageColor2);
        }
        {
            String thePageColor3;
            thePageColor3 = this.getPageColor3();
            strategy.appendField(locator, this, "pageColor3", buffer, thePageColor3);
        }
        {
            String thePageColor4;
            thePageColor4 = this.getPageColor4();
            strategy.appendField(locator, this, "pageColor4", buffer, thePageColor4);
        }
        {
            Boolean theAcceptsVisa;
            theAcceptsVisa = this.getAcceptsVisa();
            strategy.appendField(locator, this, "acceptsVisa", buffer, theAcceptsVisa);
        }
        {
            Boolean theAcceptsDiscover;
            theAcceptsDiscover = this.getAcceptsDiscover();
            strategy.appendField(locator, this, "acceptsDiscover", buffer, theAcceptsDiscover);
        }
        {
            Boolean theAcceptsMasterCard;
            theAcceptsMasterCard = this.getAcceptsMasterCard();
            strategy.appendField(locator, this, "acceptsMasterCard", buffer, theAcceptsMasterCard);
        }
        {
            Boolean theAcceptsAmericanExpress;
            theAcceptsAmericanExpress = this.getAcceptsAmericanExpress();
            strategy.appendField(locator, this, "acceptsAmericanExpress", buffer, theAcceptsAmericanExpress);
        }
        {
            String theContactEmail;
            theContactEmail = this.getContactEmail();
            strategy.appendField(locator, this, "contactEmail", buffer, theContactEmail);
        }
        {
            Boolean theESA;
            theESA = this.getESA();
            strategy.appendField(locator, this, "esa", buffer, theESA);
        }
        {
            Boolean theTotalWOD;
            theTotalWOD = this.getTotalWOD();
            strategy.appendField(locator, this, "totalWOD", buffer, theTotalWOD);
        }
        {
            Boolean theTaxInclusivePrices;
            theTaxInclusivePrices = this.getTaxInclusivePrices();
            strategy.appendField(locator, this, "taxInclusivePrices", buffer, theTaxInclusivePrices);
        }
        return buffer;
    }

}
