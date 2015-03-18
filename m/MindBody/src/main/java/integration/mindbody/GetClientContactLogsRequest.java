
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
 * <p>Java class for GetClientContactLogsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientContactLogsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="ShowSystemGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TypeIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SubtypeIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientContactLogsRequest", propOrder = {
    "clientID",
    "startDate",
    "endDate",
    "staffIDs",
    "showSystemGenerated",
    "typeIDs",
    "subtypeIDs"
})
public class GetClientContactLogsRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "StartDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "ShowSystemGenerated", required = true, type = Boolean.class, nillable = true)
    protected Boolean showSystemGenerated;
    @XmlElement(name = "TypeIDs")
    protected ArrayOfInt typeIDs;
    @XmlElement(name = "SubtypeIDs")
    protected ArrayOfInt subtypeIDs;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
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
     * Gets the value of the showSystemGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowSystemGenerated() {
        return showSystemGenerated;
    }

    /**
     * Sets the value of the showSystemGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSystemGenerated(Boolean value) {
        this.showSystemGenerated = value;
    }

    /**
     * Gets the value of the typeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getTypeIDs() {
        return typeIDs;
    }

    /**
     * Sets the value of the typeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setTypeIDs(ArrayOfInt value) {
        this.typeIDs = value;
    }

    /**
     * Gets the value of the subtypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSubtypeIDs() {
        return subtypeIDs;
    }

    /**
     * Sets the value of the subtypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSubtypeIDs(ArrayOfInt value) {
        this.subtypeIDs = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            Date theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate);
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staffIDs", theStaffIDs), currentHashCode, theStaffIDs);
        }
        {
            Boolean theShowSystemGenerated;
            theShowSystemGenerated = this.getShowSystemGenerated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showSystemGenerated", theShowSystemGenerated), currentHashCode, theShowSystemGenerated);
        }
        {
            ArrayOfInt theTypeIDs;
            theTypeIDs = this.getTypeIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeIDs", theTypeIDs), currentHashCode, theTypeIDs);
        }
        {
            ArrayOfInt theSubtypeIDs;
            theSubtypeIDs = this.getSubtypeIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subtypeIDs", theSubtypeIDs), currentHashCode, theSubtypeIDs);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClientContactLogsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClientContactLogsRequest that = ((GetClientContactLogsRequest) object);
        {
            String lhsClientID;
            lhsClientID = this.getClientID();
            String rhsClientID;
            rhsClientID = that.getClientID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientID", lhsClientID), LocatorUtils.property(thatLocator, "clientID", rhsClientID), lhsClientID, rhsClientID)) {
                return false;
            }
        }
        {
            Date lhsStartDate;
            lhsStartDate = this.getStartDate();
            Date rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate)) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate)) {
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
            Boolean lhsShowSystemGenerated;
            lhsShowSystemGenerated = this.getShowSystemGenerated();
            Boolean rhsShowSystemGenerated;
            rhsShowSystemGenerated = that.getShowSystemGenerated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showSystemGenerated", lhsShowSystemGenerated), LocatorUtils.property(thatLocator, "showSystemGenerated", rhsShowSystemGenerated), lhsShowSystemGenerated, rhsShowSystemGenerated)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsTypeIDs;
            lhsTypeIDs = this.getTypeIDs();
            ArrayOfInt rhsTypeIDs;
            rhsTypeIDs = that.getTypeIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeIDs", lhsTypeIDs), LocatorUtils.property(thatLocator, "typeIDs", rhsTypeIDs), lhsTypeIDs, rhsTypeIDs)) {
                return false;
            }
        }
        {
            ArrayOfInt lhsSubtypeIDs;
            lhsSubtypeIDs = this.getSubtypeIDs();
            ArrayOfInt rhsSubtypeIDs;
            rhsSubtypeIDs = that.getSubtypeIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subtypeIDs", lhsSubtypeIDs), LocatorUtils.property(thatLocator, "subtypeIDs", rhsSubtypeIDs), lhsSubtypeIDs, rhsSubtypeIDs)) {
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
            String theClientID;
            theClientID = this.getClientID();
            strategy.appendField(locator, this, "clientID", buffer, theClientID);
        }
        {
            Date theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate);
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate);
        }
        {
            ArrayOfLong theStaffIDs;
            theStaffIDs = this.getStaffIDs();
            strategy.appendField(locator, this, "staffIDs", buffer, theStaffIDs);
        }
        {
            Boolean theShowSystemGenerated;
            theShowSystemGenerated = this.getShowSystemGenerated();
            strategy.appendField(locator, this, "showSystemGenerated", buffer, theShowSystemGenerated);
        }
        {
            ArrayOfInt theTypeIDs;
            theTypeIDs = this.getTypeIDs();
            strategy.appendField(locator, this, "typeIDs", buffer, theTypeIDs);
        }
        {
            ArrayOfInt theSubtypeIDs;
            theSubtypeIDs = this.getSubtypeIDs();
            strategy.appendField(locator, this, "subtypeIDs", buffer, theSubtypeIDs);
        }
        return buffer;
    }

}
