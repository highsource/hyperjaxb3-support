
package integration.mindbody;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * <p>Java class for SaleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="Sale" type="{http://clients.mindbodyonline.com/api/0_5}Sale" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Returned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleItem", propOrder = {
    "sale",
    "description",
    "price",
    "amountPaid",
    "discount",
    "tax",
    "returned",
    "quantity"
})
@Entity(name = "SaleItem")
@Table(name = "SALEITEM")
public class SaleItem
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Sale")
    protected Sale sale;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "AmountPaid")
    protected BigDecimal amountPaid;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "Tax")
    protected BigDecimal tax;
    @XmlElement(name = "Returned")
    protected Boolean returned;
    @XmlElement(name = "Quantity")
    protected Integer quantity;

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    @ManyToOne(targetEntity = Sale.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SALE_SALEITEM_ID")
    public Sale getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setSale(Sale value) {
        this.sale = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "PRICE", precision = 20, scale = 10)
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "AMOUNTPAID", precision = 20, scale = 10)
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountPaid(BigDecimal value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "DISCOUNT", precision = 20, scale = 10)
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "TAX", precision = 20, scale = 10)
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the returned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "RETURNED")
    public Boolean getReturned() {
        return returned;
    }

    /**
     * Sets the value of the returned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturned(Boolean value) {
        this.returned = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "QUANTITY", precision = 10, scale = 0)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Sale theSale;
            theSale = this.getSale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sale", theSale), currentHashCode, theSale);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            BigDecimal thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice);
        }
        {
            BigDecimal theAmountPaid;
            theAmountPaid = this.getAmountPaid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amountPaid", theAmountPaid), currentHashCode, theAmountPaid);
        }
        {
            BigDecimal theDiscount;
            theDiscount = this.getDiscount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discount", theDiscount), currentHashCode, theDiscount);
        }
        {
            BigDecimal theTax;
            theTax = this.getTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax", theTax), currentHashCode, theTax);
        }
        {
            Boolean theReturned;
            theReturned = this.getReturned();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returned", theReturned), currentHashCode, theReturned);
        }
        {
            Integer theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SaleItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SaleItem that = ((SaleItem) object);
        {
            Sale lhsSale;
            lhsSale = this.getSale();
            Sale rhsSale;
            rhsSale = that.getSale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sale", lhsSale), LocatorUtils.property(thatLocator, "sale", rhsSale), lhsSale, rhsSale)) {
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
            BigDecimal lhsPrice;
            lhsPrice = this.getPrice();
            BigDecimal rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            BigDecimal lhsAmountPaid;
            lhsAmountPaid = this.getAmountPaid();
            BigDecimal rhsAmountPaid;
            rhsAmountPaid = that.getAmountPaid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountPaid", lhsAmountPaid), LocatorUtils.property(thatLocator, "amountPaid", rhsAmountPaid), lhsAmountPaid, rhsAmountPaid)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscount;
            lhsDiscount = this.getDiscount();
            BigDecimal rhsDiscount;
            rhsDiscount = that.getDiscount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discount", lhsDiscount), LocatorUtils.property(thatLocator, "discount", rhsDiscount), lhsDiscount, rhsDiscount)) {
                return false;
            }
        }
        {
            BigDecimal lhsTax;
            lhsTax = this.getTax();
            BigDecimal rhsTax;
            rhsTax = that.getTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax", lhsTax), LocatorUtils.property(thatLocator, "tax", rhsTax), lhsTax, rhsTax)) {
                return false;
            }
        }
        {
            Boolean lhsReturned;
            lhsReturned = this.getReturned();
            Boolean rhsReturned;
            rhsReturned = that.getReturned();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returned", lhsReturned), LocatorUtils.property(thatLocator, "returned", rhsReturned), lhsReturned, rhsReturned)) {
                return false;
            }
        }
        {
            Integer lhsQuantity;
            lhsQuantity = this.getQuantity();
            Integer rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
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
            Sale theSale;
            theSale = this.getSale();
            strategy.appendField(locator, this, "sale", buffer, theSale);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            BigDecimal thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            BigDecimal theAmountPaid;
            theAmountPaid = this.getAmountPaid();
            strategy.appendField(locator, this, "amountPaid", buffer, theAmountPaid);
        }
        {
            BigDecimal theDiscount;
            theDiscount = this.getDiscount();
            strategy.appendField(locator, this, "discount", buffer, theDiscount);
        }
        {
            BigDecimal theTax;
            theTax = this.getTax();
            strategy.appendField(locator, this, "tax", buffer, theTax);
        }
        {
            Boolean theReturned;
            theReturned = this.getReturned();
            strategy.appendField(locator, this, "returned", buffer, theReturned);
        }
        {
            Integer theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        return buffer;
    }

}
