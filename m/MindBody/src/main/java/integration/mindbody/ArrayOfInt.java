
package integration.mindbody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.hyperjaxb3.item.ItemUtils;
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
 * <p>Java class for ArrayOfInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInt", propOrder = {
    "_int"
})
@Entity(name = "ArrayOfInt")
@Table(name = "ARRAY_OF_INT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfInt
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "int")
    protected List<Integer> _int;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<ArrayOfIntIntItem> intItems;

    /**
     * Gets the value of the int property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the int property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    @Transient
    public List<Integer> getInt() {
        if (_int == null) {
            _int = new ArrayList<Integer>();
        }
        return this._int;
    }

    /**
     * 
     * 
     */
    public void setInt(List<Integer> _int) {
        this._int = _int;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Integer> theInt;
            theInt = (((this._int!= null)&&(!this._int.isEmpty()))?this.getInt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_int", theInt), currentHashCode, theInt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfInt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfInt that = ((ArrayOfInt) object);
        {
            List<Integer> lhsInt;
            lhsInt = (((this._int!= null)&&(!this._int.isEmpty()))?this.getInt():null);
            List<Integer> rhsInt;
            rhsInt = (((that._int!= null)&&(!that._int.isEmpty()))?that.getInt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_int", lhsInt), LocatorUtils.property(thatLocator, "_int", rhsInt), lhsInt, rhsInt)) {
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
            List<Integer> theInt;
            theInt = (((this._int!= null)&&(!this._int.isEmpty()))?this.getInt():null);
            strategy.appendField(locator, this, "_int", buffer, theInt);
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

    @OneToMany(targetEntity = ArrayOfIntIntItem.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "INT_ITEMS_ARRAY_OF_INT_HJID")
    public List<ArrayOfIntIntItem> getIntItems() {
        if (this.intItems == null) {
            this.intItems = new ArrayList<ArrayOfIntIntItem>();
        }
        if (ItemUtils.shouldBeWrapped(this._int)) {
            this._int = ItemUtils.wrap(this._int, this.intItems, ArrayOfIntIntItem.class);
        }
        return this.intItems;
    }

    public void setIntItems(List<ArrayOfIntIntItem> value) {
        this._int = null;
        this.intItems = null;
        this.intItems = value;
        if (this.intItems == null) {
            this.intItems = new ArrayList<ArrayOfIntIntItem>();
        }
        if (ItemUtils.shouldBeWrapped(this._int)) {
            this._int = ItemUtils.wrap(this._int, this.intItems, ArrayOfIntIntItem.class);
        }
    }

}
