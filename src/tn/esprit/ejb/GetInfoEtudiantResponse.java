
package tn.esprit.ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInfoEtudiantResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInfoEtudiantResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoEtudiant" type="{http://ejb.esprit.tn/}etudiant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoEtudiantResponse", propOrder = {
    "infoEtudiant"
})
public class GetInfoEtudiantResponse {

    protected Etudiant infoEtudiant;

    /**
     * Gets the value of the infoEtudiant property.
     * 
     * @return
     *     possible object is
     *     {@link Etudiant }
     *     
     */
    public Etudiant getInfoEtudiant() {
        return infoEtudiant;
    }

    /**
     * Sets the value of the infoEtudiant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Etudiant }
     *     
     */
    public void setInfoEtudiant(Etudiant value) {
        this.infoEtudiant = value;
    }

}
