
package org.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MergeTablesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mergeTablesResult"
})
@XmlRootElement(name = "MergeTablesResponse")
public class MergeTablesResponse {

    @XmlElement(name = "MergeTablesResult")
    protected boolean mergeTablesResult;

    /**
     * Gets the value of the mergeTablesResult property.
     * 
     */
    public boolean isMergeTablesResult() {
        return mergeTablesResult;
    }

    /**
     * Sets the value of the mergeTablesResult property.
     * 
     */
    public void setMergeTablesResult(boolean value) {
        this.mergeTablesResult = value;
    }

}
