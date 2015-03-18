
package integration.mindbody;

import java.io.Serializable;
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
 * <p>Java class for AddArrivalResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddArrivalResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ArrivalAdded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ClientService" type="{http://clients.mindbodyonline.com/api/0_5}ClientService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddArrivalResult", propOrder = {
    "arrivalAdded",
    "clientService"
})
public class AddArrivalResult
    extends MBResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrivalAdded")
    protected boolean arrivalAdded;
    @XmlElement(name = "ClientService")
    protected ClientService clientService;

    /**
     * Gets the value of the arrivalAdded property.
     * 
     */
    public boolean isArrivalAdded() {
        return arrivalAdded;
    }

    /**
     * Sets the value of the arrivalAdded property.
     * 
     */
    public void setArrivalAdded(boolean value) {
        this.arrivalAdded = value;
    }

    /**
     * Gets the value of the clientService property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    public ClientService getClientService() {
        return clientService;
    }

    /**
     * Sets the value of the clientService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setClientService(ClientService value) {
        this.clientService = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theArrivalAdded;
            theArrivalAdded = this.isArrivalAdded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arrivalAdded", theArrivalAdded), currentHashCode, theArrivalAdded);
        }
        {
            ClientService theClientService;
            theClientService = this.getClientService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientService", theClientService), currentHashCode, theClientService);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddArrivalResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AddArrivalResult that = ((AddArrivalResult) object);
        {
            boolean lhsArrivalAdded;
            lhsArrivalAdded = this.isArrivalAdded();
            boolean rhsArrivalAdded;
            rhsArrivalAdded = that.isArrivalAdded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arrivalAdded", lhsArrivalAdded), LocatorUtils.property(thatLocator, "arrivalAdded", rhsArrivalAdded), lhsArrivalAdded, rhsArrivalAdded)) {
                return false;
            }
        }
        {
            ClientService lhsClientService;
            lhsClientService = this.getClientService();
            ClientService rhsClientService;
            rhsClientService = that.getClientService();
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
        super.appendFields(locator, buffer, strategy);
        {
            boolean theArrivalAdded;
            theArrivalAdded = this.isArrivalAdded();
            strategy.appendField(locator, this, "arrivalAdded", buffer, theArrivalAdded);
        }
        {
            ClientService theClientService;
            theClientService = this.getClientService();
            strategy.appendField(locator, this, "clientService", buffer, theClientService);
        }
        return buffer;
    }

}
