
package tn.esprit.ejb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ScolariteService", targetNamespace = "http://ejb.esprit.tn/", wsdlLocation = "http://localhost:18080/EJBAsAService-Jax-WS/ScolariteService/Scolarite?wsdl")
public class ScolariteService
    extends Service
{

    private final static URL SCOLARITESERVICE_WSDL_LOCATION;
    private final static WebServiceException SCOLARITESERVICE_EXCEPTION;
    private final static QName SCOLARITESERVICE_QNAME = new QName("http://ejb.esprit.tn/", "ScolariteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:18080/EJBAsAService-Jax-WS/ScolariteService/Scolarite?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCOLARITESERVICE_WSDL_LOCATION = url;
        SCOLARITESERVICE_EXCEPTION = e;
    }

    public ScolariteService() {
        super(__getWsdlLocation(), SCOLARITESERVICE_QNAME);
    }

    public ScolariteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCOLARITESERVICE_QNAME, features);
    }

    public ScolariteService(URL wsdlLocation) {
        super(wsdlLocation, SCOLARITESERVICE_QNAME);
    }

    public ScolariteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCOLARITESERVICE_QNAME, features);
    }

    public ScolariteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScolariteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ScolaritePorType
     */
    @WebEndpoint(name = "ScolaritePort")
    public ScolaritePorType getScolaritePort() {
        return super.getPort(new QName("http://ejb.esprit.tn/", "ScolaritePort"), ScolaritePorType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScolaritePorType
     */
    @WebEndpoint(name = "ScolaritePort")
    public ScolaritePorType getScolaritePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb.esprit.tn/", "ScolaritePort"), ScolaritePorType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCOLARITESERVICE_EXCEPTION!= null) {
            throw SCOLARITESERVICE_EXCEPTION;
        }
        return SCOLARITESERVICE_WSDL_LOCATION;
    }

}