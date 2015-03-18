
package integration.mindbody;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for MBResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MBResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://clients.mindbodyonline.com/api/0_5}StatusCode"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLDetail" type="{http://clients.mindbodyonline.com/api/0_5}XMLDetailLevel"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentPageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MBResult", propOrder = {
    "status",
    "errorCode",
    "message",
    "xmlDetail",
    "resultCount",
    "currentPageIndex",
    "totalPageCount"
})
@XmlSeeAlso({
    AddClientsToEnrollmentsResult.class,
    GetWaitlistEntriesResult.class,
    GetEnrollmentsResult.class,
    GetSemestersResult.class,
    AddClientsToClassesResult.class,
    UpdateClientVisitsResult.class,
    GetClassDescriptionsResult.class,
    RemoveFromWaitlistResult.class,
    GetClassVisitsResult.class,
    RemoveClientsFromClassesResult.class,
    GetCoursesResult.class,
    GetClassSchedulesResult.class,
    GetClassesResult.class
})
@Entity(name = "MBResult")
@Table(name = "MBRESULT")
@Inheritance(strategy = InheritanceType.JOINED)
public class MBResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", required = true)
    protected StatusCode status;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "XMLDetail", required = true)
    protected XMLDetailLevel xmlDetail;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "CurrentPageIndex")
    protected int currentPageIndex;
    @XmlElement(name = "TotalPageCount")
    protected int totalPageCount;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    @Basic
    @Column(name = "STATUS", length = 255)
    @Enumerated(EnumType.STRING)
    public StatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatus(StatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    @Basic
    @Column(name = "ERRORCODE", precision = 10, scale = 0)
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MESSAGE", length = 255)
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * Gets the value of the resultCount property.
     * 
     */
    @Basic
    @Column(name = "RESULTCOUNT", precision = 10, scale = 0)
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the currentPageIndex property.
     * 
     */
    @Basic
    @Column(name = "CURRENTPAGEINDEX", precision = 10, scale = 0)
    public int getCurrentPageIndex() {
        return currentPageIndex;
    }

    /**
     * Sets the value of the currentPageIndex property.
     * 
     */
    public void setCurrentPageIndex(int value) {
        this.currentPageIndex = value;
    }

    /**
     * Gets the value of the totalPageCount property.
     * 
     */
    @Basic
    @Column(name = "TOTALPAGECOUNT", precision = 10, scale = 0)
    public int getTotalPageCount() {
        return totalPageCount;
    }

    /**
     * Sets the value of the totalPageCount property.
     * 
     */
    public void setTotalPageCount(int value) {
        this.totalPageCount = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            StatusCode theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            int theErrorCode;
            theErrorCode = this.getErrorCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorCode", theErrorCode), currentHashCode, theErrorCode);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        {
            XMLDetailLevel theXMLDetail;
            theXMLDetail = this.getXMLDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xmlDetail", theXMLDetail), currentHashCode, theXMLDetail);
        }
        {
            int theResultCount;
            theResultCount = this.getResultCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultCount", theResultCount), currentHashCode, theResultCount);
        }
        {
            int theCurrentPageIndex;
            theCurrentPageIndex = this.getCurrentPageIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentPageIndex", theCurrentPageIndex), currentHashCode, theCurrentPageIndex);
        }
        {
            int theTotalPageCount;
            theTotalPageCount = this.getTotalPageCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalPageCount", theTotalPageCount), currentHashCode, theTotalPageCount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MBResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MBResult that = ((MBResult) object);
        {
            StatusCode lhsStatus;
            lhsStatus = this.getStatus();
            StatusCode rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            int lhsErrorCode;
            lhsErrorCode = this.getErrorCode();
            int rhsErrorCode;
            rhsErrorCode = that.getErrorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorCode", lhsErrorCode), LocatorUtils.property(thatLocator, "errorCode", rhsErrorCode), lhsErrorCode, rhsErrorCode)) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
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
            int lhsResultCount;
            lhsResultCount = this.getResultCount();
            int rhsResultCount;
            rhsResultCount = that.getResultCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultCount", lhsResultCount), LocatorUtils.property(thatLocator, "resultCount", rhsResultCount), lhsResultCount, rhsResultCount)) {
                return false;
            }
        }
        {
            int lhsCurrentPageIndex;
            lhsCurrentPageIndex = this.getCurrentPageIndex();
            int rhsCurrentPageIndex;
            rhsCurrentPageIndex = that.getCurrentPageIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentPageIndex", lhsCurrentPageIndex), LocatorUtils.property(thatLocator, "currentPageIndex", rhsCurrentPageIndex), lhsCurrentPageIndex, rhsCurrentPageIndex)) {
                return false;
            }
        }
        {
            int lhsTotalPageCount;
            lhsTotalPageCount = this.getTotalPageCount();
            int rhsTotalPageCount;
            rhsTotalPageCount = that.getTotalPageCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalPageCount", lhsTotalPageCount), LocatorUtils.property(thatLocator, "totalPageCount", rhsTotalPageCount), lhsTotalPageCount, rhsTotalPageCount)) {
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
            StatusCode theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            int theErrorCode;
            theErrorCode = this.getErrorCode();
            strategy.appendField(locator, this, "errorCode", buffer, theErrorCode);
        }
        {
            String theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            XMLDetailLevel theXMLDetail;
            theXMLDetail = this.getXMLDetail();
            strategy.appendField(locator, this, "xmlDetail", buffer, theXMLDetail);
        }
        {
            int theResultCount;
            theResultCount = this.getResultCount();
            strategy.appendField(locator, this, "resultCount", buffer, theResultCount);
        }
        {
            int theCurrentPageIndex;
            theCurrentPageIndex = this.getCurrentPageIndex();
            strategy.appendField(locator, this, "currentPageIndex", buffer, theCurrentPageIndex);
        }
        {
            int theTotalPageCount;
            theTotalPageCount = this.getTotalPageCount();
            strategy.appendField(locator, this, "totalPageCount", buffer, theTotalPageCount);
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
