package Client;

import java.util.List;
import java.util.Scanner;

import com.sap.persistence.j.Customer;
import com.sap.persistence.j.Jc;
import com.sap.persistence.j.Jcus;

public class Kundenclient {
	public static void main(String []args) {
		
		
		Jc customer=new Jc();
		Jcus c=customer.getJcusPort();
		Scanner as=new Scanner (System.in);
		
		System.out.println("Bitte geben Sie die CustomerId ein :: ");
		
		int custId=as.nextInt();
		
		
		List<Customer>liste=c.findCUSTOMERByCusId(custId);
	
	
		
		
	int zähler=0;
	
	for (Customer cu : liste) {
		
		if(custId==cu.getCusId()) {
		
		System.out.println("Kunde: "+(zähler+1));
		System.out.println("___________________");
	   System.out.println("CustomerId: "+cu.getCusId());
	   System.out.println("Name: "+cu.getName());
         System.out.println("Adresse: "+cu.getAddress());	
         System.out.println("Countery: "+cu.getCountry());
         
         zähler++;
		}
		else{
			System.out.println("Customer ist nicht gefunden");
		}
	}
	
	
	}

}
