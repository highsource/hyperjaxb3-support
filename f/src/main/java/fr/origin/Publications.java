//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 09:49:06 AM CET 
//


package fr.origin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatePublication" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PublicationDetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IdRegistre" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                   &lt;element name="Nature"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Personne physique"/&gt;
 *                         &lt;enumeration value="Personne morale"/&gt;
 *                         &lt;enumeration value="Navire"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RegistreDetail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TypeChamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Valeur" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Lieu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;element name="Adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Motifs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="FondementJuridique" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                         &lt;element name="FondementJuridiqueLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ReferenceUe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="ReferenceOnu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Cryptomonnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Identification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Sexe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Jour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;element name="Mois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                         &lt;element name="Annee" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="NumeroCarte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="NumeroPasseport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="SiteInternet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Courriel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datePublication",
    "publicationDetail"
})
@XmlRootElement(name = "Publications")
@Entity(name = "Publications")
@Table(name = "PUBLICATIONS", schema = "france")
@Inheritance(strategy = InheritanceType.JOINED)
public class Publications
    implements Equals, HashCode
{

    @XmlElement(name = "DatePublication", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePublication;
    @XmlElement(name = "PublicationDetail", required = true)
    protected List<Publications.PublicationDetail> publicationDetail;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété datePublication.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getDatePublication() {
        return datePublication;
    }

    /**
     * Définit la valeur de la propriété datePublication.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePublication(XMLGregorianCalendar value) {
        this.datePublication = value;
    }

    /**
     * Gets the value of the publicationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publications.PublicationDetail }
     * 
     * 
     */
    @OneToMany(targetEntity = Publications.PublicationDetail.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PUBLICATION_DETAIL_PUBLICATI_0")
    public List<Publications.PublicationDetail> getPublicationDetail() {
        if (publicationDetail == null) {
            publicationDetail = new ArrayList<Publications.PublicationDetail>();
        }
        return this.publicationDetail;
    }

    /**
     * 
     * 
     */
    public void setPublicationDetail(List<Publications.PublicationDetail> publicationDetail) {
        this.publicationDetail = publicationDetail;
    }

    /**
     * Obtient la valeur de la propriété hjid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "FRANCE_ID")
    @GeneratedValue(generator = "id-sequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "id-sequence", sequenceName = "id_sequence", schema = "france")
    public Long getHjid() {
        return hjid;
    }

    /**
     * Définit la valeur de la propriété hjid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Basic
    @Column(name = "DATE_PUBLICATION_ITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDatePublicationItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getDatePublication());
    }

    public void setDatePublicationItem(Date target) {
        setDatePublication(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Publications that = ((Publications) object);
        {
            XMLGregorianCalendar lhsDatePublication;
            lhsDatePublication = this.getDatePublication();
            XMLGregorianCalendar rhsDatePublication;
            rhsDatePublication = that.getDatePublication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePublication", lhsDatePublication), LocatorUtils.property(thatLocator, "datePublication", rhsDatePublication), lhsDatePublication, rhsDatePublication)) {
                return false;
            }
        }
        {
            List<Publications.PublicationDetail> lhsPublicationDetail;
            lhsPublicationDetail = (((this.publicationDetail!= null)&&(!this.publicationDetail.isEmpty()))?this.getPublicationDetail():null);
            List<Publications.PublicationDetail> rhsPublicationDetail;
            rhsPublicationDetail = (((that.publicationDetail!= null)&&(!that.publicationDetail.isEmpty()))?that.getPublicationDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicationDetail", lhsPublicationDetail), LocatorUtils.property(thatLocator, "publicationDetail", rhsPublicationDetail), lhsPublicationDetail, rhsPublicationDetail)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            XMLGregorianCalendar theDatePublication;
            theDatePublication = this.getDatePublication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePublication", theDatePublication), currentHashCode, theDatePublication);
        }
        {
            List<Publications.PublicationDetail> thePublicationDetail;
            thePublicationDetail = (((this.publicationDetail!= null)&&(!this.publicationDetail.isEmpty()))?this.getPublicationDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicationDetail", thePublicationDetail), currentHashCode, thePublicationDetail);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IdRegistre" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *         &lt;element name="Nature"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Personne physique"/&gt;
     *               &lt;enumeration value="Personne morale"/&gt;
     *               &lt;enumeration value="Navire"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RegistreDetail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TypeChamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Valeur" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Lieu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;element name="Adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Motifs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="FondementJuridique" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                               &lt;element name="FondementJuridiqueLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="ReferenceUe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="ReferenceOnu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Cryptomonnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Identification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Sexe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Jour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;element name="Mois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                               &lt;element name="Annee" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="NumeroCarte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="NumeroPasseport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="SiteInternet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Courriel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idRegistre",
        "nature",
        "nom",
        "registreDetail"
    })
    @Entity(name = "Publications$PublicationDetail")
    @Table(name = "PUBLICATION_DETAIL", schema = "france")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class PublicationDetail
        implements Equals, HashCode
    {

        @XmlElement(name = "IdRegistre")
        @XmlSchemaType(name = "unsignedShort")
        protected int idRegistre;
        @XmlElement(name = "Nature", required = true)
        protected String nature;
        @XmlElement(name = "Nom", required = true)
        protected String nom;
        @XmlElement(name = "RegistreDetail", required = true)
        protected List<Publications.PublicationDetail.RegistreDetail> registreDetail;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Obtient la valeur de la propriété idRegistre.
         * 
         */
        @Basic
        @Column(name = "ID_REGISTRE", precision = 5, scale = 0)
        public int getIdRegistre() {
            return idRegistre;
        }

        /**
         * Définit la valeur de la propriété idRegistre.
         * 
         */
        public void setIdRegistre(int value) {
            this.idRegistre = value;
        }

        /**
         * Obtient la valeur de la propriété nature.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "NATURE")
        public String getNature() {
            return nature;
        }

        /**
         * Définit la valeur de la propriété nature.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNature(String value) {
            this.nature = value;
        }

        /**
         * Obtient la valeur de la propriété nom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "NOM", length = 255)
        public String getNom() {
            return nom;
        }

        /**
         * Définit la valeur de la propriété nom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Gets the value of the registreDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registreDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegistreDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Publications.PublicationDetail.RegistreDetail }
         * 
         * 
         */
        @OneToMany(targetEntity = fr.origin.Publications.PublicationDetail.RegistreDetail.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "REGISTRE_DETAIL_PUBLICATION__0")
        public List<Publications.PublicationDetail.RegistreDetail> getRegistreDetail() {
            if (registreDetail == null) {
                registreDetail = new ArrayList<Publications.PublicationDetail.RegistreDetail>();
            }
            return this.registreDetail;
        }

        /**
         * 
         * 
         */
        public void setRegistreDetail(List<Publications.PublicationDetail.RegistreDetail> registreDetail) {
            this.registreDetail = registreDetail;
        }

        /**
         * Obtient la valeur de la propriété hjid.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "FRANCE_ID")
        @GeneratedValue(generator = "id-sequence", strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name = "id-sequence", sequenceName = "id_sequence", schema = "france")
        public Long getHjid() {
            return hjid;
        }

        /**
         * Définit la valeur de la propriété hjid.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Publications.PublicationDetail that = ((Publications.PublicationDetail) object);
            {
                int lhsIdRegistre;
                lhsIdRegistre = this.getIdRegistre();
                int rhsIdRegistre;
                rhsIdRegistre = that.getIdRegistre();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "idRegistre", lhsIdRegistre), LocatorUtils.property(thatLocator, "idRegistre", rhsIdRegistre), lhsIdRegistre, rhsIdRegistre)) {
                    return false;
                }
            }
            {
                String lhsNature;
                lhsNature = this.getNature();
                String rhsNature;
                rhsNature = that.getNature();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "nature", lhsNature), LocatorUtils.property(thatLocator, "nature", rhsNature), lhsNature, rhsNature)) {
                    return false;
                }
            }
            {
                String lhsNom;
                lhsNom = this.getNom();
                String rhsNom;
                rhsNom = that.getNom();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "nom", lhsNom), LocatorUtils.property(thatLocator, "nom", rhsNom), lhsNom, rhsNom)) {
                    return false;
                }
            }
            {
                List<Publications.PublicationDetail.RegistreDetail> lhsRegistreDetail;
                lhsRegistreDetail = (((this.registreDetail!= null)&&(!this.registreDetail.isEmpty()))?this.getRegistreDetail():null);
                List<Publications.PublicationDetail.RegistreDetail> rhsRegistreDetail;
                rhsRegistreDetail = (((that.registreDetail!= null)&&(!that.registreDetail.isEmpty()))?that.getRegistreDetail():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "registreDetail", lhsRegistreDetail), LocatorUtils.property(thatLocator, "registreDetail", rhsRegistreDetail), lhsRegistreDetail, rhsRegistreDetail)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                int theIdRegistre;
                theIdRegistre = this.getIdRegistre();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idRegistre", theIdRegistre), currentHashCode, theIdRegistre);
            }
            {
                String theNature;
                theNature = this.getNature();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nature", theNature), currentHashCode, theNature);
            }
            {
                String theNom;
                theNom = this.getNom();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nom", theNom), currentHashCode, theNom);
            }
            {
                List<Publications.PublicationDetail.RegistreDetail> theRegistreDetail;
                theRegistreDetail = (((this.registreDetail!= null)&&(!this.registreDetail.isEmpty()))?this.getRegistreDetail():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registreDetail", theRegistreDetail), currentHashCode, theRegistreDetail);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TypeChamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Valeur" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Lieu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;element name="Adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Motifs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="FondementJuridique" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                     &lt;element name="FondementJuridiqueLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="ReferenceUe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="ReferenceOnu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Cryptomonnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Identification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Sexe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Jour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;element name="Mois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                     &lt;element name="Annee" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="NumeroCarte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="NumeroPasseport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="SiteInternet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Courriel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "typeChamp",
            "valeur"
        })
        @Entity(name = "Publications$PublicationDetail$RegistreDetail")
        @Table(name = "REGISTRE_DETAIL", schema = "france")
        @Inheritance(strategy = InheritanceType.JOINED)
        public static class RegistreDetail
            implements Equals, HashCode
        {

            @XmlElement(name = "TypeChamp", required = true)
            protected String typeChamp;
            @XmlElement(name = "Valeur", required = true)
            protected List<Publications.PublicationDetail.RegistreDetail.Valeur> valeur;
            @XmlAttribute(name = "Hjid")
            protected Long hjid;

            /**
             * Obtient la valeur de la propriété typeChamp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Basic
            @Column(name = "TYPE_CHAMP", length = 255)
            public String getTypeChamp() {
                return typeChamp;
            }

            /**
             * Définit la valeur de la propriété typeChamp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeChamp(String value) {
                this.typeChamp = value;
            }

            /**
             * Gets the value of the valeur property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the valeur property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValeur().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Publications.PublicationDetail.RegistreDetail.Valeur }
             * 
             * 
             */
            @OneToMany(targetEntity = fr.origin.Publications.PublicationDetail.RegistreDetail.Valeur.class, cascade = {
                CascadeType.ALL
            })
            @JoinColumn(name = "VALEUR_REGISTRE_DETAIL_HJID")
            public List<Publications.PublicationDetail.RegistreDetail.Valeur> getValeur() {
                if (valeur == null) {
                    valeur = new ArrayList<Publications.PublicationDetail.RegistreDetail.Valeur>();
                }
                return this.valeur;
            }

            /**
             * 
             * 
             */
            public void setValeur(List<Publications.PublicationDetail.RegistreDetail.Valeur> valeur) {
                this.valeur = valeur;
            }

            /**
             * Obtient la valeur de la propriété hjid.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            @Id
            @Column(name = "FRANCE_ID")
            @GeneratedValue(generator = "id-sequence", strategy = GenerationType.SEQUENCE)
            @SequenceGenerator(name = "id-sequence", sequenceName = "id_sequence", schema = "france")
            public Long getHjid() {
                return hjid;
            }

            /**
             * Définit la valeur de la propriété hjid.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHjid(Long value) {
                this.hjid = value;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Publications.PublicationDetail.RegistreDetail that = ((Publications.PublicationDetail.RegistreDetail) object);
                {
                    String lhsTypeChamp;
                    lhsTypeChamp = this.getTypeChamp();
                    String rhsTypeChamp;
                    rhsTypeChamp = that.getTypeChamp();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "typeChamp", lhsTypeChamp), LocatorUtils.property(thatLocator, "typeChamp", rhsTypeChamp), lhsTypeChamp, rhsTypeChamp)) {
                        return false;
                    }
                }
                {
                    List<Publications.PublicationDetail.RegistreDetail.Valeur> lhsValeur;
                    lhsValeur = (((this.valeur!= null)&&(!this.valeur.isEmpty()))?this.getValeur():null);
                    List<Publications.PublicationDetail.RegistreDetail.Valeur> rhsValeur;
                    rhsValeur = (((that.valeur!= null)&&(!that.valeur.isEmpty()))?that.getValeur():null);
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "valeur", lhsValeur), LocatorUtils.property(thatLocator, "valeur", rhsValeur), lhsValeur, rhsValeur)) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
                int currentHashCode = 1;
                {
                    String theTypeChamp;
                    theTypeChamp = this.getTypeChamp();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeChamp", theTypeChamp), currentHashCode, theTypeChamp);
                }
                {
                    List<Publications.PublicationDetail.RegistreDetail.Valeur> theValeur;
                    theValeur = (((this.valeur!= null)&&(!this.valeur.isEmpty()))?this.getValeur():null);
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valeur", theValeur), currentHashCode, theValeur);
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;choice&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Lieu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *           &lt;element name="Adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *           &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Motifs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="FondementJuridique" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *           &lt;element name="FondementJuridiqueLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="ReferenceUe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="ReferenceOnu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Cryptomonnaie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Identification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Sexe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Jour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *           &lt;element name="Mois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *           &lt;element name="Annee" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="NumeroCarte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="NumeroPasseport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *           &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="SiteInternet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="Courriel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *         &lt;sequence&gt;
             *           &lt;element name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;/sequence&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            @Entity(name = "Publications$PublicationDetail$RegistreDetail$Valeur")
            @Table(name = "VALEUR", schema = "france")
            @Inheritance(strategy = InheritanceType.JOINED)
            public static class Valeur
                implements Equals, HashCode
            {

                @XmlElementRefs({
                    @XmlElementRef(name = "Alias", type = JAXBElement.class),
                    @XmlElementRef(name = "Adresse", type = JAXBElement.class),
                    @XmlElementRef(name = "Prenom", type = JAXBElement.class),
                    @XmlElementRef(name = "Titre", type = JAXBElement.class),
                    @XmlElementRef(name = "ReferenceOnu", type = JAXBElement.class),
                    @XmlElementRef(name = "NumeroCarte", type = JAXBElement.class),
                    @XmlElementRef(name = "Mois", type = JAXBElement.class),
                    @XmlElementRef(name = "FondementJuridique", type = JAXBElement.class),
                    @XmlElementRef(name = "NumeroPasseport", type = JAXBElement.class),
                    @XmlElementRef(name = "Courriel", type = JAXBElement.class),
                    @XmlElementRef(name = "Lieu", type = JAXBElement.class),
                    @XmlElementRef(name = "Jour", type = JAXBElement.class),
                    @XmlElementRef(name = "Sexe", type = JAXBElement.class),
                    @XmlElementRef(name = "Annee", type = JAXBElement.class),
                    @XmlElementRef(name = "Identification", type = JAXBElement.class),
                    @XmlElementRef(name = "Commentaire", type = JAXBElement.class),
                    @XmlElementRef(name = "Pays", type = JAXBElement.class),
                    @XmlElementRef(name = "Motifs", type = JAXBElement.class),
                    @XmlElementRef(name = "FondementJuridiqueLabel", type = JAXBElement.class),
                    @XmlElementRef(name = "ReferenceUe", type = JAXBElement.class),
                    @XmlElementRef(name = "Cryptomonnaie", type = JAXBElement.class),
                    @XmlElementRef(name = "SiteInternet", type = JAXBElement.class),
                    @XmlElementRef(name = "Telephone", type = JAXBElement.class),
                    @XmlElementRef(name = "NumeroOMI", type = JAXBElement.class)
                })
                protected List<JAXBElement<? extends Comparable>> content;
                @XmlAttribute(name = "Hjid")
                protected Long hjid;
                protected transient List<Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem> contentItems;

                /**
                 * Obtient le reste du modèle de contenu. 
                 * 
                 * <p>
                 * Vous obtenez la propriété "catch-all" pour la raison suivante : 
                 * Le nom de champ "Commentaire" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
                 * ligne 40 sur file:/C:/dev/git/support/hyperjaxb3-support/f/src/main/resources/france/PublicationSchema.xsd
                 * ligne 33 sur file:/C:/dev/git/support/hyperjaxb3-support/f/src/main/resources/france/PublicationSchema.xsd
                 * <p>
                 * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
                 * des deux déclarations suivantes afin de modifier leurs noms : 
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link Integer }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link Integer }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                @Transient
                public List<JAXBElement<? extends Comparable>> getContent() {
                    if (content == null) {
                        content = new ArrayList<JAXBElement<? extends Comparable>>();
                    }
                    return this.content;
                }

                /**
                 * Obtient le reste du modèle de contenu. 
                 * 
                 * <p>
                 * Vous obtenez la propriété "catch-all" pour la raison suivante : 
                 * Le nom de champ "Commentaire" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
                 * ligne 40 sur file:/C:/dev/git/support/hyperjaxb3-support/f/src/main/resources/france/PublicationSchema.xsd
                 * ligne 33 sur file:/C:/dev/git/support/hyperjaxb3-support/f/src/main/resources/france/PublicationSchema.xsd
                 * <p>
                 * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
                 * des deux déclarations suivantes afin de modifier leurs noms : 
                 * 
                 * 
                 */
                public void setContent(List<JAXBElement<? extends Comparable>> content) {
                    this.content = content;
                }

                /**
                 * Obtient la valeur de la propriété hjid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                @Id
                @Column(name = "FRANCE_ID")
                @GeneratedValue(generator = "id-sequence", strategy = GenerationType.SEQUENCE)
                @SequenceGenerator(name = "id-sequence", sequenceName = "id_sequence", schema = "france")
                public Long getHjid() {
                    return hjid;
                }

                /**
                 * Définit la valeur de la propriété hjid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setHjid(Long value) {
                    this.hjid = value;
                }

                @OneToMany(targetEntity = fr.origin.Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem.class, cascade = {
                    CascadeType.ALL
                })
                @JoinColumn(name = "CONTENT_ITEMS_VALEUR_HJID")
                public List<Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem> getContentItems() {
                    if (this.contentItems == null) {
                        this.contentItems = new ArrayList<Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem>();
                    }
                    if (ItemUtils.shouldBeWrapped(this.content)) {
                        this.content = ItemUtils.wrap(this.content, this.contentItems, Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem.class);
                    }
                    return this.contentItems;
                }

                public void setContentItems(List<Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem> value) {
                    this.content = null;
                    this.contentItems = null;
                    this.contentItems = value;
                    if (this.contentItems == null) {
                        this.contentItems = new ArrayList<Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem>();
                    }
                    if (ItemUtils.shouldBeWrapped(this.content)) {
                        this.content = ItemUtils.wrap(this.content, this.contentItems, Publications.PublicationDetail.RegistreDetail.Valeur.ValeurContentItem.class);
                    }
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Publications.PublicationDetail.RegistreDetail.Valeur that = ((Publications.PublicationDetail.RegistreDetail.Valeur) object);
                    {
                        List<JAXBElement<? extends Comparable>> lhsContent;
                        lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
                        List<JAXBElement<? extends Comparable>> rhsContent;
                        rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                            return false;
                        }
                    }
                    return true;
                }

                public boolean equals(Object object) {
                    final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
                    return equals(null, null, object, strategy);
                }

                public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
                    int currentHashCode = 1;
                    {
                        List<JAXBElement<? extends Comparable>> theContent;
                        theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
                        currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
                    }
                    return currentHashCode;
                }

                public int hashCode() {
                    final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
                    return this.hashCode(null, strategy);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @Entity(name = "Publications$PublicationDetail$RegistreDetail$Valeur$ValeurContentItem")
                @Table(name = "VALEUR_CONTENT_ITEM", schema = "france")
                @Inheritance(strategy = InheritanceType.JOINED)
                public static class ValeurContentItem
                    implements Item<JAXBElement<? extends Comparable>>
                {

                    @XmlElementRefs({
                        @XmlElementRef(name = "Alias", type = JAXBElement.class),
                        @XmlElementRef(name = "Adresse", type = JAXBElement.class),
                        @XmlElementRef(name = "Prenom", type = JAXBElement.class),
                        @XmlElementRef(name = "Titre", type = JAXBElement.class),
                        @XmlElementRef(name = "ReferenceOnu", type = JAXBElement.class),
                        @XmlElementRef(name = "NumeroCarte", type = JAXBElement.class),
                        @XmlElementRef(name = "Mois", type = JAXBElement.class),
                        @XmlElementRef(name = "FondementJuridique", type = JAXBElement.class),
                        @XmlElementRef(name = "NumeroPasseport", type = JAXBElement.class),
                        @XmlElementRef(name = "Courriel", type = JAXBElement.class),
                        @XmlElementRef(name = "Lieu", type = JAXBElement.class),
                        @XmlElementRef(name = "Jour", type = JAXBElement.class),
                        @XmlElementRef(name = "Sexe", type = JAXBElement.class),
                        @XmlElementRef(name = "Annee", type = JAXBElement.class),
                        @XmlElementRef(name = "Identification", type = JAXBElement.class),
                        @XmlElementRef(name = "Commentaire", type = JAXBElement.class),
                        @XmlElementRef(name = "Pays", type = JAXBElement.class),
                        @XmlElementRef(name = "Motifs", type = JAXBElement.class),
                        @XmlElementRef(name = "FondementJuridiqueLabel", type = JAXBElement.class),
                        @XmlElementRef(name = "ReferenceUe", type = JAXBElement.class),
                        @XmlElementRef(name = "Cryptomonnaie", type = JAXBElement.class),
                        @XmlElementRef(name = "SiteInternet", type = JAXBElement.class),
                        @XmlElementRef(name = "Telephone", type = JAXBElement.class),
                        @XmlElementRef(name = "NumeroOMI", type = JAXBElement.class)
                    })
                    protected JAXBElement<? extends Comparable> item;
                    @XmlAttribute(name = "Hjid")
                    protected Long hjid;

                    /**
                     * 
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    @Transient
                    public JAXBElement<? extends Comparable> getItem() {
                        return item;
                    }

                    /**
                     * 
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setItem(JAXBElement<? extends Comparable> value) {
                        this.item = ((JAXBElement<? extends Comparable> ) value);
                    }

                    /**
                     * Obtient la valeur de la propriété hjid.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    @Id
                    @Column(name = "FRANCE_ID")
                    @GeneratedValue(generator = "id-sequence", strategy = GenerationType.SEQUENCE)
                    @SequenceGenerator(name = "id-sequence", sequenceName = "id_sequence", schema = "france")
                    public Long getHjid() {
                        return hjid;
                    }

                    /**
                     * Définit la valeur de la propriété hjid.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setHjid(Long value) {
                        this.hjid = value;
                    }

                    @Basic
                    @Column(name = "ITEM_ALIAS", length = 255)
                    public String getItemAlias() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Alias"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemAlias(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Alias"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_ADRESSE", length = 255)
                    public String getItemAdresse() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Adresse"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemAdresse(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Adresse"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_PRENOM", length = 255)
                    public String getItemPrenom() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Prenom"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemPrenom(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Prenom"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_TITRE", length = 255)
                    public String getItemTitre() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Titre"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemTitre(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Titre"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_REFERENCE_ONU", length = 255)
                    public String getItemReferenceOnu() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "ReferenceOnu"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemReferenceOnu(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "ReferenceOnu"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_NUMERO_CARTE", length = 255)
                    public String getItemNumeroCarte() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "NumeroCarte"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemNumeroCarte(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "NumeroCarte"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_MOIS", length = 255)
                    public String getItemMois() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Mois"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemMois(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Mois"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_FONDEMENT_JURIDIQUE", length = 255)
                    public Integer getItemFondementJuridique() {
                        if (XmlAdapterUtils.isJAXBElement(Integer.class, new QName("", "FondementJuridique"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends Integer> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemFondementJuridique(Integer target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(Integer.class, new QName("", "FondementJuridique"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_NUMERO_PASSEPORT", length = 255)
                    public String getItemNumeroPasseport() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "NumeroPasseport"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemNumeroPasseport(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "NumeroPasseport"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_COURRIEL", length = 255)
                    public String getItemCourriel() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Courriel"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemCourriel(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Courriel"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_LIEU", length = 255)
                    public String getItemLieu() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Lieu"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemLieu(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Lieu"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_JOUR", length = 255)
                    public String getItemJour() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Jour"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemJour(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Jour"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_SEXE", length = 255)
                    public String getItemSexe() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Sexe"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemSexe(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Sexe"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_ANNEE", length = 255)
                    public Integer getItemAnnee() {
                        if (XmlAdapterUtils.isJAXBElement(Integer.class, new QName("", "Annee"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends Integer> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemAnnee(Integer target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(Integer.class, new QName("", "Annee"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_IDENTIFICATION", length = 255)
                    public String getItemIdentification() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Identification"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemIdentification(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Identification"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_COMMENTAIRE", length = 255)
                    public String getItemCommentaire() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Commentaire"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemCommentaire(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Commentaire"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_PAYS", length = 255)
                    public String getItemPays() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Pays"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemPays(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Pays"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_MOTIFS", length = 255)
                    public String getItemMotifs() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Motifs"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemMotifs(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Motifs"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_FONDEMENT_JURIDIQUE_LAB_0", length = 255)
                    public String getItemFondementJuridiqueLabel() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "FondementJuridiqueLabel"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemFondementJuridiqueLabel(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "FondementJuridiqueLabel"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_REFERENCE_UE", length = 255)
                    public String getItemReferenceUe() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "ReferenceUe"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemReferenceUe(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "ReferenceUe"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_CRYPTOMONNAIE", length = 255)
                    public String getItemCryptomonnaie() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Cryptomonnaie"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemCryptomonnaie(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Cryptomonnaie"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_SITE_INTERNET", length = 255)
                    public String getItemSiteInternet() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "SiteInternet"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemSiteInternet(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "SiteInternet"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_TELEPHONE", length = 255)
                    public String getItemTelephone() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "Telephone"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemTelephone(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "Telephone"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                    @Basic
                    @Column(name = "ITEM_NUMERO_OMI", length = 255)
                    public String getItemNumeroOMI() {
                        if (XmlAdapterUtils.isJAXBElement(String.class, new QName("", "NumeroOMI"), Publications.PublicationDetail.RegistreDetail.Valeur.class, this.getItem())) {
                            return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getItem()));
                        } else {
                            return null;
                        }
                    }

                    public void setItemNumeroOMI(String target) {
                        if (target!= null) {
                            setItem(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("", "NumeroOMI"), Publications.PublicationDetail.RegistreDetail.Valeur.class, target));
                        }
                    }

                }

            }

        }

    }

}
