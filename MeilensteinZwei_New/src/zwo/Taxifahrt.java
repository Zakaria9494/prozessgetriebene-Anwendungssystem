package zwo;

import java.io.Serializable;

public class Taxifahrt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int knr;
	private String von;
	private int datum;
	private String nach;
	private int entfernung;
	
	public Taxifahrt () {}
	
	public Taxifahrt(int knr, String von, int datum, String nach, int entfernung) {
		super();
		this.knr = knr;
		this.von = von;
		this.datum = datum;
		this.nach = nach;
		this.entfernung = entfernung;
	}

	public int getKnr() {
		return knr;
	}

	public void setKnr(int knr) {
		this.knr = knr;
	}

	public String getVon() {
		return von;
	}

	public void setVon(String von) {
		this.von = von;
	}

	public int getDatum() {
		return datum;
	}

	public void setDatum(int datum) {
		this.datum = datum;
	}

	public String getNach() {
		return nach;
	}

	public void setNach(String nach) {
		this.nach = nach;
	}

	public int getEntfernung() {
		return entfernung;
	}

	public void setEntfernung(int entfernung) {
		this.entfernung = entfernung;
	}
	
}
