
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
 * <p>Java class for Sale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SaleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SaleDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5}Location" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfPayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sale", propOrder = {
    "id",
    "saleTime",
    "saleDate",
    "saleDateTime",
    "location",
    "payments"
})
@Entity(name = "Sale")
@Table(name = "SALE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Sale
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "SaleTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date saleTime;
    @XmlElement(name = "SaleDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date saleDate;
    @XmlElement(name = "SaleDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date saleDateTime;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Payments")
    protected ArrayOfPayment payments;

    /**
     * Gets the value of the id property.
     * 
     */
    @Id
    @Column(name = "ID", scale = 0)
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the saleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SALETIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSaleTime() {
        return saleTime;
    }

    /**
     * Sets the value of the saleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTime(Date value) {
        this.saleTime = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SALEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDate(Date value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the saleDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SALEDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSaleDateTime() {
        return saleDateTime;
    }

    /**
     * Sets the value of the saleDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDateTime(Date value) {
        this.saleDateTime = value;
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
        @JoinColumn(name = "LOCATION__SALE_ID"),
        @JoinColumn(name = "LOCATION__SALE_HJID")
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
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayment }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfPayment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PAYMENTS_SALE_HJID")
    public ArrayOfPayment getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayment }
     *     
     */
    public void setPayments(ArrayOfPayment value) {
        this.payments = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Date theSaleTime;
            theSaleTime = this.getSaleTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saleTime", theSaleTime), currentHashCode, theSaleTime);
        }
        {
            Date theSaleDate;
            theSaleDate = this.getSaleDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saleDate", theSaleDate), currentHashCode, theSaleDate);
        }
        {
            Date theSaleDateTime;
            theSaleDateTime = this.getSaleDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saleDateTime", theSaleDateTime), currentHashCode, theSaleDateTime);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            ArrayOfPayment thePayments;
            thePayments = this.getPayments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payments", thePayments), currentHashCode, thePayments);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Sale)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sale that = ((Sale) object);
        {
            long lhsID;
            lhsID = this.getID();
            long rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Date lhsSaleTime;
            lhsSaleTime = this.getSaleTime();
            Date rhsSaleTime;
            rhsSaleTime = that.getSaleTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saleTime", lhsSaleTime), LocatorUtils.property(thatLocator, "saleTime", rhsSaleTime), lhsSaleTime, rhsSaleTime)) {
                return false;
            }
        }
        {
            Date lhsSaleDate;
            lhsSaleDate = this.getSaleDate();
            Date rhsSaleDate;
            rhsSaleDate = that.getSaleDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saleDate", lhsSaleDate), LocatorUtils.property(thatLocator, "saleDate", rhsSaleDate), lhsSaleDate, rhsSaleDate)) {
                return false;
            }
        }
        {
            Date lhsSaleDateTime;
            lhsSaleDateTime = this.getSaleDateTime();
            Date rhsSaleDateTime;
            rhsSaleDateTime = that.getSaleDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saleDateTime", lhsSaleDateTime), LocatorUtils.property(thatLocator, "saleDateTime", rhsSaleDateTime), lhsSaleDateTime, rhsSaleDateTime)) {
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
            ArrayOfPayment lhsPayments;
            lhsPayments = this.getPayments();
            ArrayOfPayment rhsPayments;
            rhsPayments = that.getPayments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payments", lhsPayments), LocatorUtils.property(thatLocator, "payments", rhsPayments), lhsPayments, rhsPayments)) {
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
            long theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Date theSaleTime;
            theSaleTime = this.getSaleTime();
            strategy.appendField(locator, this, "saleTime", buffer, theSaleTime);
        }
        {
            Date theSaleDate;
            theSaleDate = this.getSaleDate();
            strategy.appendField(locator, this, "saleDate", buffer, theSaleDate);
        }
        {
            Date theSaleDateTime;
            theSaleDateTime = this.getSaleDateTime();
            strategy.appendField(locator, this, "saleDateTime", buffer, theSaleDateTime);
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            ArrayOfPayment thePayments;
            thePayments = this.getPayments();
            strategy.appendField(locator, this, "payments", buffer, thePayments);
        }
        return buffer;
    }

}
