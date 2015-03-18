
package integration.mindbody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ArrayOfClassDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClassDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassDescription" type="{http://clients.mindbodyonline.com/api/0_5}ClassDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClassDescription", propOrder = {
    "classDescription"
})
@Entity(name = "ArrayOfClassDescription")
@Table(name = "ARRAYOFCLASSDESCRIPTION")
@Inheritance(strategy = InheritanceType.JOINED)
public class ArrayOfClassDescription
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClassDescription", nillable = true)
    protected List<ClassDescription> classDescription;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the classDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDescription }
     * 
     * 
     */
    @OneToMany(targetEntity = ClassDescription.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLASSDESCRIPTION_ARRAYOFCLAS_0")
    public List<ClassDescription> getClassDescription() {
        if (classDescription == null) {
            classDescription = new ArrayList<ClassDescription>();
        }
        return this.classDescription;
    }

    /**
     * 
     * 
     */
    public void setClassDescription(List<ClassDescription> classDescription) {
        this.classDescription = classDescription;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<ClassDescription> theClassDescription;
            theClassDescription = (((this.classDescription!= null)&&(!this.classDescription.isEmpty()))?this.getClassDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classDescription", theClassDescription), currentHashCode, theClassDescription);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfClassDescription)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfClassDescription that = ((ArrayOfClassDescription) object);
        {
            List<ClassDescription> lhsClassDescription;
            lhsClassDescription = (((this.classDescription!= null)&&(!this.classDescription.isEmpty()))?this.getClassDescription():null);
            List<ClassDescription> rhsClassDescription;
            rhsClassDescription = (((that.classDescription!= null)&&(!that.classDescription.isEmpty()))?that.getClassDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classDescription", lhsClassDescription), LocatorUtils.property(thatLocator, "classDescription", rhsClassDescription), lhsClassDescription, rhsClassDescription)) {
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
            List<ClassDescription> theClassDescription;
            theClassDescription = (((this.classDescription!= null)&&(!this.classDescription.isEmpty()))?this.getClassDescription():null);
            strategy.appendField(locator, this, "classDescription", buffer, theClassDescription);
        }
        return buffer;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
