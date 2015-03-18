
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
 * <p>Java class for ContactLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5}Client" minOccurs="0"/>
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FollowupByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="ContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSystemGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfContactLogComment" minOccurs="0"/>
 *         &lt;element name="Types" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfContactLogType" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5}ActionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactLog", propOrder = {
    "id",
    "createdBy",
    "client",
    "createdDateTime",
    "followupByDate",
    "contactName",
    "text",
    "assignedTo",
    "contactMethod",
    "isSystemGenerated",
    "comments",
    "types",
    "action"
})
@Entity(name = "ContactLog")
@Table(name = "CONTACTLOG")
public class ContactLog
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", nillable = true)
    protected Long id;
    @XmlElement(name = "CreatedBy")
    protected Staff createdBy;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "CreatedDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdDateTime;
    @XmlElement(name = "FollowupByDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date followupByDate;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "AssignedTo")
    protected Staff assignedTo;
    @XmlElement(name = "ContactMethod")
    protected String contactMethod;
    @XmlElement(name = "IsSystemGenerated")
    protected Boolean isSystemGenerated;
    @XmlElement(name = "Comments")
    protected ArrayOfContactLogComment comments;
    @XmlElement(name = "Types")
    protected ArrayOfContactLogType types;
    @XmlElement(name = "Action")
    protected ActionCode action;

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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    @ManyToOne(targetEntity = Staff.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumns({
        @JoinColumn(name = "CREATEDBY_CONTACTLOG_ID"),
        @JoinColumn(name = "CREATEDBY_CONTACTLOG_HJID")
    })
    public Staff getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setCreatedBy(Staff value) {
        this.createdBy = value;
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
    @JoinColumns({
        @JoinColumn(name = "CLIENT_CONTACTLOG_ID"),
        @JoinColumn(name = "CLIENT_CONTACTLOG_HJID")
    })
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
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CREATEDDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDateTime(Date value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the followupByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FOLLOWUPBYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFollowupByDate() {
        return followupByDate;
    }

    /**
     * Sets the value of the followupByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowupByDate(Date value) {
        this.followupByDate = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONTACTNAME", length = 255)
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TEXT", length = 255)
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    @ManyToOne(targetEntity = Staff.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumns({
        @JoinColumn(name = "ASSIGNEDTO_CONTACTLOG_ID"),
        @JoinColumn(name = "ASSIGNEDTO_CONTACTLOG_HJID")
    })
    public Staff getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setAssignedTo(Staff value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONTACTMETHOD", length = 255)
    public String getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethod(String value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the isSystemGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ISSYSTEMGENERATED")
    public Boolean getIsSystemGenerated() {
        return isSystemGenerated;
    }

    /**
     * Sets the value of the isSystemGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSystemGenerated(Boolean value) {
        this.isSystemGenerated = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLogComment }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfContactLogComment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMMENTS_CONTACTLOG_HJID")
    public ArrayOfContactLogComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLogComment }
     *     
     */
    public void setComments(ArrayOfContactLogComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLogType }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfContactLogType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPES_CONTACTLOG_HJID")
    public ArrayOfContactLogType getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLogType }
     *     
     */
    public void setTypes(ArrayOfContactLogType value) {
        this.types = value;
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Staff theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdBy", theCreatedBy), currentHashCode, theCreatedBy);
        }
        {
            Client theClient;
            theClient = this.getClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "client", theClient), currentHashCode, theClient);
        }
        {
            Date theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDateTime", theCreatedDateTime), currentHashCode, theCreatedDateTime);
        }
        {
            Date theFollowupByDate;
            theFollowupByDate = this.getFollowupByDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "followupByDate", theFollowupByDate), currentHashCode, theFollowupByDate);
        }
        {
            String theContactName;
            theContactName = this.getContactName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactName", theContactName), currentHashCode, theContactName);
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            Staff theAssignedTo;
            theAssignedTo = this.getAssignedTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assignedTo", theAssignedTo), currentHashCode, theAssignedTo);
        }
        {
            String theContactMethod;
            theContactMethod = this.getContactMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactMethod", theContactMethod), currentHashCode, theContactMethod);
        }
        {
            Boolean theIsSystemGenerated;
            theIsSystemGenerated = this.getIsSystemGenerated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSystemGenerated", theIsSystemGenerated), currentHashCode, theIsSystemGenerated);
        }
        {
            ArrayOfContactLogComment theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments);
        }
        {
            ArrayOfContactLogType theTypes;
            theTypes = this.getTypes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "types", theTypes), currentHashCode, theTypes);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactLog)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ContactLog that = ((ContactLog) object);
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
            Staff lhsCreatedBy;
            lhsCreatedBy = this.getCreatedBy();
            Staff rhsCreatedBy;
            rhsCreatedBy = that.getCreatedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdBy", lhsCreatedBy), LocatorUtils.property(thatLocator, "createdBy", rhsCreatedBy), lhsCreatedBy, rhsCreatedBy)) {
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
            Date lhsCreatedDateTime;
            lhsCreatedDateTime = this.getCreatedDateTime();
            Date rhsCreatedDateTime;
            rhsCreatedDateTime = that.getCreatedDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDateTime", lhsCreatedDateTime), LocatorUtils.property(thatLocator, "createdDateTime", rhsCreatedDateTime), lhsCreatedDateTime, rhsCreatedDateTime)) {
                return false;
            }
        }
        {
            Date lhsFollowupByDate;
            lhsFollowupByDate = this.getFollowupByDate();
            Date rhsFollowupByDate;
            rhsFollowupByDate = that.getFollowupByDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "followupByDate", lhsFollowupByDate), LocatorUtils.property(thatLocator, "followupByDate", rhsFollowupByDate), lhsFollowupByDate, rhsFollowupByDate)) {
                return false;
            }
        }
        {
            String lhsContactName;
            lhsContactName = this.getContactName();
            String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName)) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
                return false;
            }
        }
        {
            Staff lhsAssignedTo;
            lhsAssignedTo = this.getAssignedTo();
            Staff rhsAssignedTo;
            rhsAssignedTo = that.getAssignedTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assignedTo", lhsAssignedTo), LocatorUtils.property(thatLocator, "assignedTo", rhsAssignedTo), lhsAssignedTo, rhsAssignedTo)) {
                return false;
            }
        }
        {
            String lhsContactMethod;
            lhsContactMethod = this.getContactMethod();
            String rhsContactMethod;
            rhsContactMethod = that.getContactMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactMethod", lhsContactMethod), LocatorUtils.property(thatLocator, "contactMethod", rhsContactMethod), lhsContactMethod, rhsContactMethod)) {
                return false;
            }
        }
        {
            Boolean lhsIsSystemGenerated;
            lhsIsSystemGenerated = this.getIsSystemGenerated();
            Boolean rhsIsSystemGenerated;
            rhsIsSystemGenerated = that.getIsSystemGenerated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSystemGenerated", lhsIsSystemGenerated), LocatorUtils.property(thatLocator, "isSystemGenerated", rhsIsSystemGenerated), lhsIsSystemGenerated, rhsIsSystemGenerated)) {
                return false;
            }
        }
        {
            ArrayOfContactLogComment lhsComments;
            lhsComments = this.getComments();
            ArrayOfContactLogComment rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments)) {
                return false;
            }
        }
        {
            ArrayOfContactLogType lhsTypes;
            lhsTypes = this.getTypes();
            ArrayOfContactLogType rhsTypes;
            rhsTypes = that.getTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "types", lhsTypes), LocatorUtils.property(thatLocator, "types", rhsTypes), lhsTypes, rhsTypes)) {
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
            Staff theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            strategy.appendField(locator, this, "createdBy", buffer, theCreatedBy);
        }
        {
            Client theClient;
            theClient = this.getClient();
            strategy.appendField(locator, this, "client", buffer, theClient);
        }
        {
            Date theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            strategy.appendField(locator, this, "createdDateTime", buffer, theCreatedDateTime);
        }
        {
            Date theFollowupByDate;
            theFollowupByDate = this.getFollowupByDate();
            strategy.appendField(locator, this, "followupByDate", buffer, theFollowupByDate);
        }
        {
            String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName);
        }
        {
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            Staff theAssignedTo;
            theAssignedTo = this.getAssignedTo();
            strategy.appendField(locator, this, "assignedTo", buffer, theAssignedTo);
        }
        {
            String theContactMethod;
            theContactMethod = this.getContactMethod();
            strategy.appendField(locator, this, "contactMethod", buffer, theContactMethod);
        }
        {
            Boolean theIsSystemGenerated;
            theIsSystemGenerated = this.getIsSystemGenerated();
            strategy.appendField(locator, this, "isSystemGenerated", buffer, theIsSystemGenerated);
        }
        {
            ArrayOfContactLogComment theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            ArrayOfContactLogType theTypes;
            theTypes = this.getTypes();
            strategy.appendField(locator, this, "types", buffer, theTypes);
        }
        {
            ActionCode theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        return buffer;
    }

}
