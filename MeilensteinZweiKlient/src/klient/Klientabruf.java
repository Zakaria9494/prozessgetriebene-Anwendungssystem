package klient;

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
		
		//TaxikostenREST tk = new TaxikostenREST();
		
		Scanner sc = new Scanner(System.in);
		int date;
		do {
			System.out.println("Welches Fahrtdatum hat der Fahrgast? Bitte geben Sie nachfolgend an: ");
			date = sc.nextInt();
			//sc.close();
		if(date !=0) {
			
			for (Taxifahrt obj : t.getDatum(date)) {
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
					
					double kilometer_d = obj.getEntfernung();
					
					System.out.println();
				}
			}
		}else {
			System.out.println("Bitte geben Sie einen gültigen Wert ein");

		}
			
		}while( kontrolle());
		System.out.println("Programm ist beendet");
 	}

	private static boolean kontrolle() {
		// TODO Auto-generated method stub
		System.out.println("Möchten Sie noch ein Fahrt ausgeben?Ja oder Nein");
		Scanner as=new Scanner(System.in);
		String eingabe=as.nextLine();
		if(eingabe.equalsIgnoreCase("ja")) {
			return true;
		}else {
		return false;
	}}
 

}
