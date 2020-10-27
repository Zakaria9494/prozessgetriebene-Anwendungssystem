
package com.sap.persistence.j;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.persistence.j package. 
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

    private final static QName _Create_QNAME = new QName("http://sap.com/persistence/j/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://sap.com/persistence/j/", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://sap.com/persistence/j/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://sap.com/persistence/j/", "deleteResponse");
    private final static QName _FindAllCUSTOMER_QNAME = new QName("http://sap.com/persistence/j/", "findAllCUSTOMER");
    private final static QName _FindAllCUSTOMERResponse_QNAME = new QName("http://sap.com/persistence/j/", "findAllCUSTOMERResponse");
    private final static QName _FindCUSTOMERByCusId_QNAME = new QName("http://sap.com/persistence/j/", "findCUSTOMERByCusId");
    private final static QName _FindCUSTOMERByCusIdResponse_QNAME = new QName("http://sap.com/persistence/j/", "findCUSTOMERByCusIdResponse");
    private final static QName _GetCUSTOMERItemCount_QNAME = new QName("http://sap.com/persistence/j/", "getCUSTOMERItemCount");
    private final static QName _GetCUSTOMERItemCountResponse_QNAME = new QName("http://sap.com/persistence/j/", "getCUSTOMERItemCountResponse");
    private final static QName _Update_QNAME = new QName("http://sap.com/persistence/j/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://sap.com/persistence/j/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.persistence.j
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindAllCUSTOMER }
     * 
     */
    public FindAllCUSTOMER createFindAllCUSTOMER() {
        return new FindAllCUSTOMER();
    }

    /**
     * Create an instance of {@link FindAllCUSTOMERResponse }
     * 
     */
    public FindAllCUSTOMERResponse createFindAllCUSTOMERResponse() {
        return new FindAllCUSTOMERResponse();
    }

    /**
     * Create an instance of {@link FindCUSTOMERByCusId }
     * 
     */
    public FindCUSTOMERByCusId createFindCUSTOMERByCusId() {
        return new FindCUSTOMERByCusId();
    }

    /**
     * Create an instance of {@link FindCUSTOMERByCusIdResponse }
     * 
     */
    public FindCUSTOMERByCusIdResponse createFindCUSTOMERByCusIdResponse() {
        return new FindCUSTOMERByCusIdResponse();
    }

    /**
     * Create an instance of {@link GetCUSTOMERItemCount }
     * 
     */
    public GetCUSTOMERItemCount createGetCUSTOMERItemCount() {
        return new GetCUSTOMERItemCount();
    }

    /**
     * Create an instance of {@link GetCUSTOMERItemCountResponse }
     * 
     */
    public GetCUSTOMERItemCountResponse createGetCUSTOMERItemCountResponse() {
        return new GetCUSTOMERItemCountResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCUSTOMER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "findAllCUSTOMER")
    public JAXBElement<FindAllCUSTOMER> createFindAllCUSTOMER(FindAllCUSTOMER value) {
        return new JAXBElement<FindAllCUSTOMER>(_FindAllCUSTOMER_QNAME, FindAllCUSTOMER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCUSTOMERResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "findAllCUSTOMERResponse")
    public JAXBElement<FindAllCUSTOMERResponse> createFindAllCUSTOMERResponse(FindAllCUSTOMERResponse value) {
        return new JAXBElement<FindAllCUSTOMERResponse>(_FindAllCUSTOMERResponse_QNAME, FindAllCUSTOMERResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCUSTOMERByCusId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "findCUSTOMERByCusId")
    public JAXBElement<FindCUSTOMERByCusId> createFindCUSTOMERByCusId(FindCUSTOMERByCusId value) {
        return new JAXBElement<FindCUSTOMERByCusId>(_FindCUSTOMERByCusId_QNAME, FindCUSTOMERByCusId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCUSTOMERByCusIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "findCUSTOMERByCusIdResponse")
    public JAXBElement<FindCUSTOMERByCusIdResponse> createFindCUSTOMERByCusIdResponse(FindCUSTOMERByCusIdResponse value) {
        return new JAXBElement<FindCUSTOMERByCusIdResponse>(_FindCUSTOMERByCusIdResponse_QNAME, FindCUSTOMERByCusIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCUSTOMERItemCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "getCUSTOMERItemCount")
    public JAXBElement<GetCUSTOMERItemCount> createGetCUSTOMERItemCount(GetCUSTOMERItemCount value) {
        return new JAXBElement<GetCUSTOMERItemCount>(_GetCUSTOMERItemCount_QNAME, GetCUSTOMERItemCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCUSTOMERItemCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "getCUSTOMERItemCountResponse")
    public JAXBElement<GetCUSTOMERItemCountResponse> createGetCUSTOMERItemCountResponse(GetCUSTOMERItemCountResponse value) {
        return new JAXBElement<GetCUSTOMERItemCountResponse>(_GetCUSTOMERItemCountResponse_QNAME, GetCUSTOMERItemCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/persistence/j/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
