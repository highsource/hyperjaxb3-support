
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RelationshipName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "id",
    "relationshipName1",
    "relationshipName2"
})
@Entity(name = "Relationship")
@Table(name = "RELATIONSHIP")
@Inheritance(strategy = InheritanceType.JOINED)
public class Relationship
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "RelationshipName1")
    protected String relationshipName1;
    @XmlElement(name = "RelationshipName2")
    protected String relationshipName2;

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
     * Gets the value of the relationshipName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELATIONSHIPNAME1", length = 255)
    public String getRelationshipName1() {
        return relationshipName1;
    }

    /**
     * Sets the value of the relationshipName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName1(String value) {
        this.relationshipName1 = value;
    }

    /**
     * Gets the value of the relationshipName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELATIONSHIPNAME2", length = 255)
    public String getRelationshipName2() {
        return relationshipName2;
    }

    /**
     * Sets the value of the relationshipName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName2(String value) {
        this.relationshipName2 = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theRelationshipName1;
            theRelationshipName1 = this.getRelationshipName1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipName1", theRelationshipName1), currentHashCode, theRelationshipName1);
        }
        {
            String theRelationshipName2;
            theRelationshipName2 = this.getRelationshipName2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipName2", theRelationshipName2), currentHashCode, theRelationshipName2);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Relationship)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Relationship that = ((Relationship) object);
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
            String lhsRelationshipName1;
            lhsRelationshipName1 = this.getRelationshipName1();
            String rhsRelationshipName1;
            rhsRelationshipName1 = that.getRelationshipName1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipName1", lhsRelationshipName1), LocatorUtils.property(thatLocator, "relationshipName1", rhsRelationshipName1), lhsRelationshipName1, rhsRelationshipName1)) {
                return false;
            }
        }
        {
            String lhsRelationshipName2;
            lhsRelationshipName2 = this.getRelationshipName2();
            String rhsRelationshipName2;
            rhsRelationshipName2 = that.getRelationshipName2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipName2", lhsRelationshipName2), LocatorUtils.property(thatLocator, "relationshipName2", rhsRelationshipName2), lhsRelationshipName2, rhsRelationshipName2)) {
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
            String theRelationshipName1;
            theRelationshipName1 = this.getRelationshipName1();
            strategy.appendField(locator, this, "relationshipName1", buffer, theRelationshipName1);
        }
        {
            String theRelationshipName2;
            theRelationshipName2 = this.getRelationshipName2();
            strategy.appendField(locator, this, "relationshipName2", buffer, theRelationshipName2);
        }
        return buffer;
    }

}
