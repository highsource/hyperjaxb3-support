
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
 * <p>Java class for GetCustomClientFieldsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomClientFieldsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBResult">
 *       &lt;sequence>
 *         &lt;element name="CustomClientFields" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfCustomClientField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomClientFieldsResult", propOrder = {
    "customClientFields"
})
public class GetCustomClientFieldsResult
    extends MBResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomClientFields")
    protected ArrayOfCustomClientField customClientFields;

    /**
     * Gets the value of the customClientFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public ArrayOfCustomClientField getCustomClientFields() {
        return customClientFields;
    }

    /**
     * Sets the value of the customClientFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomClientField }
     *     
     */
    public void setCustomClientFields(ArrayOfCustomClientField value) {
        this.customClientFields = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfCustomClientField theCustomClientFields;
            theCustomClientFields = this.getCustomClientFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customClientFields", theCustomClientFields), currentHashCode, theCustomClientFields);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetCustomClientFieldsResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetCustomClientFieldsResult that = ((GetCustomClientFieldsResult) object);
        {
            ArrayOfCustomClientField lhsCustomClientFields;
            lhsCustomClientFields = this.getCustomClientFields();
            ArrayOfCustomClientField rhsCustomClientFields;
            rhsCustomClientFields = that.getCustomClientFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customClientFields", lhsCustomClientFields), LocatorUtils.property(thatLocator, "customClientFields", rhsCustomClientFields), lhsCustomClientFields, rhsCustomClientFields)) {
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
            ArrayOfCustomClientField theCustomClientFields;
            theCustomClientFields = this.getCustomClientFields();
            strategy.appendField(locator, this, "customClientFields", buffer, theCustomClientFields);
        }
        return buffer;
    }

}
