
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package zwo;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-04T14:05:31.495+01:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "TaxidatenImplService",
                      portName = "TaxidatenImplPort",
                      targetNamespace = "http://zwo/",
                      wsdlLocation = "file:/C:/Users/admin/workspace/MeilensteinZwo/WebContent/wsdl/taxidatenimpl.wsdl",
                      endpointInterface = "zwo.Taxidaten")

public class TaxidatenImplPortImpl implements Taxidaten {

    private static final Logger LOG = Logger.getLogger(TaxidatenImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see zwo.Taxidaten#getDatum(int arg0)*
     */
    public java.util.List<zwo.Taxifahrt> getDatum(int arg0) {
        LOG.info("Executing operation getDatum");
        System.out.println(arg0);
        try {
            java.util.List<zwo.Taxifahrt> _return = new java.util.ArrayList<zwo.Taxifahrt>();
            zwo.Taxifahrt _returnVal1 = new zwo.Taxifahrt();
            _returnVal1.setDatum(1291082533);
            _returnVal1.setEntfernung(-707619269);
            _returnVal1.setKnr(-1519234177);
            _returnVal1.setNach("Nach-300871750");
            _returnVal1.setVon("Von288803504");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}