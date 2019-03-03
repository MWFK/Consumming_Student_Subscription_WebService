
package tn.esprit.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculerFraisInscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculerFraisInscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numInscription" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculerFraisInscription", propOrder = {
    "numInscription"
})
public class CalculerFraisInscription {

    protected int numInscription;

    /**
     * Gets the value of the numInscription property.
     * 
     */
    public int getNumInscription() {
        return numInscription;
    }

    /**
     * Sets the value of the numInscription property.
     * 
     */
    public void setNumInscription(int value) {
        this.numInscription = value;
    }

}
