
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
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
 * <p>Java class for SessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="DefaultTimeLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumDeducted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionType", propOrder = {
    "defaultTimeLength",
    "programID",
    "numDeducted",
    "action",
    "id",
    "name"
})
@Entity(name = "SessionType")
@Table(name = "SESSION_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class SessionType
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultTimeLength", required = true, type = Integer.class, nillable = true)
    protected Integer defaultTimeLength;
    @XmlElement(name = "ProgramID", required = true, type = Integer.class, nillable = true)
    protected Integer programID;
    @XmlElement(name = "NumDeducted", required = true, type = Integer.class, nillable = true)
    protected Integer numDeducted;
    @XmlElement(name = "Action")
    protected ActionCode action;
    @XmlElement(name = "ID", nillable = true)
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the defaultTimeLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "DEFAULT_TIME_LENGTH", precision = 10, scale = 0)
    public Integer getDefaultTimeLength() {
        return defaultTimeLength;
    }

    /**
     * Sets the value of the defaultTimeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultTimeLength(Integer value) {
        this.defaultTimeLength = value;
    }

    /**
     * Gets the value of the programID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "PROGRAM_ID", precision = 10, scale = 0)
    public Integer getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgramID(Integer value) {
        this.programID = value;
    }

    /**
     * Gets the value of the numDeducted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "NUM_DEDUCTED", precision = 10, scale = 0)
    public Integer getNumDeducted() {
        return numDeducted;
    }

    /**
     * Sets the value of the numDeducted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDeducted(Integer value) {
        this.numDeducted = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    @Basic
    @Column(name = "ACTION_", length = 255)
    @Enumerated(EnumType.STRING)
    public ActionCode getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setAction(ActionCode value) {
        this.action = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Id
    @Column(name = "ID", scale = 0)
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theDefaultTimeLength;
            theDefaultTimeLength = this.getDefaultTimeLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultTimeLength", theDefaultTimeLength), currentHashCode, theDefaultTimeLength);
        }
        {
            Integer theProgramID;
            theProgramID = this.getProgramID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "programID", theProgramID), currentHashCode, theProgramID);
        }
        {
            Integer theNumDeducted;
            theNumDeducted = this.getNumDeducted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numDeducted", theNumDeducted), currentHashCode, theNumDeducted);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            Integer theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SessionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SessionType that = ((SessionType) object);
        {
            Integer lhsDefaultTimeLength;
            lhsDefaultTimeLength = this.getDefaultTimeLength();
            Integer rhsDefaultTimeLength;
            rhsDefaultTimeLength = that.getDefaultTimeLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultTimeLength", lhsDefaultTimeLength), LocatorUtils.property(thatLocator, "defaultTimeLength", rhsDefaultTimeLength), lhsDefaultTimeLength, rhsDefaultTimeLength)) {
                return false;
            }
        }
        {
            Integer lhsProgramID;
            lhsProgramID = this.getProgramID();
            Integer rhsProgramID;
            rhsProgramID = that.getProgramID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "programID", lhsProgramID), LocatorUtils.property(thatLocator, "programID", rhsProgramID), lhsProgramID, rhsProgramID)) {
                return false;
            }
        }
        {
            Integer lhsNumDeducted;
            lhsNumDeducted = this.getNumDeducted();
            Integer rhsNumDeducted;
            rhsNumDeducted = that.getNumDeducted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numDeducted", lhsNumDeducted), LocatorUtils.property(thatLocator, "numDeducted", rhsNumDeducted), lhsNumDeducted, rhsNumDeducted)) {
                return false;
            }
        }
        {
            ActionCode lhsAction;
            lhsAction = this.getAction();
            ActionCode rhsAction;
            rhsAction = that.getAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction)) {
                return false;
            }
        }
        {
            Integer lhsID;
            lhsID = this.getID();
            Integer rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            Integer theDefaultTimeLength;
            theDefaultTimeLength = this.getDefaultTimeLength();
            strategy.appendField(locator, this, "defaultTimeLength", buffer, theDefaultTimeLength);
        }
        {
            Integer theProgramID;
            theProgramID = this.getProgramID();
            strategy.appendField(locator, this, "programID", buffer, theProgramID);
        }
        {
            Integer theNumDeducted;
            theNumDeducted = this.getNumDeducted();
            strategy.appendField(locator, this, "numDeducted", buffer, theNumDeducted);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            Integer theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

}
