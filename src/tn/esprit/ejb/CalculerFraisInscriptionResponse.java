
package tn.esprit.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculerFraisInscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculerFraisInscriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraisInscription" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculerFraisInscriptionResponse", propOrder = {
    "fraisInscription"
})
public class CalculerFraisInscriptionResponse {

    protected float fraisInscription;

    /**
     * Gets the value of the fraisInscription property.
     * 
     */
    public float getFraisInscription() {
        return fraisInscription;
    }

    /**
     * Sets the value of the fraisInscription property.
     * 
     */
    public void setFraisInscription(float value) {
        this.fraisInscription = value;
    }

}
