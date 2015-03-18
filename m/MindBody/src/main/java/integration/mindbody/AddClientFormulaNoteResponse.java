
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddClientFormulaNoteResult" type="{http://clients.mindbodyonline.com/api/0_5}AddClientFormulaNoteResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addClientFormulaNoteResult"
})
@XmlRootElement(name = "AddClientFormulaNoteResponse")
@Entity(name = "AddClientFormulaNoteResponse")
@Table(name = "ADDCLIENTFORMULANOTERESPONSE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AddClientFormulaNoteResponse
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AddClientFormulaNoteResult")
    protected AddClientFormulaNoteResult addClientFormulaNoteResult;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the addClientFormulaNoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddClientFormulaNoteResult }
     *     
     */
    @Transient
    public AddClientFormulaNoteResult getAddClientFormulaNoteResult() {
        return addClientFormulaNoteResult;
    }

    /**
     * Sets the value of the addClientFormulaNoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddClientFormulaNoteResult }
     *     
     */
    public void setAddClientFormulaNoteResult(AddClientFormulaNoteResult value) {
        this.addClientFormulaNoteResult = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            AddClientFormulaNoteResult theAddClientFormulaNoteResult;
            theAddClientFormulaNoteResult = this.getAddClientFormulaNoteResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addClientFormulaNoteResult", theAddClientFormulaNoteResult), currentHashCode, theAddClientFormulaNoteResult);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddClientFormulaNoteResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AddClientFormulaNoteResponse that = ((AddClientFormulaNoteResponse) object);
        {
            AddClientFormulaNoteResult lhsAddClientFormulaNoteResult;
            lhsAddClientFormulaNoteResult = this.getAddClientFormulaNoteResult();
            AddClientFormulaNoteResult rhsAddClientFormulaNoteResult;
            rhsAddClientFormulaNoteResult = that.getAddClientFormulaNoteResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addClientFormulaNoteResult", lhsAddClientFormulaNoteResult), LocatorUtils.property(thatLocator, "addClientFormulaNoteResult", rhsAddClientFormulaNoteResult), lhsAddClientFormulaNoteResult, rhsAddClientFormulaNoteResult)) {
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
            AddClientFormulaNoteResult theAddClientFormulaNoteResult;
            theAddClientFormulaNoteResult = this.getAddClientFormulaNoteResult();
            strategy.appendField(locator, this, "addClientFormulaNoteResult", buffer, theAddClientFormulaNoteResult);
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
