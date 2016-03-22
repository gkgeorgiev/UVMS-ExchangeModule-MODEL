
package eu.europa.ec.fisheries.schema.exchange.registry.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-03-22T18:03:48.577+01:00
 * Generated source version: 2.7.6
 */

@WebFault(name = "exchangeFault", targetNamespace = "urn:common.exchange.schema.fisheries.ec.europa.eu:v1")
public class ExchangeException extends Exception {
    
    private eu.europa.ec.fisheries.schema.exchange.common.v1.ExchangeFault exchangeFault;

    public ExchangeException() {
        super();
    }
    
    public ExchangeException(String message) {
        super(message);
    }
    
    public ExchangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExchangeException(String message, eu.europa.ec.fisheries.schema.exchange.common.v1.ExchangeFault exchangeFault) {
        super(message);
        this.exchangeFault = exchangeFault;
    }

    public ExchangeException(String message, eu.europa.ec.fisheries.schema.exchange.common.v1.ExchangeFault exchangeFault, Throwable cause) {
        super(message, cause);
        this.exchangeFault = exchangeFault;
    }

    public eu.europa.ec.fisheries.schema.exchange.common.v1.ExchangeFault getFaultInfo() {
        return this.exchangeFault;
    }
}
