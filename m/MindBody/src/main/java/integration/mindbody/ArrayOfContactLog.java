
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
 * <p>Java class for ArrayOfContactLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLog" type="{http://clients.mindbodyonline.com/api/0_5}ContactLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactLog", propOrder = {
    "contactLog"
})
@Entity(name = "ArrayOfContactLog")
@Table(name = "ARRAYOFCONTACTLOG")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfContactLog
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ContactLog", nillable = true)
    protected List<ContactLog> contactLog;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the contactLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactLog }
     * 
     * 
     */
    @OneToMany(targetEntity = ContactLog.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTACTLOG_ARRAYOFCONTACTLOG_0")
    public List<ContactLog> getContactLog() {
        if (contactLog == null) {
            contactLog = new ArrayList<ContactLog>();
        }
        return this.contactLog;
    }

    /**
     * 
     * 
     */
    public void setContactLog(List<ContactLog> contactLog) {
        this.contactLog = contactLog;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ContactLog> theContactLog;
            theContactLog = (((this.contactLog!= null)&&(!this.contactLog.isEmpty()))?this.getContactLog():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactLog", theContactLog), currentHashCode, theContactLog);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfContactLog)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfContactLog that = ((ArrayOfContactLog) object);
        {
            List<ContactLog> lhsContactLog;
            lhsContactLog = (((this.contactLog!= null)&&(!this.contactLog.isEmpty()))?this.getContactLog():null);
            List<ContactLog> rhsContactLog;
            rhsContactLog = (((that.contactLog!= null)&&(!that.contactLog.isEmpty()))?that.getContactLog():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactLog", lhsContactLog), LocatorUtils.property(thatLocator, "contactLog", rhsContactLog), lhsContactLog, rhsContactLog)) {
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
            List<ContactLog> theContactLog;
            theContactLog = (((this.contactLog!= null)&&(!this.contactLog.isEmpty()))?this.getContactLog():null);
            strategy.appendField(locator, this, "contactLog", buffer, theContactLog);
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
