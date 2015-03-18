
package integration.mindbody;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for Semester complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Semester">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MultiRegistrationDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MultiRegistrationDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Semester", propOrder = {
    "id",
    "name",
    "description",
    "startDate",
    "endDate",
    "multiRegistrationDiscount",
    "multiRegistrationDeadline"
})
@Entity(name = "Semester")
@Table(name = "SEMESTER")
@Inheritance(strategy = InheritanceType.JOINED)
public class Semester
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "StartDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "MultiRegistrationDiscount", required = true)
    protected BigDecimal multiRegistrationDiscount;
    @XmlElement(name = "MultiRegistrationDeadline", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date multiRegistrationDeadline;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", length = 255)
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
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
    @Basic
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
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
     * Gets the value of the multiRegistrationDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "MULTIREGISTRATIONDISCOUNT", precision = 20, scale = 10)
    public BigDecimal getMultiRegistrationDiscount() {
        return multiRegistrationDiscount;
    }

    /**
     * Sets the value of the multiRegistrationDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiRegistrationDiscount(BigDecimal value) {
        this.multiRegistrationDiscount = value;
    }

    /**
     * Gets the value of the multiRegistrationDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MULTIREGISTRATIONDEADLINE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getMultiRegistrationDeadline() {
        return multiRegistrationDeadline;
    }

    /**
     * Sets the value of the multiRegistrationDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiRegistrationDeadline(Date value) {
        this.multiRegistrationDeadline = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
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
            BigDecimal theMultiRegistrationDiscount;
            theMultiRegistrationDiscount = this.getMultiRegistrationDiscount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiRegistrationDiscount", theMultiRegistrationDiscount), currentHashCode, theMultiRegistrationDiscount);
        }
        {
            Date theMultiRegistrationDeadline;
            theMultiRegistrationDeadline = this.getMultiRegistrationDeadline();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiRegistrationDeadline", theMultiRegistrationDeadline), currentHashCode, theMultiRegistrationDeadline);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Semester)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Semester that = ((Semester) object);
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
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
            BigDecimal lhsMultiRegistrationDiscount;
            lhsMultiRegistrationDiscount = this.getMultiRegistrationDiscount();
            BigDecimal rhsMultiRegistrationDiscount;
            rhsMultiRegistrationDiscount = that.getMultiRegistrationDiscount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiRegistrationDiscount", lhsMultiRegistrationDiscount), LocatorUtils.property(thatLocator, "multiRegistrationDiscount", rhsMultiRegistrationDiscount), lhsMultiRegistrationDiscount, rhsMultiRegistrationDiscount)) {
                return false;
            }
        }
        {
            Date lhsMultiRegistrationDeadline;
            lhsMultiRegistrationDeadline = this.getMultiRegistrationDeadline();
            Date rhsMultiRegistrationDeadline;
            rhsMultiRegistrationDeadline = that.getMultiRegistrationDeadline();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiRegistrationDeadline", lhsMultiRegistrationDeadline), LocatorUtils.property(thatLocator, "multiRegistrationDeadline", rhsMultiRegistrationDeadline), lhsMultiRegistrationDeadline, rhsMultiRegistrationDeadline)) {
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
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
            BigDecimal theMultiRegistrationDiscount;
            theMultiRegistrationDiscount = this.getMultiRegistrationDiscount();
            strategy.appendField(locator, this, "multiRegistrationDiscount", buffer, theMultiRegistrationDiscount);
        }
        {
            Date theMultiRegistrationDeadline;
            theMultiRegistrationDeadline = this.getMultiRegistrationDeadline();
            strategy.appendField(locator, this, "multiRegistrationDeadline", buffer, theMultiRegistrationDeadline);
        }
        return buffer;
    }

}
