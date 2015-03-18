
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * <p>Java class for WaitlistEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaitlistEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClassDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5}Client" minOccurs="0"/>
 *         &lt;element name="ClassSchedule" type="{http://clients.mindbodyonline.com/api/0_5}ClassSchedule" minOccurs="0"/>
 *         &lt;element name="EnrollmentDateForward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitlistEntry", propOrder = {
    "id",
    "classID",
    "classDate",
    "client",
    "classSchedule",
    "enrollmentDateForward",
    "requestDateTime",
    "web"
})
@Entity(name = "WaitlistEntry")
@Table(name = "WAITLIST_ENTRY")
@Inheritance(strategy = InheritanceType.JOINED)
public class WaitlistEntry
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ClassID")
    protected long classID;
    @XmlElement(name = "ClassDate", required = true, type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date classDate;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "ClassSchedule")
    protected ClassSchedule classSchedule;
    @XmlElement(name = "EnrollmentDateForward", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date enrollmentDateForward;
    @XmlElement(name = "RequestDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date requestDateTime;
    @XmlElement(name = "Web")
    protected boolean web;

    /**
     * Gets the value of the id property.
     * 
     */
    @Id
    @Column(name = "ID", scale = 0)
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     */
    @Basic
    @Column(name = "CLASS_ID", precision = 20, scale = 0)
    public long getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(long value) {
        this.classID = value;
    }

    /**
     * Gets the value of the classDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CLASS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getClassDate() {
        return classDate;
    }

    /**
     * Sets the value of the classDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDate(Date value) {
        this.classDate = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    @ManyToOne(targetEntity = Client.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLIENT_WAITLIST_ENTRY_ID")
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the classSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ClassSchedule }
     *     
     */
    @ManyToOne(targetEntity = ClassSchedule.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLASS_SCHEDULE_WAITLIST_ENTR_0")
    public ClassSchedule getClassSchedule() {
        return classSchedule;
    }

    /**
     * Sets the value of the classSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassSchedule }
     *     
     */
    public void setClassSchedule(ClassSchedule value) {
        this.classSchedule = value;
    }

    /**
     * Gets the value of the enrollmentDateForward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ENROLLMENT_DATE_FORWARD")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEnrollmentDateForward() {
        return enrollmentDateForward;
    }

    /**
     * Sets the value of the enrollmentDateForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentDateForward(Date value) {
        this.enrollmentDateForward = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REQUEST_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(Date value) {
        this.requestDateTime = value;
    }

    /**
     * Gets the value of the web property.
     * 
     */
    @Basic
    @Column(name = "WEB")
    public boolean isWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     */
    public void setWeb(boolean value) {
        this.web = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            long theClassID;
            theClassID = this.getClassID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classID", theClassID), currentHashCode, theClassID);
        }
        {
            Date theClassDate;
            theClassDate = this.getClassDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDate", theClassDate), currentHashCode, theClassDate);
        }
        {
            Client theClient;
            theClient = this.getClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "client", theClient), currentHashCode, theClient);
        }
        {
            ClassSchedule theClassSchedule;
            theClassSchedule = this.getClassSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classSchedule", theClassSchedule), currentHashCode, theClassSchedule);
        }
        {
            Date theEnrollmentDateForward;
            theEnrollmentDateForward = this.getEnrollmentDateForward();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enrollmentDateForward", theEnrollmentDateForward), currentHashCode, theEnrollmentDateForward);
        }
        {
            Date theRequestDateTime;
            theRequestDateTime = this.getRequestDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestDateTime", theRequestDateTime), currentHashCode, theRequestDateTime);
        }
        {
            boolean theWeb;
            theWeb = this.isWeb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "web", theWeb), currentHashCode, theWeb);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WaitlistEntry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WaitlistEntry that = ((WaitlistEntry) object);
        {
            int lhsID;
            lhsID = this.getID();
            int rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            long lhsClassID;
            lhsClassID = this.getClassID();
            long rhsClassID;
            rhsClassID = that.getClassID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classID", lhsClassID), LocatorUtils.property(thatLocator, "classID", rhsClassID), lhsClassID, rhsClassID)) {
                return false;
            }
        }
        {
            Date lhsClassDate;
            lhsClassDate = this.getClassDate();
            Date rhsClassDate;
            rhsClassDate = that.getClassDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDate", lhsClassDate), LocatorUtils.property(thatLocator, "classDate", rhsClassDate), lhsClassDate, rhsClassDate)) {
                return false;
            }
        }
        {
            Client lhsClient;
            lhsClient = this.getClient();
            Client rhsClient;
            rhsClient = that.getClient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "client", lhsClient), LocatorUtils.property(thatLocator, "client", rhsClient), lhsClient, rhsClient)) {
                return false;
            }
        }
        {
            ClassSchedule lhsClassSchedule;
            lhsClassSchedule = this.getClassSchedule();
            ClassSchedule rhsClassSchedule;
            rhsClassSchedule = that.getClassSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classSchedule", lhsClassSchedule), LocatorUtils.property(thatLocator, "classSchedule", rhsClassSchedule), lhsClassSchedule, rhsClassSchedule)) {
                return false;
            }
        }
        {
            Date lhsEnrollmentDateForward;
            lhsEnrollmentDateForward = this.getEnrollmentDateForward();
            Date rhsEnrollmentDateForward;
            rhsEnrollmentDateForward = that.getEnrollmentDateForward();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enrollmentDateForward", lhsEnrollmentDateForward), LocatorUtils.property(thatLocator, "enrollmentDateForward", rhsEnrollmentDateForward), lhsEnrollmentDateForward, rhsEnrollmentDateForward)) {
                return false;
            }
        }
        {
            Date lhsRequestDateTime;
            lhsRequestDateTime = this.getRequestDateTime();
            Date rhsRequestDateTime;
            rhsRequestDateTime = that.getRequestDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestDateTime", lhsRequestDateTime), LocatorUtils.property(thatLocator, "requestDateTime", rhsRequestDateTime), lhsRequestDateTime, rhsRequestDateTime)) {
                return false;
            }
        }
        {
            boolean lhsWeb;
            lhsWeb = this.isWeb();
            boolean rhsWeb;
            rhsWeb = that.isWeb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "web", lhsWeb), LocatorUtils.property(thatLocator, "web", rhsWeb), lhsWeb, rhsWeb)) {
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
        {
            int theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            long theClassID;
            theClassID = this.getClassID();
            strategy.appendField(locator, this, "classID", buffer, theClassID);
        }
        {
            Date theClassDate;
            theClassDate = this.getClassDate();
            strategy.appendField(locator, this, "classDate", buffer, theClassDate);
        }
        {
            Client theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            ClassSchedule theClassSchedule;
            theClassSchedule = this.getClassSchedule();
            strategy.appendField(locator, this, "classSchedule", buffer, theClassSchedule);
        }
        {
            Date theEnrollmentDateForward;
            theEnrollmentDateForward = this.getEnrollmentDateForward();
            strategy.appendField(locator, this, "enrollmentDateForward", buffer, theEnrollmentDateForward);
        }
        {
            Date theRequestDateTime;
            theRequestDateTime = this.getRequestDateTime();
            strategy.appendField(locator, this, "requestDateTime", buffer, theRequestDateTime);
        }
        {
            boolean theWeb;
            theWeb = this.isWeb();
            strategy.appendField(locator, this, "web", buffer, theWeb);
        }
        return buffer;
    }

}
