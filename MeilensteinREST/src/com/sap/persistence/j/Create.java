
package com.sap.persistence.j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für create complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="create"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entity" type="{http://sap.com/persistence/j/}customer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", propOrder = {
    "entity"
})
public class Create {

    protected Customer entity;

    /**
     * Ruft den Wert der entity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getEntity() {
        return entity;
    }

    /**
     * Legt den Wert der entity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setEntity(Customer value) {
        this.entity = value;
    }

}
