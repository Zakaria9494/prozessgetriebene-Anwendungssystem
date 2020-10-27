package REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import javax.ws.rs.*;

@Path("/Taxikosten")
public class TaxikostenREST {
	@GET
	@Path("{kilometer}")
	@Produces("application/json")
	public Response getDetails(@PathParam("kilometer") String kilometer) {
		Taxikosten tk  = new Taxikosten();
		double kilometer_d = Double.parseDouble(kilometer);
		//String abc = kilometer;
		tk.setPreispauschale(kilometer_d);
		tk.setKilometergesamtpreis(kilometer_d);
		return Response.status(Response.Status.OK).entity(tk).build();
	}
}
