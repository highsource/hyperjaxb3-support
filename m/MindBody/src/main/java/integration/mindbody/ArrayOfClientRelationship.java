
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
 * <p>Java class for ArrayOfClientRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientRelationship" type="{http://clients.mindbodyonline.com/api/0_5}ClientRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientRelationship", propOrder = {
    "clientRelationship"
})
@Entity(name = "ArrayOfClientRelationship")
@Table(name = "ARRAY_OF_CLIENT_RELATIONSHIP")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfClientRelationship
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientRelationship", nillable = true)
    protected List<ClientRelationship> clientRelationship;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the clientRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientRelationship }
     * 
     * 
     */
    @OneToMany(targetEntity = ClientRelationship.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENT_RELATIONSHIP_ARRAY_OF_0")
    public List<ClientRelationship> getClientRelationship() {
        if (clientRelationship == null) {
            clientRelationship = new ArrayList<ClientRelationship>();
        }
        return this.clientRelationship;
    }

    /**
     * 
     * 
     */
    public void setClientRelationship(List<ClientRelationship> clientRelationship) {
        this.clientRelationship = clientRelationship;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ClientRelationship> theClientRelationship;
            theClientRelationship = (((this.clientRelationship!= null)&&(!this.clientRelationship.isEmpty()))?this.getClientRelationship():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientRelationship", theClientRelationship), currentHashCode, theClientRelationship);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfClientRelationship)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfClientRelationship that = ((ArrayOfClientRelationship) object);
        {
            List<ClientRelationship> lhsClientRelationship;
            lhsClientRelationship = (((this.clientRelationship!= null)&&(!this.clientRelationship.isEmpty()))?this.getClientRelationship():null);
            List<ClientRelationship> rhsClientRelationship;
            rhsClientRelationship = (((that.clientRelationship!= null)&&(!that.clientRelationship.isEmpty()))?that.getClientRelationship():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientRelationship", lhsClientRelationship), LocatorUtils.property(thatLocator, "clientRelationship", rhsClientRelationship), lhsClientRelationship, rhsClientRelationship)) {
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
            List<ClientRelationship> theClientRelationship;
            theClientRelationship = (((this.clientRelationship!= null)&&(!this.clientRelationship.isEmpty()))?this.getClientRelationship():null);
            strategy.appendField(locator, this, "clientRelationship", buffer, theClientRelationship);
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
