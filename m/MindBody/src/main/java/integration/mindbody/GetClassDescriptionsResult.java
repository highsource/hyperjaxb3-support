
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
 * <p>Java class for GetClassDescriptionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassDescriptionsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBResult">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptions" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfClassDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassDescriptionsResult", propOrder = {
    "classDescriptions"
})
public class GetClassDescriptionsResult
    extends MBResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassDescriptions")
    protected ArrayOfClassDescription classDescriptions;

    /**
     * Gets the value of the classDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassDescription }
     *     
     */
    public ArrayOfClassDescription getClassDescriptions() {
        return classDescriptions;
    }

    /**
     * Sets the value of the classDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassDescription }
     *     
     */
    public void setClassDescriptions(ArrayOfClassDescription value) {
        this.classDescriptions = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfClassDescription theClassDescriptions;
            theClassDescriptions = this.getClassDescriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescriptions", theClassDescriptions), currentHashCode, theClassDescriptions);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClassDescriptionsResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClassDescriptionsResult that = ((GetClassDescriptionsResult) object);
        {
            ArrayOfClassDescription lhsClassDescriptions;
            lhsClassDescriptions = this.getClassDescriptions();
            ArrayOfClassDescription rhsClassDescriptions;
            rhsClassDescriptions = that.getClassDescriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescriptions", lhsClassDescriptions), LocatorUtils.property(thatLocator, "classDescriptions", rhsClassDescriptions), lhsClassDescriptions, rhsClassDescriptions)) {
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
            ArrayOfClassDescription theClassDescriptions;
            theClassDescriptions = this.getClassDescriptions();
            strategy.appendField(locator, this, "classDescriptions", buffer, theClassDescriptions);
        }
        return buffer;
    }

}
