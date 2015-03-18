
package integration.mindbody;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
 * <p>Java class for ContactLogComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactLogComment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://clients.mindbodyonline.com/api/0_5}Staff" minOccurs="0"/>
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactLogComment", propOrder = {
    "id",
    "text",
    "createdBy",
    "createdDateTime"
})
@Entity(name = "ContactLogComment")
@Table(name = "CONTACTLOGCOMMENT")
@IdClass(ContactLogCommentId.class)
public class ContactLogComment
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "CreatedBy")
    protected Staff createdBy;
    @XmlElement(name = "CreatedDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdDateTime;

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
        @JoinColumn(name = "CREATEDBY_CONTACTLOGCOMMENT__0"),
        @JoinColumn(name = "CREATEDBY_CONTACTLOGCOMMENT__1")
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

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            Staff theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdBy", theCreatedBy), currentHashCode, theCreatedBy);
        }
        {
            Date theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdDateTime", theCreatedDateTime), currentHashCode, theCreatedDateTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContactLogComment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ContactLogComment that = ((ContactLogComment) object);
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
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
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
            Date lhsCreatedDateTime;
            lhsCreatedDateTime = this.getCreatedDateTime();
            Date rhsCreatedDateTime;
            rhsCreatedDateTime = that.getCreatedDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDateTime", lhsCreatedDateTime), LocatorUtils.property(thatLocator, "createdDateTime", rhsCreatedDateTime), lhsCreatedDateTime, rhsCreatedDateTime)) {
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
            Integer theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            Staff theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            strategy.appendField(locator, this, "createdBy", buffer, theCreatedBy);
        }
        {
            Date theCreatedDateTime;
            theCreatedDateTime = this.getCreatedDateTime();
            strategy.appendField(locator, this, "createdDateTime", buffer, theCreatedDateTime);
        }
        return buffer;
    }

}
