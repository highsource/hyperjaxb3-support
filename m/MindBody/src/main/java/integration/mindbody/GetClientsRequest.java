
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
 * <p>Java class for GetClientsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SearchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientsRequest", propOrder = {
    "clientIDs",
    "searchText"
})
public class GetClientsRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "SearchText")
    protected String searchText;

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
     * Gets the value of the searchText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Sets the value of the searchText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchText(String value) {
        this.searchText = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfString theClientIDs;
            theClientIDs = this.getClientIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDs", theClientIDs), currentHashCode, theClientIDs);
        }
        {
            String theSearchText;
            theSearchText = this.getSearchText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchText", theSearchText), currentHashCode, theSearchText);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClientsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClientsRequest that = ((GetClientsRequest) object);
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
            String lhsSearchText;
            lhsSearchText = this.getSearchText();
            String rhsSearchText;
            rhsSearchText = that.getSearchText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchText", lhsSearchText), LocatorUtils.property(thatLocator, "searchText", rhsSearchText), lhsSearchText, rhsSearchText)) {
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
            String theSearchText;
            theSearchText = this.getSearchText();
            strategy.appendField(locator, this, "searchText", buffer, theSearchText);
        }
        return buffer;
    }

}
