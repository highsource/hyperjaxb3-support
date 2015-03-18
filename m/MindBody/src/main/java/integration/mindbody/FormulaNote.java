
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
 * <p>Java class for FormulaNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormulaNote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AppointmentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormulaNote", propOrder = {
    "id",
    "clientID",
    "note",
    "entryDateTime",
    "appointmentID"
})
@Entity(name = "FormulaNote")
@Table(name = "FORMULANOTE")
@IdClass(FormulaNoteId.class)
public class FormulaNote
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "EntryDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date entryDateTime;
    @XmlElement(name = "AppointmentID", required = true, type = Long.class, nillable = true)
    protected Long appointmentID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "ID", scale = 0)
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CLIENTID", length = 255)
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NOTE", length = 255)
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the entryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ENTRYDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEntryDateTime() {
        return entryDateTime;
    }

    /**
     * Sets the value of the entryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDateTime(Date value) {
        this.entryDateTime = value;
    }

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "APPOINTMENTID", precision = 20, scale = 0)
    public Long getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppointmentID(Long value) {
        this.appointmentID = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            Date theEntryDateTime;
            theEntryDateTime = this.getEntryDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entryDateTime", theEntryDateTime), currentHashCode, theEntryDateTime);
        }
        {
            Long theAppointmentID;
            theAppointmentID = this.getAppointmentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appointmentID", theAppointmentID), currentHashCode, theAppointmentID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FormulaNote)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FormulaNote that = ((FormulaNote) object);
        {
            Long lhsID;
            lhsID = this.getID();
            Long rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
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
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            Date lhsEntryDateTime;
            lhsEntryDateTime = this.getEntryDateTime();
            Date rhsEntryDateTime;
            rhsEntryDateTime = that.getEntryDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entryDateTime", lhsEntryDateTime), LocatorUtils.property(thatLocator, "entryDateTime", rhsEntryDateTime), lhsEntryDateTime, rhsEntryDateTime)) {
                return false;
            }
        }
        {
            Long lhsAppointmentID;
            lhsAppointmentID = this.getAppointmentID();
            Long rhsAppointmentID;
            rhsAppointmentID = that.getAppointmentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appointmentID", lhsAppointmentID), LocatorUtils.property(thatLocator, "appointmentID", rhsAppointmentID), lhsAppointmentID, rhsAppointmentID)) {
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
            Long theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            strategy.appendField(locator, this, "clientID", buffer, theClientID);
        }
        {
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        {
            Date theEntryDateTime;
            theEntryDateTime = this.getEntryDateTime();
            strategy.appendField(locator, this, "entryDateTime", buffer, theEntryDateTime);
        }
        {
            Long theAppointmentID;
            theAppointmentID = this.getAppointmentID();
            strategy.appendField(locator, this, "appointmentID", buffer, theAppointmentID);
        }
        return buffer;
    }

}
