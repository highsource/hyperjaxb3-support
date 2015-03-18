
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ClientCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCreditCard", propOrder = {
    "cardType",
    "lastFour",
    "cardNumber",
    "cardHolder",
    "expMonth",
    "expYear",
    "address",
    "city",
    "state",
    "postalCode"
})
@Entity(name = "ClientCreditCard")
@Table(name = "CLIENTCREDITCARD")
@Inheritance(strategy = InheritanceType.JOINED)
public class ClientCreditCard
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "LastFour")
    protected String lastFour;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardHolder")
    protected String cardHolder;
    @XmlElement(name = "ExpMonth")
    protected String expMonth;
    @XmlElement(name = "ExpYear")
    protected String expYear;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CARDTYPE", length = 255)
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the lastFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LASTFOUR", length = 255)
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Sets the value of the lastFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFour(String value) {
        this.lastFour = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CARDNUMBER", length = 255)
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CARDHOLDER", length = 255)
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EXPMONTH", length = 255)
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpMonth(String value) {
        this.expMonth = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EXPYEAR", length = 255)
    public String getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpYear(String value) {
        this.expYear = value;
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
    @Column(name = "POSTALCODE", length = 255)
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theCardType;
            theCardType = this.getCardType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardType", theCardType), currentHashCode, theCardType);
        }
        {
            String theLastFour;
            theLastFour = this.getLastFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFour", theLastFour), currentHashCode, theLastFour);
        }
        {
            String theCardNumber;
            theCardNumber = this.getCardNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardNumber", theCardNumber), currentHashCode, theCardNumber);
        }
        {
            String theCardHolder;
            theCardHolder = this.getCardHolder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardHolder", theCardHolder), currentHashCode, theCardHolder);
        }
        {
            String theExpMonth;
            theExpMonth = this.getExpMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expMonth", theExpMonth), currentHashCode, theExpMonth);
        }
        {
            String theExpYear;
            theExpYear = this.getExpYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expYear", theExpYear), currentHashCode, theExpYear);
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClientCreditCard)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClientCreditCard that = ((ClientCreditCard) object);
        {
            String lhsCardType;
            lhsCardType = this.getCardType();
            String rhsCardType;
            rhsCardType = that.getCardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardType", lhsCardType), LocatorUtils.property(thatLocator, "cardType", rhsCardType), lhsCardType, rhsCardType)) {
                return false;
            }
        }
        {
            String lhsLastFour;
            lhsLastFour = this.getLastFour();
            String rhsLastFour;
            rhsLastFour = that.getLastFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFour", lhsLastFour), LocatorUtils.property(thatLocator, "lastFour", rhsLastFour), lhsLastFour, rhsLastFour)) {
                return false;
            }
        }
        {
            String lhsCardNumber;
            lhsCardNumber = this.getCardNumber();
            String rhsCardNumber;
            rhsCardNumber = that.getCardNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardNumber", lhsCardNumber), LocatorUtils.property(thatLocator, "cardNumber", rhsCardNumber), lhsCardNumber, rhsCardNumber)) {
                return false;
            }
        }
        {
            String lhsCardHolder;
            lhsCardHolder = this.getCardHolder();
            String rhsCardHolder;
            rhsCardHolder = that.getCardHolder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardHolder", lhsCardHolder), LocatorUtils.property(thatLocator, "cardHolder", rhsCardHolder), lhsCardHolder, rhsCardHolder)) {
                return false;
            }
        }
        {
            String lhsExpMonth;
            lhsExpMonth = this.getExpMonth();
            String rhsExpMonth;
            rhsExpMonth = that.getExpMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expMonth", lhsExpMonth), LocatorUtils.property(thatLocator, "expMonth", rhsExpMonth), lhsExpMonth, rhsExpMonth)) {
                return false;
            }
        }
        {
            String lhsExpYear;
            lhsExpYear = this.getExpYear();
            String rhsExpYear;
            rhsExpYear = that.getExpYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expYear", lhsExpYear), LocatorUtils.property(thatLocator, "expYear", rhsExpYear), lhsExpYear, rhsExpYear)) {
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
            String theCardType;
            theCardType = this.getCardType();
            strategy.appendField(locator, this, "cardType", buffer, theCardType);
        }
        {
            String theLastFour;
            theLastFour = this.getLastFour();
            strategy.appendField(locator, this, "lastFour", buffer, theLastFour);
        }
        {
            String theCardNumber;
            theCardNumber = this.getCardNumber();
            strategy.appendField(locator, this, "cardNumber", buffer, theCardNumber);
        }
        {
            String theCardHolder;
            theCardHolder = this.getCardHolder();
            strategy.appendField(locator, this, "cardHolder", buffer, theCardHolder);
        }
        {
            String theExpMonth;
            theExpMonth = this.getExpMonth();
            strategy.appendField(locator, this, "expMonth", buffer, theExpMonth);
        }
        {
            String theExpYear;
            theExpYear = this.getExpYear();
            strategy.appendField(locator, this, "expYear", buffer, theExpYear);
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
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
        return buffer;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
