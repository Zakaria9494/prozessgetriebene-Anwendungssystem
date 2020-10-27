package Bean;

public class steuerklasse {

	  String frage;
	  double skala;
	  int antwort;
	String zuorderung;
	/**
	 * @return the antwort
	 */
	public int getAntwort() {
		return antwort;
	}
	/**
	 * @param antwort the antwort to set
	 */
	public void setAntwort(int antwort) {
		this.antwort = antwort;
	}
	/**
	 * 
	 */
	public steuerklasse() {
		super();
	}
	/**
	 * @return the frage
	 */
	public String getFrage() {
		return frage;
	}
	/**
	 * @param frage the frage to set
	 */
	public void setFrage(String frage) {
		this.frage = frage;
	}
	/**
	 * @return the skale
	 */
	
    
	 
				
				
				
			
	/**
	 * @return the skala
	 */
	public double getSkala() {
		return skala;
	}
	/**
	 * @return the zuorderung
	 */
	public String getZuorderung() {
		return zuorderung;
	}
	/**
	 * @param zuorderung the zuorderung to set
	 */
	public void setZuorderung(String zuorderung) {
		this.zuorderung = zuorderung;
	}
	/**
	 * @param skala the skala to set
	 */
	public void setSkala(double skala) {
		this.skala = skala;
	}
 
	public double Berechnung() {
		 
		 double wert=0;
		 
		 
		 for (int antwort= 0; antwort< 100; antwort++) {
			

		 
				if (antwort > 10 && antwort <= 20) {
					antwort= (int) 0.7;
				} else if (antwort> 20 && antwort <= 25) {
					antwort= (int) 0.3;
				} else if (antwort> 25) {
					antwort= (int) -1.0;
				}
		 
				double temp = skala * antwort;

				wert = wert + temp;

				
				double maxpoints = 114;
				double aus = Math.round((wert / maxpoints) * 100);

			}
		return wert;
}
}