
package integration.mindbody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for ArrayOfDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDateTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDateTime", propOrder = {
    "dateTime"
})
@Entity(name = "ArrayOfDateTime")
@Table(name = "ARRAYOFDATETIME")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfDateTime
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected List<Date> dateTime;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<ArrayOfDateTimeDateTimeItem> dateTimeItems;

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
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
    public List<Date> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<Date>();
        }
        return this.dateTime;
    }

    /**
     * 
     * 
     */
    public void setDateTime(List<Date> dateTime) {
        this.dateTime = dateTime;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Date> theDateTime;
            theDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfDateTime)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfDateTime that = ((ArrayOfDateTime) object);
        {
            List<Date> lhsDateTime;
            lhsDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            List<Date> rhsDateTime;
            rhsDateTime = (((that.dateTime!= null)&&(!that.dateTime.isEmpty()))?that.getDateTime():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime)) {
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
            List<Date> theDateTime;
            theDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
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

    @OneToMany(targetEntity = ArrayOfDateTimeDateTimeItem.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "DATETIMEITEMS_ARRAYOFDATETIM_0")
    public List<ArrayOfDateTimeDateTimeItem> getDateTimeItems() {
        if (this.dateTimeItems == null) {
            this.dateTimeItems = new ArrayList<ArrayOfDateTimeDateTimeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.dateTime)) {
            this.dateTime = ItemUtils.wrap(this.dateTime, this.dateTimeItems, ArrayOfDateTimeDateTimeItem.class);
        }
        return this.dateTimeItems;
    }

    public void setDateTimeItems(List<ArrayOfDateTimeDateTimeItem> value) {
        this.dateTime = null;
        this.dateTimeItems = null;
        this.dateTimeItems = value;
        if (this.dateTimeItems == null) {
            this.dateTimeItems = new ArrayList<ArrayOfDateTimeDateTimeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.dateTime)) {
            this.dateTime = ItemUtils.wrap(this.dateTime, this.dateTimeItems, ArrayOfDateTimeDateTimeItem.class);
        }
    }

}
