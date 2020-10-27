package REST;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.catalina.WebResource;
//import org.springframework.http.MediaType;
import javax.ws.rs.core.MediaType;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TaxikostenInterface {
	Client client;
    WebTarget webtarget;
    Invocation.Builder invoB;
    //Response response;
    private String json;
    
    public String getJSON() {
        return json;
    }
    
    public void setJSON (double kilometer) {
    	String kilometer_s = String.valueOf(kilometer);
        String myBasePath = "http://localhost:8192/MeilensteinREST/rest/";
        String myResourcePath = "Taxikosten/"+kilometer_s;
        client = ClientBuilder.newClient();
        webtarget = client.target(myBasePath + myResourcePath);
        Invocation.Builder invoB = webtarget.request(MediaType.APPLICATION_JSON);
        Response response = invoB.get();
        //System.out.println(response.readEntity(String.class));
        //Response response = invoB.get();
        
        ////System.out.println("resp Status " + response.getStatus());
        
        if (response.getStatus() != Response.Status.OK.getStatusCode()){
            throw new RuntimeException("Failed : HTTP error code : "+response.getStatus());
        }
        if (response.hasEntity()) {
            this.json = response.readEntity(String.class);
            JsonParser parser = new JsonParser();
            //System.out.println(this.json);
            JsonObject json = parser.parse(this.json).getAsJsonObject();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            this.json = gson.toJson(json);
        }
        //throw new IllegalStateException("response expected content of data");
        
    }
}
