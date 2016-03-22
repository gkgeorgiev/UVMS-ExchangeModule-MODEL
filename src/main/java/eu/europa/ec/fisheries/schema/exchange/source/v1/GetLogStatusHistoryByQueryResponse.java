
package eu.europa.ec.fisheries.schema.exchange.source.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusLog" type="{urn:exchange.schema.fisheries.ec.europa.eu:v1}ExchangeLogStatusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusLog"
})
@XmlRootElement(name = "GetLogStatusHistoryByQueryResponse")
public class GetLogStatusHistoryByQueryResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<ExchangeLogStatusType> statusLog;

    /**
     * Gets the value of the statusLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeLogStatusType }
     * 
     * 
     */
    public List<ExchangeLogStatusType> getStatusLog() {
        if (statusLog == null) {
            statusLog = new ArrayList<ExchangeLogStatusType>();
        }
        return this.statusLog;
    }

}