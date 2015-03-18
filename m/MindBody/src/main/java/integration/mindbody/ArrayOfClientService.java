
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
 * <p>Java class for ArrayOfClientService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientService" type="{http://clients.mindbodyonline.com/api/0_5}ClientService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientService", propOrder = {
    "clientService"
})
@Entity(name = "ArrayOfClientService")
@Table(name = "ARRAYOFCLIENTSERVICE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfClientService
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientService", nillable = true)
    protected List<ClientService> clientService;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the clientService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientService }
     * 
     * 
     */
    @OneToMany(targetEntity = ClientService.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENTSERVICE_ARRAYOFCLIENTS_0")
    public List<ClientService> getClientService() {
        if (clientService == null) {
            clientService = new ArrayList<ClientService>();
        }
        return this.clientService;
    }

    /**
     * 
     * 
     */
    public void setClientService(List<ClientService> clientService) {
        this.clientService = clientService;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ClientService> theClientService;
            theClientService = (((this.clientService!= null)&&(!this.clientService.isEmpty()))?this.getClientService():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientService", theClientService), currentHashCode, theClientService);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfClientService)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfClientService that = ((ArrayOfClientService) object);
        {
            List<ClientService> lhsClientService;
            lhsClientService = (((this.clientService!= null)&&(!this.clientService.isEmpty()))?this.getClientService():null);
            List<ClientService> rhsClientService;
            rhsClientService = (((that.clientService!= null)&&(!that.clientService.isEmpty()))?that.getClientService():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientService", lhsClientService), LocatorUtils.property(thatLocator, "clientService", rhsClientService), lhsClientService, rhsClientService)) {
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
            List<ClientService> theClientService;
            theClientService = (((this.clientService!= null)&&(!this.clientService.isEmpty()))?this.getClientService():null);
            strategy.appendField(locator, this, "clientService", buffer, theClientService);
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
