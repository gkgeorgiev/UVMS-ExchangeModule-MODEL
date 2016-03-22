package eu.europa.ec.fisheries.schema.exchange.source.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-03-22T18:31:37.574+01:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", name = "ExchangeDataSourcePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.exchange.movement.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.common.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.service.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExchangeDataSourcePortType {

    @WebResult(name = "CreateLogResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateLog")
    public CreateLogResponse createLog(
        @WebParam(partName = "body", name = "CreateLogRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        CreateLogRequest body
    ) throws ExchangeFault;

    @WebResult(name = "UpdateLogStatusResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdateLogStatus")
    public UpdateLogStatusResponse updateLogStatus(
        @WebParam(partName = "body", name = "UpdateLogStatusRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        UpdateLogStatusRequest body
    ) throws ExchangeFault;

    @WebResult(name = "CreateUnsentMessageResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreateUnsentMessage")
    public CreateUnsentMessageResponse createUnsentMessage(
        @WebParam(partName = "body", name = "CreateUnsentMessageRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        CreateUnsentMessageRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetServiceSettingsResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetServiceSettings")
    public GetServiceSettingsResponse getServiceSettings(
        @WebParam(partName = "body", name = "GetServiceSettingsRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetServiceSettingsRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetLogStatusHistoryResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetLogStatusHistory")
    public GetLogStatusHistoryResponse getLogStatusHistory(
        @WebParam(partName = "body", name = "GetLogStatusHistoryRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetLogStatusHistoryRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetServiceCapabilitiesResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetServiceCapabilities")
    public GetServiceCapabilitiesResponse getServiceCapabilities(
        @WebParam(partName = "body", name = "GetServiceCapabilitiesRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetServiceCapabilitiesRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetServiceResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetService")
    public GetServiceResponse getService(
        @WebParam(partName = "body", name = "GetServiceRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetServiceRequest body
    ) throws ExchangeFault;

    @WebResult(name = "ResendMessageResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "ResendMessage")
    public ResendMessageResponse resendMessage(
        @WebParam(partName = "body", name = "ResendMessageRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        ResendMessageRequest body
    ) throws ExchangeFault;

    @WebResult(name = "UnregisterServiceResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UnregisterService")
    public UnregisterServiceResponse unregisterService(
        @WebParam(partName = "body", name = "UnregisterServiceRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        UnregisterServiceRequest body
    ) throws ExchangeFault;

    @WebResult(name = "pingResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Ping")
    public PingResponse ping(
        @WebParam(partName = "body", name = "pingRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @WebResult(name = "SingleExchangeLogResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetExchangeLog")
    public SingleExchangeLogResponse getExchangeLog(
        @WebParam(partName = "body", name = "GetExchangeLogRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetExchangeLogRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetLogListByQueryResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetLogListByQuery")
    public GetLogListByQueryResponse getLogListByQuery(
        @WebParam(partName = "body", name = "GetLogListByQueryRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetLogListByQueryRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetUnsentMessageListResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetUnsentMessageList")
    public GetUnsentMessageListResponse getUnsentMessageList(
        @WebParam(partName = "body", name = "GetUnsentMessageListRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetUnsentMessageListRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetServiceListResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetServiceList")
    public GetServiceListResponse getServiceList(
        @WebParam(partName = "body", name = "GetServiceListRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetServiceListRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetLogStatusHistoryByQueryResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetLogStatusHistoryByQuery")
    public GetLogStatusHistoryByQueryResponse getLogStatusHistoryByQuery(
        @WebParam(partName = "body", name = "GetLogStatusHistoryByQueryRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        GetLogStatusHistoryByQueryRequest body
    ) throws ExchangeFault;

    @WebResult(name = "SetServiceStatusResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetServiceStatus")
    public SetServiceStatusResponse setServiceStatus(
        @WebParam(partName = "body", name = "SetServiceStatusRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        SetServiceStatusRequest body
    ) throws ExchangeFault;

    @WebResult(name = "RegisterServiceResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "RegisterService")
    public RegisterServiceResponse registerService(
        @WebParam(partName = "body", name = "RegisterServiceRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        RegisterServiceRequest body
    ) throws ExchangeFault;

    @WebResult(name = "SetPollStatusResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetPollStatus")
    public SetPollStatusResponse setPollStatus(
        @WebParam(partName = "body", name = "SetPollStatusRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        SetPollStatusRequest body
    ) throws ExchangeFault;

    @WebResult(name = "SetServiceSettingsResponse", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SetServiceSettings")
    public SetServiceSettingsResponse setServiceSettings(
        @WebParam(partName = "body", name = "SetServiceSettingsRequest", targetNamespace = "urn:source.exchange.schema.fisheries.ec.europa.eu:v1")
        SetServiceSettingsRequest body
    ) throws ExchangeFault;
}
