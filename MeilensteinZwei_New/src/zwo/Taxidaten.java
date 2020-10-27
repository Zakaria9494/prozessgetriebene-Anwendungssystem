package zwo;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Taxidaten", targetNamespace = "http://zwo/")
public interface Taxidaten {

	@WebMethod(operationName = "getDatum", action = "urn:GetDatum")
	@RequestWrapper(className = "zwo.jaxws.GetDatum", localName = "getDatum", targetNamespace = "http://zwo/")
	@ResponseWrapper(className = "zwo.jaxws.GetDatumResponse", localName = "getDatumResponse", targetNamespace = "http://zwo/")
	@WebResult(name = "return")
	ArrayList<Taxifahrt> getDatum(@WebParam(name = "arg0") int fahrtdatum);

}