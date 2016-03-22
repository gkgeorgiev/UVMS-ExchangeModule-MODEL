package eu.europa.ec.fisheries.schema.exchange.registry.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-03-22T18:03:48.587+01:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:registry.exchange.schema.fisheries.ec.europa.eu:v1", name = "ExchangeRegistryServicePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.exchange.movement.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.common.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.service.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExchangeRegistryServicePortType {

    @WebResult(name = "RegisterServiceResponse", targetNamespace = "urn:registry.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "RegisterService")
    public RegisterServiceResponse registerService(
        @WebParam(partName = "body", name = "RegisterServiceRequest", targetNamespace = "urn:registry.exchange.schema.fisheries.ec.europa.eu:v1")
        RegisterServiceRequest body
    ) throws ExchangeException;

    @WebResult(name = "UnregisterServiceResponse", targetNamespace = "urn:registry.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UnregisterService")
    public UnregisterServiceResponse unregisterService(
        @WebParam(partName = "body", name = "UnregisterServiceRequest", targetNamespace = "urn:registry.exchange.schema.fisheries.ec.europa.eu:v1")
        UnregisterServiceRequest body
    ) throws ExchangeException;
}