
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
 * <p>Java class for GetClassDescriptionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClassDescriptionsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassDescriptionIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StartClassDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndClassDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClassDescriptionsRequest", propOrder = {
    "classDescriptionIDs",
    "programIDs",
    "staffIDs",
    "locationIDs",
    "startClassDateTime",
    "endClassDateTime"
})
public class GetClassDescriptionsRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassDescriptionIDs")
    protected ArrayOfInt classDescriptionIDs;
    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "LocationIDs")
    protected ArrayOfInt locationIDs;
    @XmlElement(name = "StartClassDateTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startClassDateTime;
    @XmlElement(name = "EndClassDateTime", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endClassDateTime;

    /**
     * Gets the value of the classDescriptionIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassDescriptionIDs() {
        return classDescriptionIDs;
    }

    /**
     * Sets the value of the classDescriptionIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassDescriptionIDs(ArrayOfInt value) {
        this.classDescriptionIDs = value;
    }

    /**
     * Gets the value of the programIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProgramIDs() {
        return programIDs;
    }

    /**
     * Sets the value of the programIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProgramIDs(ArrayOfInt value) {
        this.programIDs = value;
    }

    /**
     * Gets the value of the staffIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getStaffIDs() {
        return staffIDs;
    }

    /**
     * Sets the value of the staffIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setStaffIDs(ArrayOfLong value) {
        this.staffIDs = value;
    }

    /**
     * Gets the value of the locationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationIDs() {
        return locationIDs;
    }

    /**
     * Sets the value of the locationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationIDs(ArrayOfInt value) {
        this.locationIDs = value;
    }

    /**
     * Gets the value of the startClassDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartClassDateTime() {
        return startClassDateTime;
    }

    /**
     * Sets the value of the startClassDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartClassDateTime(Date value) {
        this.startClassDateTime = value;
    }

    /**
     * Gets the value of the endClassDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndClassDateTime() {
        return endClassDateTime;
    }

    /**
     * Sets the value of the endClassDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndClassDateTime(Date value) {
        this.endClassDateTime = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ArrayOfInt theClassDescriptionIDs;
            theClassDescriptionIDs = this.getClassDescriptionIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescriptionIDs", theClassDescriptionIDs), currentHashCode, theClassDescriptionIDs);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programIDs", theProgramIDs), currentHashCode, theProgramIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staffIDs", theStaffIDs), currentHashCode, theStaffIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationIDs", theLocationIDs), currentHashCode, theLocationIDs);
        }
        {
            Date theStartClassDateTime;
            theStartClassDateTime = this.getStartClassDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startClassDateTime", theStartClassDateTime), currentHashCode, theStartClassDateTime);
        }
        {
            Date theEndClassDateTime;
            theEndClassDateTime = this.getEndClassDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endClassDateTime", theEndClassDateTime), currentHashCode, theEndClassDateTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClassDescriptionsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClassDescriptionsRequest that = ((GetClassDescriptionsRequest) object);
        {
            ArrayOfInt lhsClassDescriptionIDs;
            lhsClassDescriptionIDs = this.getClassDescriptionIDs();
            ArrayOfInt rhsClassDescriptionIDs;
            rhsClassDescriptionIDs = that.getClassDescriptionIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescriptionIDs", lhsClassDescriptionIDs), LocatorUtils.property(thatLocator, "classDescriptionIDs", rhsClassDescriptionIDs), lhsClassDescriptionIDs, rhsClassDescriptionIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsProgramIDs;
            lhsProgramIDs = this.getProgramIDs();
            ArrayOfInt rhsProgramIDs;
            rhsProgramIDs = that.getProgramIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programIDs", lhsProgramIDs), LocatorUtils.property(thatLocator, "programIDs", rhsProgramIDs), lhsProgramIDs, rhsProgramIDs)) {
                return false;
            }
        }
        {
            ArrayOfLong lhsStaffIDs;
            lhsStaffIDs = this.getStaffIDs();
            ArrayOfLong rhsStaffIDs;
            rhsStaffIDs = that.getStaffIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staffIDs", lhsStaffIDs), LocatorUtils.property(thatLocator, "staffIDs", rhsStaffIDs), lhsStaffIDs, rhsStaffIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsLocationIDs;
            lhsLocationIDs = this.getLocationIDs();
            ArrayOfInt rhsLocationIDs;
            rhsLocationIDs = that.getLocationIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationIDs", lhsLocationIDs), LocatorUtils.property(thatLocator, "locationIDs", rhsLocationIDs), lhsLocationIDs, rhsLocationIDs)) {
                return false;
            }
        }
        {
            Date lhsStartClassDateTime;
            lhsStartClassDateTime = this.getStartClassDateTime();
            Date rhsStartClassDateTime;
            rhsStartClassDateTime = that.getStartClassDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startClassDateTime", lhsStartClassDateTime), LocatorUtils.property(thatLocator, "startClassDateTime", rhsStartClassDateTime), lhsStartClassDateTime, rhsStartClassDateTime)) {
                return false;
            }
        }
        {
            Date lhsEndClassDateTime;
            lhsEndClassDateTime = this.getEndClassDateTime();
            Date rhsEndClassDateTime;
            rhsEndClassDateTime = that.getEndClassDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endClassDateTime", lhsEndClassDateTime), LocatorUtils.property(thatLocator, "endClassDateTime", rhsEndClassDateTime), lhsEndClassDateTime, rhsEndClassDateTime)) {
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
            ArrayOfInt theClassDescriptionIDs;
            theClassDescriptionIDs = this.getClassDescriptionIDs();
            strategy.appendField(locator, this, "classDescriptionIDs", buffer, theClassDescriptionIDs);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            strategy.appendField(locator, this, "programIDs", buffer, theProgramIDs);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            strategy.appendField(locator, this, "staffIDs", buffer, theStaffIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            strategy.appendField(locator, this, "locationIDs", buffer, theLocationIDs);
        }
        {
            Date theStartClassDateTime;
            theStartClassDateTime = this.getStartClassDateTime();
            strategy.appendField(locator, this, "startClassDateTime", buffer, theStartClassDateTime);
        }
        {
            Date theEndClassDateTime;
            theEndClassDateTime = this.getEndClassDateTime();
            strategy.appendField(locator, this, "endClassDateTime", buffer, theEndClassDateTime);
        }
        return buffer;
    }

}
