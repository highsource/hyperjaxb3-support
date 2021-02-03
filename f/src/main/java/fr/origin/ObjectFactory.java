//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.03 à 09:49:06 AM CET 
//


package fr.origin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.origin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PublicationsPublicationDetailRegistreDetailValeurAlias_QNAME = new QName("", "Alias");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurCommentaire_QNAME = new QName("", "Commentaire");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurLieu_QNAME = new QName("", "Lieu");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurAdresse_QNAME = new QName("", "Adresse");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurPays_QNAME = new QName("", "Pays");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurMotifs_QNAME = new QName("", "Motifs");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurFondementJuridique_QNAME = new QName("", "FondementJuridique");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurFondementJuridiqueLabel_QNAME = new QName("", "FondementJuridiqueLabel");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurReferenceUe_QNAME = new QName("", "ReferenceUe");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurReferenceOnu_QNAME = new QName("", "ReferenceOnu");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurCryptomonnaie_QNAME = new QName("", "Cryptomonnaie");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurIdentification_QNAME = new QName("", "Identification");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurPrenom_QNAME = new QName("", "Prenom");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurSexe_QNAME = new QName("", "Sexe");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurJour_QNAME = new QName("", "Jour");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurMois_QNAME = new QName("", "Mois");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurAnnee_QNAME = new QName("", "Annee");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurTitre_QNAME = new QName("", "Titre");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurNumeroCarte_QNAME = new QName("", "NumeroCarte");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurNumeroPasseport_QNAME = new QName("", "NumeroPasseport");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurTelephone_QNAME = new QName("", "Telephone");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurSiteInternet_QNAME = new QName("", "SiteInternet");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurCourriel_QNAME = new QName("", "Courriel");
    private final static QName _PublicationsPublicationDetailRegistreDetailValeurNumeroOMI_QNAME = new QName("", "NumeroOMI");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.origin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Publications }
     * 
     */
    public Publications createPublications() {
        return new Publications();
    }

    /**
     * Create an instance of {@link Publications.PublicationDetail }
     * 
     */
    public Publications.PublicationDetail createPublicationsPublicationDetail() {
        return new Publications.PublicationDetail();
    }

    /**
     * Create an instance of {@link Publications.PublicationDetail.RegistreDetail }
     * 
     */
    public Publications.PublicationDetail.RegistreDetail createPublicationsPublicationDetailRegistreDetail() {
        return new Publications.PublicationDetail.RegistreDetail();
    }

    /**
     * Create an instance of {@link Publications.PublicationDetail.RegistreDetail.Valeur }
     * 
     */
    public Publications.PublicationDetail.RegistreDetail.Valeur createPublicationsPublicationDetailRegistreDetailValeur() {
        return new Publications.PublicationDetail.RegistreDetail.Valeur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Alias", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurAlias(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurAlias_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Commentaire", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurCommentaire(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurCommentaire_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Lieu", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurLieu(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurLieu_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Adresse", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurAdresse(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurAdresse_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pays", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurPays(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurPays_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Motifs", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurMotifs(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurMotifs_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FondementJuridique", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<Integer> createPublicationsPublicationDetailRegistreDetailValeurFondementJuridique(Integer value) {
        return new JAXBElement<Integer>(_PublicationsPublicationDetailRegistreDetailValeurFondementJuridique_QNAME, Integer.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FondementJuridiqueLabel", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurFondementJuridiqueLabel(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurFondementJuridiqueLabel_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReferenceUe", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurReferenceUe(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurReferenceUe_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReferenceOnu", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurReferenceOnu(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurReferenceOnu_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cryptomonnaie", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurCryptomonnaie(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurCryptomonnaie_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Identification", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurIdentification(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurIdentification_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Prenom", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurPrenom(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurPrenom_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sexe", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurSexe(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurSexe_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Jour", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurJour(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurJour_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Mois", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurMois(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurMois_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Annee", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<Integer> createPublicationsPublicationDetailRegistreDetailValeurAnnee(Integer value) {
        return new JAXBElement<Integer>(_PublicationsPublicationDetailRegistreDetailValeurAnnee_QNAME, Integer.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Titre", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurTitre(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurTitre_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumeroCarte", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurNumeroCarte(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurNumeroCarte_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumeroPasseport", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurNumeroPasseport(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurNumeroPasseport_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telephone", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurTelephone(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurTelephone_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SiteInternet", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurSiteInternet(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurSiteInternet_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Courriel", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurCourriel(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurCourriel_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumeroOMI", scope = Publications.PublicationDetail.RegistreDetail.Valeur.class)
    public JAXBElement<String> createPublicationsPublicationDetailRegistreDetailValeurNumeroOMI(String value) {
        return new JAXBElement<String>(_PublicationsPublicationDetailRegistreDetailValeurNumeroOMI_QNAME, String.class, Publications.PublicationDetail.RegistreDetail.Valeur.class, value);
    }

}
