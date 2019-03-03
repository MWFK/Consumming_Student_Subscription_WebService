
package tn.esprit.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tn.esprit.ejb package. 
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

    private final static QName _TopStudent_QNAME = new QName("http://ejb.esprit.tn/", "TopStudent");
    private final static QName _CalculerFraisInscription_QNAME = new QName("http://ejb.esprit.tn/", "calculerFraisInscription");
    private final static QName _GetInfoEtudiantResponse_QNAME = new QName("http://ejb.esprit.tn/", "getInfoEtudiantResponse");
    private final static QName _GetEtatInscriptionResponse_QNAME = new QName("http://ejb.esprit.tn/", "getEtatInscriptionResponse");
    private final static QName _GetListEtudiant_QNAME = new QName("http://ejb.esprit.tn/", "getListEtudiant");
    private final static QName _CalculerFraisInscriptionResponse_QNAME = new QName("http://ejb.esprit.tn/", "calculerFraisInscriptionResponse");
    private final static QName _GetEtatInscription_QNAME = new QName("http://ejb.esprit.tn/", "getEtatInscription");
    private final static QName _Inscrire_QNAME = new QName("http://ejb.esprit.tn/", "inscrire");
    private final static QName _GetInfoEtudiant_QNAME = new QName("http://ejb.esprit.tn/", "getInfoEtudiant");
    private final static QName _InscrireResponse_QNAME = new QName("http://ejb.esprit.tn/", "inscrireResponse");
    private final static QName _GetListEtudiantResponse_QNAME = new QName("http://ejb.esprit.tn/", "getListEtudiantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tn.esprit.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoEtudiant }
     * 
     */
    public GetInfoEtudiant createGetInfoEtudiant() {
        return new GetInfoEtudiant();
    }

    /**
     * Create an instance of {@link Inscrire }
     * 
     */
    public Inscrire createInscrire() {
        return new Inscrire();
    }

    /**
     * Create an instance of {@link GetEtatInscription }
     * 
     */
    public GetEtatInscription createGetEtatInscription() {
        return new GetEtatInscription();
    }

    /**
     * Create an instance of {@link GetListEtudiantResponse }
     * 
     */
    public GetListEtudiantResponse createGetListEtudiantResponse() {
        return new GetListEtudiantResponse();
    }

    /**
     * Create an instance of {@link InscrireResponse }
     * 
     */
    public InscrireResponse createInscrireResponse() {
        return new InscrireResponse();
    }

    /**
     * Create an instance of {@link CalculerFraisInscription }
     * 
     */
    public CalculerFraisInscription createCalculerFraisInscription() {
        return new CalculerFraisInscription();
    }

    /**
     * Create an instance of {@link GetInfoEtudiantResponse }
     * 
     */
    public GetInfoEtudiantResponse createGetInfoEtudiantResponse() {
        return new GetInfoEtudiantResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link CalculerFraisInscriptionResponse }
     * 
     */
    public CalculerFraisInscriptionResponse createCalculerFraisInscriptionResponse() {
        return new CalculerFraisInscriptionResponse();
    }

    /**
     * Create an instance of {@link GetEtatInscriptionResponse }
     * 
     */
    public GetEtatInscriptionResponse createGetEtatInscriptionResponse() {
        return new GetEtatInscriptionResponse();
    }

    /**
     * Create an instance of {@link GetListEtudiant }
     * 
     */
    public GetListEtudiant createGetListEtudiant() {
        return new GetListEtudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "TopStudent")
    public JAXBElement<Etudiant> createTopStudent(Etudiant value) {
        return new JAXBElement<Etudiant>(_TopStudent_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculerFraisInscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "calculerFraisInscription")
    public JAXBElement<CalculerFraisInscription> createCalculerFraisInscription(CalculerFraisInscription value) {
        return new JAXBElement<CalculerFraisInscription>(_CalculerFraisInscription_QNAME, CalculerFraisInscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getInfoEtudiantResponse")
    public JAXBElement<GetInfoEtudiantResponse> createGetInfoEtudiantResponse(GetInfoEtudiantResponse value) {
        return new JAXBElement<GetInfoEtudiantResponse>(_GetInfoEtudiantResponse_QNAME, GetInfoEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtatInscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getEtatInscriptionResponse")
    public JAXBElement<GetEtatInscriptionResponse> createGetEtatInscriptionResponse(GetEtatInscriptionResponse value) {
        return new JAXBElement<GetEtatInscriptionResponse>(_GetEtatInscriptionResponse_QNAME, GetEtatInscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getListEtudiant")
    public JAXBElement<GetListEtudiant> createGetListEtudiant(GetListEtudiant value) {
        return new JAXBElement<GetListEtudiant>(_GetListEtudiant_QNAME, GetListEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculerFraisInscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "calculerFraisInscriptionResponse")
    public JAXBElement<CalculerFraisInscriptionResponse> createCalculerFraisInscriptionResponse(CalculerFraisInscriptionResponse value) {
        return new JAXBElement<CalculerFraisInscriptionResponse>(_CalculerFraisInscriptionResponse_QNAME, CalculerFraisInscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtatInscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getEtatInscription")
    public JAXBElement<GetEtatInscription> createGetEtatInscription(GetEtatInscription value) {
        return new JAXBElement<GetEtatInscription>(_GetEtatInscription_QNAME, GetEtatInscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inscrire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "inscrire")
    public JAXBElement<Inscrire> createInscrire(Inscrire value) {
        return new JAXBElement<Inscrire>(_Inscrire_QNAME, Inscrire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getInfoEtudiant")
    public JAXBElement<GetInfoEtudiant> createGetInfoEtudiant(GetInfoEtudiant value) {
        return new JAXBElement<GetInfoEtudiant>(_GetInfoEtudiant_QNAME, GetInfoEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscrireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "inscrireResponse")
    public JAXBElement<InscrireResponse> createInscrireResponse(InscrireResponse value) {
        return new JAXBElement<InscrireResponse>(_InscrireResponse_QNAME, InscrireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.esprit.tn/", name = "getListEtudiantResponse")
    public JAXBElement<GetListEtudiantResponse> createGetListEtudiantResponse(GetListEtudiantResponse value) {
        return new JAXBElement<GetListEtudiantResponse>(_GetListEtudiantResponse_QNAME, GetListEtudiantResponse.class, null, value);
    }

}
