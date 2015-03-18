
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
 * <p>Java class for ArrayOfClientMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientMembership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientMembership" type="{http://clients.mindbodyonline.com/api/0_5}ClientMembership" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientMembership", propOrder = {
    "clientMembership"
})
@Entity(name = "ArrayOfClientMembership")
@Table(name = "ARRAYOFCLIENTMEMBERSHIP")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfClientMembership
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientMembership", nillable = true)
    protected List<ClientMembership> clientMembership;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the clientMembership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientMembership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientMembership }
     * 
     * 
     */
    @OneToMany(targetEntity = ClientMembership.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENTMEMBERSHIP_ARRAYOFCLIE_0")
    public List<ClientMembership> getClientMembership() {
        if (clientMembership == null) {
            clientMembership = new ArrayList<ClientMembership>();
        }
        return this.clientMembership;
    }

    /**
     * 
     * 
     */
    public void setClientMembership(List<ClientMembership> clientMembership) {
        this.clientMembership = clientMembership;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ClientMembership> theClientMembership;
            theClientMembership = (((this.clientMembership!= null)&&(!this.clientMembership.isEmpty()))?this.getClientMembership():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientMembership", theClientMembership), currentHashCode, theClientMembership);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfClientMembership)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfClientMembership that = ((ArrayOfClientMembership) object);
        {
            List<ClientMembership> lhsClientMembership;
            lhsClientMembership = (((this.clientMembership!= null)&&(!this.clientMembership.isEmpty()))?this.getClientMembership():null);
            List<ClientMembership> rhsClientMembership;
            rhsClientMembership = (((that.clientMembership!= null)&&(!that.clientMembership.isEmpty()))?that.getClientMembership():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientMembership", lhsClientMembership), LocatorUtils.property(thatLocator, "clientMembership", rhsClientMembership), lhsClientMembership, rhsClientMembership)) {
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
            List<ClientMembership> theClientMembership;
            theClientMembership = (((this.clientMembership!= null)&&(!this.clientMembership.isEmpty()))?this.getClientMembership():null);
            strategy.appendField(locator, this, "clientMembership", buffer, theClientMembership);
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
