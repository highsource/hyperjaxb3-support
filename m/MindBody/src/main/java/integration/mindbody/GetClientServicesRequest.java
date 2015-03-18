
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
 * <p>Java class for GetClientServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientServicesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="VisitCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShowActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientServicesRequest", propOrder = {
    "clientID",
    "classID",
    "programIDs",
    "sessionTypeIDs",
    "locationIDs",
    "visitCount",
    "startDate",
    "endDate",
    "showActiveOnly"
})
public class GetClientServicesRequest
    extends MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClassID")
    protected int classID;
    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "LocationIDs")
    protected ArrayOfInt locationIDs;
    @XmlElement(name = "VisitCount", required = true, type = Integer.class, nillable = true)
    protected Integer visitCount;
    @XmlElement(name = "StartDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "ShowActiveOnly", required = true, type = Boolean.class, nillable = true)
    protected Boolean showActiveOnly;

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
     * Gets the value of the classID property.
     * 
     */
    public int getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(int value) {
        this.classID = value;
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
     * Gets the value of the sessionTypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSessionTypeIDs() {
        return sessionTypeIDs;
    }

    /**
     * Sets the value of the sessionTypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSessionTypeIDs(ArrayOfInt value) {
        this.sessionTypeIDs = value;
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
     * Gets the value of the visitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisitCount() {
        return visitCount;
    }

    /**
     * Sets the value of the visitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitCount(Integer value) {
        this.visitCount = value;
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
     * Gets the value of the showActiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowActiveOnly() {
        return showActiveOnly;
    }

    /**
     * Sets the value of the showActiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowActiveOnly(Boolean value) {
        this.showActiveOnly = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            int theClassID;
            theClassID = this.getClassID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classID", theClassID), currentHashCode, theClassID);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programIDs", theProgramIDs), currentHashCode, theProgramIDs);
        }
        {
            ArrayOfInt theSessionTypeIDs;
            theSessionTypeIDs = this.getSessionTypeIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionTypeIDs", theSessionTypeIDs), currentHashCode, theSessionTypeIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationIDs", theLocationIDs), currentHashCode, theLocationIDs);
        }
        {
            Integer theVisitCount;
            theVisitCount = this.getVisitCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "visitCount", theVisitCount), currentHashCode, theVisitCount);
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
            Boolean theShowActiveOnly;
            theShowActiveOnly = this.getShowActiveOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showActiveOnly", theShowActiveOnly), currentHashCode, theShowActiveOnly);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GetClientServicesRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GetClientServicesRequest that = ((GetClientServicesRequest) object);
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
            int lhsClassID;
            lhsClassID = this.getClassID();
            int rhsClassID;
            rhsClassID = that.getClassID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classID", lhsClassID), LocatorUtils.property(thatLocator, "classID", rhsClassID), lhsClassID, rhsClassID)) {
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
            ArrayOfInt lhsSessionTypeIDs;
            lhsSessionTypeIDs = this.getSessionTypeIDs();
            ArrayOfInt rhsSessionTypeIDs;
            rhsSessionTypeIDs = that.getSessionTypeIDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionTypeIDs", lhsSessionTypeIDs), LocatorUtils.property(thatLocator, "sessionTypeIDs", rhsSessionTypeIDs), lhsSessionTypeIDs, rhsSessionTypeIDs)) {
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
            Integer lhsVisitCount;
            lhsVisitCount = this.getVisitCount();
            Integer rhsVisitCount;
            rhsVisitCount = that.getVisitCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "visitCount", lhsVisitCount), LocatorUtils.property(thatLocator, "visitCount", rhsVisitCount), lhsVisitCount, rhsVisitCount)) {
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
            Boolean lhsShowActiveOnly;
            lhsShowActiveOnly = this.getShowActiveOnly();
            Boolean rhsShowActiveOnly;
            rhsShowActiveOnly = that.getShowActiveOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showActiveOnly", lhsShowActiveOnly), LocatorUtils.property(thatLocator, "showActiveOnly", rhsShowActiveOnly), lhsShowActiveOnly, rhsShowActiveOnly)) {
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
            int theClassID;
            theClassID = this.getClassID();
            strategy.appendField(locator, this, "classID", buffer, theClassID);
        }
        {
            ArrayOfInt theProgramIDs;
            theProgramIDs = this.getProgramIDs();
            strategy.appendField(locator, this, "programIDs", buffer, theProgramIDs);
        }
        {
            ArrayOfInt theSessionTypeIDs;
            theSessionTypeIDs = this.getSessionTypeIDs();
            strategy.appendField(locator, this, "sessionTypeIDs", buffer, theSessionTypeIDs);
        }
        {
            ArrayOfInt theLocationIDs;
            theLocationIDs = this.getLocationIDs();
            strategy.appendField(locator, this, "locationIDs", buffer, theLocationIDs);
        }
        {
            Integer theVisitCount;
            theVisitCount = this.getVisitCount();
            strategy.appendField(locator, this, "visitCount", buffer, theVisitCount);
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
            Boolean theShowActiveOnly;
            theShowActiveOnly = this.getShowActiveOnly();
            strategy.appendField(locator, this, "showActiveOnly", buffer, theShowActiveOnly);
        }
        return buffer;
    }

}
