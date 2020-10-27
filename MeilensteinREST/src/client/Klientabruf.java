package client;

import REST.*;
import java.util.Scanner;

import com.sap.persistence.j.Customer;
import com.sap.persistence.j.Jc;
import com.sap.persistence.j.Jcus;

import zwo.*;

public class Klientabruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxidatenImplService ts = new TaxidatenImplService();
		Taxidaten t = ts.getTaxidatenImplPort();
		
		// Connect to JCus webservice
		Jc jc_service = new Jc();
		Jcus jc = jc_service.getJcusPort();
		
		// Zum RestfulService 
		TaxikostenInterface ti = new TaxikostenInterface();
		
		//TaxikostenREST tk = new TaxikostenREST();
		
		Scanner sc = new Scanner(System.in);
		int date;
	 
			System.out.println("Welches Fahrtdatum hat der Fahrgast? Bitte geben Sie nachfolgend an: ");
		
			date = sc.nextInt();
			//sc.close();
	 
			
			if(Character.isAlphabetic(date)) {
				System.out.println("Bitte geben Sie nur ein Zahl !!!!");
			}else {
			
			for (Taxifahrt obj : t.getDatum(date)) {
 			//Taxifahrt obj = t.getDatum(date);
				int customer_id = obj.getKnr();
 				System.out.println("======================");
				System.out.println("Datum der Fahrt : "+obj.getDatum());
				System.out.println("Kundennummer : "+obj.getKnr());
				System.out.println("Von : "+obj.getVon());
				System.out.println("Nach : "+obj.getNach());
				System.out.println("Distanz : "+obj.getEntfernung());
				System.out.println("=======================");
				
				for (Customer c : jc.findCUSTOMERByCusId(customer_id)) {
					System.out.println("======KUNDEN DETAILS======");
					System.out.println("Name des Kunden: "+c.getName());
					System.out.println("Land: "+c.getCountry());
					System.out.println("Adresse: "+c.getAddress());
				}
				int kilometer_d = obj.getEntfernung();
				ti.setJSON(kilometer_d);
				System.out.println(ti.getJSON());

	}}
	}

}
