package eu.europa.ec.fisheries.schema.exchange.plugin.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-10-21T11:12:35.672+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", name = "ExchangeModulePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.exchange.movement.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.common.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.service.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExchangeModulePortType {

    @WebResult(name = "AcknowledgeResponse", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetCommand")
    public AcknowledgeResponse setCommand(
        @WebParam(partName = "body", name = "SetCommandRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        SetCommandRequest body
    ) throws PluginFault;

    @WebResult(name = "AcknowledgeResponse", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Stop")
    public AcknowledgeResponse stop(
        @WebParam(partName = "body", name = "StopRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        StopRequest body
    ) throws PluginFault;

    @WebResult(name = "PingResponse", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Ping")
    public PingResponse ping(
        @WebParam(partName = "body", name = "PingRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @WebMethod(operationName = "SetReport")
    public void setReport(
        @WebParam(partName = "body", mode = WebParam.Mode.INOUT, name = "SetReportRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        javax.xml.ws.Holder<SetReportRequest> body
    ) throws PluginFault;

    @WebResult(name = "AcknowledgeResponse", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Start")
    public AcknowledgeResponse start(
        @WebParam(partName = "body", name = "StartRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        StartRequest body
    ) throws PluginFault;

    @WebResult(name = "AcknowledgeResponse", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetConfig")
    public AcknowledgeResponse setConfig(
        @WebParam(partName = "body", name = "SetConfigRequest", targetNamespace = "urn:plugin.exchange.schema.fisheries.ec.europa.eu:v1")
        SetConfigRequest body
    ) throws PluginFault;
}
