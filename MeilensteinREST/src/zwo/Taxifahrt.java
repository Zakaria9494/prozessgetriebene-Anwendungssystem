
package zwo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für taxifahrt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="taxifahrt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entfernung" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="knr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nach" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="von" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxifahrt", propOrder = {
    "datum",
    "entfernung",
    "knr",
    "nach",
    "von"
})
public class Taxifahrt {

    protected int datum;
    protected int entfernung;
    protected int knr;
    protected String nach;
    protected String von;

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     */
    public int getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     */
    public void setDatum(int value) {
        this.datum = value;
    }

    /**
     * Ruft den Wert der entfernung-Eigenschaft ab.
     * 
     */
    public int getEntfernung() {
        return entfernung;
    }

    /**
     * Legt den Wert der entfernung-Eigenschaft fest.
     * 
     */
    public void setEntfernung(int value) {
        this.entfernung = value;
    }

    /**
     * Ruft den Wert der knr-Eigenschaft ab.
     * 
     */
    public int getKnr() {
        return knr;
    }

    /**
     * Legt den Wert der knr-Eigenschaft fest.
     * 
     */
    public void setKnr(int value) {
        this.knr = value;
    }

    /**
     * Ruft den Wert der nach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNach() {
        return nach;
    }

    /**
     * Legt den Wert der nach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNach(String value) {
        this.nach = value;
    }

    /**
     * Ruft den Wert der von-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVon() {
        return von;
    }

    /**
     * Legt den Wert der von-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVon(String value) {
        this.von = value;
    }

}
