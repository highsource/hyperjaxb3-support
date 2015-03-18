
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
 * <p>Java class for ArrayOfString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", propOrder = {
    "string"
})
@Entity(name = "ArrayOfString")
@Table(name = "ARRAYOFSTRING")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfString
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected List<String> string;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<ArrayOfStringStringItem> stringItems;

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Transient
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    /**
     * 
     * 
     */
    public void setString(List<String> string) {
        this.string = string;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<String> theString;
            theString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "string", theString), currentHashCode, theString);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfString)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfString that = ((ArrayOfString) object);
        {
            List<String> lhsString;
            lhsString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            List<String> rhsString;
            rhsString = (((that.string!= null)&&(!that.string.isEmpty()))?that.getString():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "string", lhsString), LocatorUtils.property(thatLocator, "string", rhsString), lhsString, rhsString)) {
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
            List<String> theString;
            theString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            strategy.appendField(locator, this, "string", buffer, theString);
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

    @OneToMany(targetEntity = ArrayOfStringStringItem.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "STRINGITEMS_ARRAYOFSTRING_HJ_0")
    public List<ArrayOfStringStringItem> getStringItems() {
        if (this.stringItems == null) {
            this.stringItems = new ArrayList<ArrayOfStringStringItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.string)) {
            this.string = ItemUtils.wrap(this.string, this.stringItems, ArrayOfStringStringItem.class);
        }
        return this.stringItems;
    }

    public void setStringItems(List<ArrayOfStringStringItem> value) {
        this.string = null;
        this.stringItems = null;
        this.stringItems = value;
        if (this.stringItems == null) {
            this.stringItems = new ArrayList<ArrayOfStringStringItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.string)) {
            this.string = ItemUtils.wrap(this.string, this.stringItems, ArrayOfStringStringItem.class);
        }
    }

}
