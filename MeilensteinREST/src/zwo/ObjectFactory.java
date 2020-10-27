
package zwo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zwo package. 
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

    private final static QName _GetDatum_QNAME = new QName("http://zwo/", "getDatum");
    private final static QName _GetDatumResponse_QNAME = new QName("http://zwo/", "getDatumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zwo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDatum }
     * 
     */
    public GetDatum createGetDatum() {
        return new GetDatum();
    }

    /**
     * Create an instance of {@link GetDatumResponse }
     * 
     */
    public GetDatumResponse createGetDatumResponse() {
        return new GetDatumResponse();
    }

    /**
     * Create an instance of {@link Taxifahrt }
     * 
     */
    public Taxifahrt createTaxifahrt() {
        return new Taxifahrt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zwo/", name = "getDatum")
    public JAXBElement<GetDatum> createGetDatum(GetDatum value) {
        return new JAXBElement<GetDatum>(_GetDatum_QNAME, GetDatum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zwo/", name = "getDatumResponse")
    public JAXBElement<GetDatumResponse> createGetDatumResponse(GetDatumResponse value) {
        return new JAXBElement<GetDatumResponse>(_GetDatumResponse_QNAME, GetDatumResponse.class, null, value);
    }

}
