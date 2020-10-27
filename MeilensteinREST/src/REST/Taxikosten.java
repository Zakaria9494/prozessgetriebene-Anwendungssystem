package REST;
import java.io.Serializable;
 
public class Taxikosten implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double preispauschale, kilometergesamtpreis, kilometerpreis;
	
	
	public Taxikosten() {
		super();
	}


	public double getPreispauschale() {
		return preispauschale;
	}


	public void setPreispauschale(double kilometer) {
		if(kilometer < 20) {
			this.preispauschale = 8.00;
		 
			
		} else {
			this.preispauschale = 4.11;
		}
	}


	public double getKilometergesamtpreis() {
		return kilometergesamtpreis;
	}


	public void setKilometergesamtpreis(double kilometer) {
		//int kilometer = 40;
		
 		if(kilometer >= 30) {
			this.kilometerpreis = 1.07;
			
			this.kilometergesamtpreis = Math.round(preispauschale + (kilometerpreis * kilometer));
		}	
	  else {
			this.kilometerpreis = 0.63;
			this.kilometergesamtpreis = Math.round(preispauschale + (kilometerpreis * kilometer));
		
	}
	
	
	
	
	}}
