
package integration.mindbody;

import java.io.Serializable;
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
 * <p>Java class for UploadClientDocumentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadClientDocumentResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5}MBResult">
 *       &lt;sequence>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadClientDocumentResult", propOrder = {
    "fileSize",
    "fileName"
})
public class UploadClientDocumentResult
    extends MBResult
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FileSize")
    protected long fileSize;
    @XmlElement(name = "FileName")
    protected String fileName;

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            long theFileSize;
            theFileSize = this.getFileSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSize", theFileSize), currentHashCode, theFileSize);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileName", theFileName), currentHashCode, theFileName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UploadClientDocumentResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UploadClientDocumentResult that = ((UploadClientDocumentResult) object);
        {
            long lhsFileSize;
            lhsFileSize = this.getFileSize();
            long rhsFileSize;
            rhsFileSize = that.getFileSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileSize", lhsFileSize), LocatorUtils.property(thatLocator, "fileSize", rhsFileSize), lhsFileSize, rhsFileSize)) {
                return false;
            }
        }
        {
            String lhsFileName;
            lhsFileName = this.getFileName();
            String rhsFileName;
            rhsFileName = that.getFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileName", lhsFileName), LocatorUtils.property(thatLocator, "fileName", rhsFileName), lhsFileName, rhsFileName)) {
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
            long theFileSize;
            theFileSize = this.getFileSize();
            strategy.appendField(locator, this, "fileSize", buffer, theFileSize);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName);
        }
        return buffer;
    }

}
