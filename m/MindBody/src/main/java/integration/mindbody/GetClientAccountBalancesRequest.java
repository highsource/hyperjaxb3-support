
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for GetClientAccountBalancesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccountBalancesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="BalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientAccountBalancesRequest", propOrder = {
    "clientIDs",
    "balanceDate",
    "classID"
})
public class GetClientAccountBalancesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "BalanceDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date balanceDate;
    @XmlElement(name = "ClassID", required = true, type = Long.class, nillable = true)
    protected Long classID;

    /**
     * Gets the value of the clientIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getClientIDs() {
        return clientIDs;
    }

    /**
     * Sets the value of the clientIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setClientIDs(ArrayOfString value) {
        this.clientIDs = value;
    }

    /**
     * Gets the value of the balanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBalanceDate() {
        return balanceDate;
    }

    /**
     * Sets the value of the balanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceDate(Date value) {
        this.balanceDate = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClassID(Long value) {
        this.classID = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDs", theClientIDs), currentHashCode, theClientIDs);
        }
        {
            Date theBalanceDate;
            theBalanceDate = this.getBalanceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balanceDate", theBalanceDate), currentHashCode, theBalanceDate);
        }
        {
            Long theClassID;
            theClassID = this.getClassID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classID", theClassID), currentHashCode, theClassID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClientAccountBalancesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClientAccountBalancesRequest that = ((GetClientAccountBalancesRequest) object);
        {
            ArrayOfString lhsClientIDs;
            lhsClientIDs = this.getClientIDs();
            ArrayOfString rhsClientIDs;
            rhsClientIDs = that.getClientIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIDs", lhsClientIDs), LocatorUtils.property(thatLocator, "clientIDs", rhsClientIDs), lhsClientIDs, rhsClientIDs)) {
                return false;
            }
        }
        {
            Date lhsBalanceDate;
            lhsBalanceDate = this.getBalanceDate();
            Date rhsBalanceDate;
            rhsBalanceDate = that.getBalanceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balanceDate", lhsBalanceDate), LocatorUtils.property(thatLocator, "balanceDate", rhsBalanceDate), lhsBalanceDate, rhsBalanceDate)) {
                return false;
            }
        }
        {
            Long lhsClassID;
            lhsClassID = this.getClassID();
            Long rhsClassID;
            rhsClassID = that.getClassID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classID", lhsClassID), LocatorUtils.property(thatLocator, "classID", rhsClassID), lhsClassID, rhsClassID)) {
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
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            strategy.appendField(locator, this, "clientIDs", buffer, theClientIDs);
        }
        {
            Date theBalanceDate;
            theBalanceDate = this.getBalanceDate();
            strategy.appendField(locator, this, "balanceDate", buffer, theBalanceDate);
        }
        {
            Long theClassID;
            theClassID = this.getClassID();
            strategy.appendField(locator, this, "classID", buffer, theClassID);
        }
        return buffer;
    }

}
