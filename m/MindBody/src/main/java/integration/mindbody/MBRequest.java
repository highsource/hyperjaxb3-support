
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for MBRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MBRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceCredentials" type="{http://clients.mindbodyonline.com/api/0_5}SourceCredentials" minOccurs="0"/>
 *         &lt;element name="UserCredentials" type="{http://clients.mindbodyonline.com/api/0_5}UserCredentials" minOccurs="0"/>
 *         &lt;element name="XMLDetail" type="{http://clients.mindbodyonline.com/api/0_5}XMLDetailLevel"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentPageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fields" type="{http://clients.mindbodyonline.com/api/0_5}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MBRequest", propOrder = {
    "sourceCredentials",
    "userCredentials",
    "xmlDetail",
    "pageSize",
    "currentPageIndex",
    "fields"
})
@XmlSeeAlso({
    GetClassVisitsRequest.class,
    AddClientsToClassesRequest.class,
    GetWaitlistEntriesRequest.class,
    RemoveClientsFromClassesRequest.class,
    UpdateClientVisitsRequest.class,
    GetEnrollmentsRequest.class,
    GetClassesRequest.class,
    GetCoursesRequest.class,
    GetSemestersRequest.class,
    GetClassDescriptionsRequest.class,
    RemoveFromWaitlistRequest.class,
    GetClassSchedulesRequest.class,
    AddClientsToEnrollmentsRequest.class
})
@Entity(name = "MBRequest")
@Table(name = "MBREQUEST")
@Inheritance(strategy = InheritanceType.JOINED)
public class MBRequest
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SourceCredentials")
    protected SourceCredentials sourceCredentials;
    @XmlElement(name = "UserCredentials")
    protected UserCredentials userCredentials;
    @XmlElement(name = "XMLDetail", required = true, nillable = true)
    protected XMLDetailLevel xmlDetail;
    @XmlElement(name = "PageSize", required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;
    @XmlElement(name = "CurrentPageIndex", required = true, type = Integer.class, nillable = true)
    protected Integer currentPageIndex;
    @XmlElement(name = "Fields")
    protected ArrayOfString fields;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sourceCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCredentials }
     *     
     */
    @ManyToOne(targetEntity = SourceCredentials.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCECREDENTIALS_MBREQUEST__0")
    public SourceCredentials getSourceCredentials() {
        return sourceCredentials;
    }

    /**
     * Sets the value of the sourceCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCredentials }
     *     
     */
    public void setSourceCredentials(SourceCredentials value) {
        this.sourceCredentials = value;
    }

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UserCredentials }
     *     
     */
    @ManyToOne(targetEntity = UserCredentials.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "USERCREDENTIALS_MBREQUEST_HJ_0")
    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCredentials }
     *     
     */
    public void setUserCredentials(UserCredentials value) {
        this.userCredentials = value;
    }

    /**
     * Gets the value of the xmlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link XMLDetailLevel }
     *     
     */
    @Basic
    @Column(name = "XMLDETAIL", length = 255)
    @Enumerated(EnumType.STRING)
    public XMLDetailLevel getXMLDetail() {
        return xmlDetail;
    }

    /**
     * Sets the value of the xmlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDetailLevel }
     *     
     */
    public void setXMLDetail(XMLDetailLevel value) {
        this.xmlDetail = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "PAGESIZE", precision = 10, scale = 0)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the currentPageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "CURRENTPAGEINDEX", precision = 10, scale = 0)
    public Integer getCurrentPageIndex() {
        return currentPageIndex;
    }

    /**
     * Sets the value of the currentPageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPageIndex(Integer value) {
        this.currentPageIndex = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    @ManyToOne(targetEntity = ArrayOfString.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FIELDS_MBREQUEST_HJID")
    public ArrayOfString getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFields(ArrayOfString value) {
        this.fields = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SourceCredentials theSourceCredentials;
            theSourceCredentials = this.getSourceCredentials();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCredentials", theSourceCredentials), currentHashCode, theSourceCredentials);
        }
        {
            UserCredentials theUserCredentials;
            theUserCredentials = this.getUserCredentials();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userCredentials", theUserCredentials), currentHashCode, theUserCredentials);
        }
        {
            XMLDetailLevel theXMLDetail;
            theXMLDetail = this.getXMLDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xmlDetail", theXMLDetail), currentHashCode, theXMLDetail);
        }
        {
            Integer thePageSize;
            thePageSize = this.getPageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pageSize", thePageSize), currentHashCode, thePageSize);
        }
        {
            Integer theCurrentPageIndex;
            theCurrentPageIndex = this.getCurrentPageIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentPageIndex", theCurrentPageIndex), currentHashCode, theCurrentPageIndex);
        }
        {
            ArrayOfString theFields;
            theFields = this.getFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MBRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MBRequest that = ((MBRequest) object);
        {
            SourceCredentials lhsSourceCredentials;
            lhsSourceCredentials = this.getSourceCredentials();
            SourceCredentials rhsSourceCredentials;
            rhsSourceCredentials = that.getSourceCredentials();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCredentials", lhsSourceCredentials), LocatorUtils.property(thatLocator, "sourceCredentials", rhsSourceCredentials), lhsSourceCredentials, rhsSourceCredentials)) {
                return false;
            }
        }
        {
            UserCredentials lhsUserCredentials;
            lhsUserCredentials = this.getUserCredentials();
            UserCredentials rhsUserCredentials;
            rhsUserCredentials = that.getUserCredentials();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userCredentials", lhsUserCredentials), LocatorUtils.property(thatLocator, "userCredentials", rhsUserCredentials), lhsUserCredentials, rhsUserCredentials)) {
                return false;
            }
        }
        {
            XMLDetailLevel lhsXMLDetail;
            lhsXMLDetail = this.getXMLDetail();
            XMLDetailLevel rhsXMLDetail;
            rhsXMLDetail = that.getXMLDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xmlDetail", lhsXMLDetail), LocatorUtils.property(thatLocator, "xmlDetail", rhsXMLDetail), lhsXMLDetail, rhsXMLDetail)) {
                return false;
            }
        }
        {
            Integer lhsPageSize;
            lhsPageSize = this.getPageSize();
            Integer rhsPageSize;
            rhsPageSize = that.getPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageSize", lhsPageSize), LocatorUtils.property(thatLocator, "pageSize", rhsPageSize), lhsPageSize, rhsPageSize)) {
                return false;
            }
        }
        {
            Integer lhsCurrentPageIndex;
            lhsCurrentPageIndex = this.getCurrentPageIndex();
            Integer rhsCurrentPageIndex;
            rhsCurrentPageIndex = that.getCurrentPageIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentPageIndex", lhsCurrentPageIndex), LocatorUtils.property(thatLocator, "currentPageIndex", rhsCurrentPageIndex), lhsCurrentPageIndex, rhsCurrentPageIndex)) {
                return false;
            }
        }
        {
            ArrayOfString lhsFields;
            lhsFields = this.getFields();
            ArrayOfString rhsFields;
            rhsFields = that.getFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
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
            SourceCredentials theSourceCredentials;
            theSourceCredentials = this.getSourceCredentials();
            strategy.appendField(locator, this, "sourceCredentials", buffer, theSourceCredentials);
        }
        {
            UserCredentials theUserCredentials;
            theUserCredentials = this.getUserCredentials();
            strategy.appendField(locator, this, "userCredentials", buffer, theUserCredentials);
        }
        {
            XMLDetailLevel theXMLDetail;
            theXMLDetail = this.getXMLDetail();
            strategy.appendField(locator, this, "xmlDetail", buffer, theXMLDetail);
        }
        {
            Integer thePageSize;
            thePageSize = this.getPageSize();
            strategy.appendField(locator, this, "pageSize", buffer, thePageSize);
        }
        {
            Integer theCurrentPageIndex;
            theCurrentPageIndex = this.getCurrentPageIndex();
            strategy.appendField(locator, this, "currentPageIndex", buffer, theCurrentPageIndex);
        }
        {
            ArrayOfString theFields;
            theFields = this.getFields();
            strategy.appendField(locator, this, "fields", buffer, theFields);
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
