package zwo;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(targetNamespace = "http://zwo/", endpointInterface = "zwo.Taxidaten", portName = "TaxidatenImplPort", serviceName = "TaxidatenImplService")
public class TaxidatenImpl implements Taxidaten {
	/* 
	 * Globale ArrayList anlegen
	 * Taxidaten mit Daten von Taxifahrt Struktur in dem Konstruktor füllen
	 */
	ArrayList<Taxifahrt> taxidaten=new ArrayList<Taxifahrt>();
	ArrayList<Taxifahrt> returnlist = new ArrayList<Taxifahrt>();

	

	public TaxidatenImpl() {
		taxidaten.add(new Taxifahrt(4711, "Frankfurt am Main", 1, "Berlin", 555));
		taxidaten.add(new Taxifahrt(4712, "Rostock", 1, "Berlin", 230));
		taxidaten.add(new Taxifahrt(4713, "Bremen", 2, "Braunschweig", 177));
		taxidaten.add(new Taxifahrt(4714, "Osnabrück", 2, "Bremen", 122));
		taxidaten.add(new Taxifahrt(4715, "Münster", 2, "Duisburg", 102));
		taxidaten.add(new Taxifahrt(4716, "Wuppertal", 2, "Leverkusen", 39));
		taxidaten.add(new Taxifahrt(4714, "Köln", 2, "Köln/Bonn Flughafen", 15));
		taxidaten.add(new Taxifahrt(4720, "Köln", 9, "Wuppertal", 52));
		taxidaten.add(new Taxifahrt(4715, "Leverkusen", 3, "Bonn", 45));
		taxidaten.add(new Taxifahrt(4712, "Leverkusen", 3, "Siegen", 98));
	}

    public ArrayList<Taxifahrt> getDatum(int fahrtdatum) {
    	
    	for (Taxifahrt taxifahrt : taxidaten) {
    		
    		if(taxifahrt.getDatum()==fahrtdatum) {
    			returnlist.add(taxifahrt);
    			
    		}
			
		}
    	
		return returnlist;
    	
    	
    	 
}}
