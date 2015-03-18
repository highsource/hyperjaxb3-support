
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
 * <p>Java class for ClientRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBObject">
 *       &lt;sequence>
 *         &lt;element name="RelatedClient" type="{http://clients.mindbodyonline.com/api/0_5}Client" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{http://clients.mindbodyonline.com/api/0_5}Relationship" minOccurs="0"/>
 *         &lt;element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientRelationship", propOrder = {
    "relatedClient",
    "relationship",
    "relationshipName"
})
@Entity(name = "ClientRelationship")
@Table(name = "CLIENTRELATIONSHIP")
public class ClientRelationship
    extends MBObject
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedClient")
    protected Client relatedClient;
    @XmlElement(name = "Relationship")
    protected Relationship relationship;
    @XmlElement(name = "RelationshipName")
    protected String relationshipName;

    /**
     * Gets the value of the relatedClient property.
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
        @JoinColumn(name = "RELATEDCLIENT_CLIENTRELATION_0"),
        @JoinColumn(name = "RELATEDCLIENT_CLIENTRELATION_1")
    })
    public Client getRelatedClient() {
        return relatedClient;
    }

    /**
     * Sets the value of the relatedClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setRelatedClient(Client value) {
        this.relatedClient = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    @ManyToOne(targetEntity = Relationship.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATIONSHIP_CLIENTRELATIONS_0")
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelationship(Relationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELATIONSHIPNAME", length = 255)
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Client theRelatedClient;
            theRelatedClient = this.getRelatedClient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relatedClient", theRelatedClient), currentHashCode, theRelatedClient);
        }
        {
            Relationship theRelationship;
            theRelationship = this.getRelationship();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationship", theRelationship), currentHashCode, theRelationship);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipName", theRelationshipName), currentHashCode, theRelationshipName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ClientRelationship)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ClientRelationship that = ((ClientRelationship) object);
        {
            Client lhsRelatedClient;
            lhsRelatedClient = this.getRelatedClient();
            Client rhsRelatedClient;
            rhsRelatedClient = that.getRelatedClient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relatedClient", lhsRelatedClient), LocatorUtils.property(thatLocator, "relatedClient", rhsRelatedClient), lhsRelatedClient, rhsRelatedClient)) {
                return false;
            }
        }
        {
            Relationship lhsRelationship;
            lhsRelationship = this.getRelationship();
            Relationship rhsRelationship;
            rhsRelationship = that.getRelationship();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationship", lhsRelationship), LocatorUtils.property(thatLocator, "relationship", rhsRelationship), lhsRelationship, rhsRelationship)) {
                return false;
            }
        }
        {
            String lhsRelationshipName;
            lhsRelationshipName = this.getRelationshipName();
            String rhsRelationshipName;
            rhsRelationshipName = that.getRelationshipName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipName", lhsRelationshipName), LocatorUtils.property(thatLocator, "relationshipName", rhsRelationshipName), lhsRelationshipName, rhsRelationshipName)) {
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
            Client theRelatedClient;
            theRelatedClient = this.getRelatedClient();
            strategy.appendField(locator, this, "relatedClient", buffer, theRelatedClient);
        }
        {
            Relationship theRelationship;
            theRelationship = this.getRelationship();
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        {
            String theRelationshipName;
            theRelationshipName = this.getRelationshipName();
            strategy.appendField(locator, this, "relationshipName", buffer, theRelationshipName);
        }
        return buffer;
    }

}
