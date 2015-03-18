
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
 * <p>Java class for ClientSendUserNewPasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientSendUserNewPasswordRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="UserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSendUserNewPasswordRequest", propOrder = {
    "userEmail",
    "userFirstName",
    "userLastName"
})
public class ClientSendUserNewPasswordRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UserEmail")
    protected String userEmail;
    @XmlElement(name = "UserFirstName")
    protected String userFirstName;
    @XmlElement(name = "UserLastName")
    protected String userLastName;

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theUserEmail;
            theUserEmail = this.getUserEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userEmail", theUserEmail), currentHashCode, theUserEmail);
        }
        {
            String theUserFirstName;
            theUserFirstName = this.getUserFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userFirstName", theUserFirstName), currentHashCode, theUserFirstName);
        }
        {
            String theUserLastName;
            theUserLastName = this.getUserLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userLastName", theUserLastName), currentHashCode, theUserLastName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClientSendUserNewPasswordRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ClientSendUserNewPasswordRequest that = ((ClientSendUserNewPasswordRequest) object);
        {
            String lhsUserEmail;
            lhsUserEmail = this.getUserEmail();
            String rhsUserEmail;
            rhsUserEmail = that.getUserEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userEmail", lhsUserEmail), LocatorUtils.property(thatLocator, "userEmail", rhsUserEmail), lhsUserEmail, rhsUserEmail)) {
                return false;
            }
        }
        {
            String lhsUserFirstName;
            lhsUserFirstName = this.getUserFirstName();
            String rhsUserFirstName;
            rhsUserFirstName = that.getUserFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userFirstName", lhsUserFirstName), LocatorUtils.property(thatLocator, "userFirstName", rhsUserFirstName), lhsUserFirstName, rhsUserFirstName)) {
                return false;
            }
        }
        {
            String lhsUserLastName;
            lhsUserLastName = this.getUserLastName();
            String rhsUserLastName;
            rhsUserLastName = that.getUserLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userLastName", lhsUserLastName), LocatorUtils.property(thatLocator, "userLastName", rhsUserLastName), lhsUserLastName, rhsUserLastName)) {
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
            String theUserEmail;
            theUserEmail = this.getUserEmail();
            strategy.appendField(locator, this, "userEmail", buffer, theUserEmail);
        }
        {
            String theUserFirstName;
            theUserFirstName = this.getUserFirstName();
            strategy.appendField(locator, this, "userFirstName", buffer, theUserFirstName);
        }
        {
            String theUserLastName;
            theUserLastName = this.getUserLastName();
            strategy.appendField(locator, this, "userLastName", buffer, theUserLastName);
        }
        return buffer;
    }

}
