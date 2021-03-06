
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.sap.persistence.j;

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
 * 2019-01-05T04:14:51.299+01:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "Jc",
                      portName = "JcusPort",
                      targetNamespace = "http://sap.com/persistence/j/",
                      wsdlLocation = "file:/C:/Users/admin/workspace/MeilensteinREST/WebContent/Jcus.wsdl",
                      endpointInterface = "com.sap.persistence.j.Jcus")

public class JcusPortImpl implements Jcus {

    private static final Logger LOG = Logger.getLogger(JcusPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#findAllCUSTOMER()*
     */
    public java.util.List<com.sap.persistence.j.Customer> findAllCUSTOMER() {
        LOG.info("Executing operation findAllCUSTOMER");
        try {
            java.util.List<com.sap.persistence.j.Customer> _return = new java.util.ArrayList<com.sap.persistence.j.Customer>();
            com.sap.persistence.j.Customer _returnVal1 = new com.sap.persistence.j.Customer();
            _returnVal1.setAddress("Address894820969");
            _returnVal1.setCountry("Country-858409307");
            _returnVal1.setCusId(Integer.valueOf(-851282396));
            _returnVal1.setName("Name585457453");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#findCUSTOMERByCusId(java.lang.Integer cusId)*
     */
    public java.util.List<com.sap.persistence.j.Customer> findCUSTOMERByCusId(java.lang.Integer cusId) {
        LOG.info("Executing operation findCUSTOMERByCusId");
        System.out.println(cusId);
        try {
            java.util.List<com.sap.persistence.j.Customer> _return = new java.util.ArrayList<com.sap.persistence.j.Customer>();
            com.sap.persistence.j.Customer _returnVal1 = new com.sap.persistence.j.Customer();
            _returnVal1.setAddress("Address207829994");
            _returnVal1.setCountry("Country-649058529");
            _returnVal1.setCusId(Integer.valueOf(-1203833979));
            _returnVal1.setName("Name479074597");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#delete(com.sap.persistence.j.Customer entity)*
     */
    public void delete(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation delete");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#create(com.sap.persistence.j.Customer entity)*
     */
    public void create(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation create");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#update(com.sap.persistence.j.Customer entity)*
     */
    public void update(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation update");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#getCUSTOMERItemCount()*
     */
    public int getCUSTOMERItemCount() {
        LOG.info("Executing operation getCUSTOMERItemCount");
        try {
            int _return = -625779095;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
