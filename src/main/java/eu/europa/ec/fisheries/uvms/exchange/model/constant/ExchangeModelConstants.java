/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.exchange.model.constant;

public class ExchangeModelConstants {

    public static final String CONNECTION_FACTORY = "java:/ConnectionFactory";
    public static final String CONNECTION_TYPE = "javax.jms.MessageListener";
    public static final String PLUGIN_EVENTBUS = "java:/jms/topic/EventBus";
    public static final String EVENTBUS_NAME = "EventBus";

    public static final String DESTINATION_TYPE_QUEUE = "javax.jms.Queue";
    public static final String DESTINATION_TYPE_TOPIC = "javax.jms.Topic";

    public static final String EXCHANGE_MESSAGE_IN_QUEUE = "java:/jms/queue/UVMSExchangeEvent";
    public static final String EXCHANGE_MESSAGE_IN_QUEUE_NAME = "UVMSExchangeEvent";
    public static final String EXCHANGE_RESPONSE_QUEUE = "java:/jms/queue/UVMSExchange";
    public static final String QUEUE_DATASOURCE_INTERNAL = "java:/jms/queue/UVMSExchangeModel";

    public static final String EXCHANGE_REGISTER_SERVICE = "EXCHANGE_REGISTRY";
    public static final String SERVICE_NAME = "ServiceName";

    public static final String MODULE_NAME = "exchange";

    public static final String QUEUE_INTEGRATION_RULES = "java:/jms/queue/UVMSRulesEvent";
    public static final String QUEUE_INTEGRATION_ASSET = "java:/jms/queue/UVMSAssetEvent";
    public static final String QUEUE_INTEGRATION_AUDIT = "java:/jms/queue/UVMSAuditEvent";

    // For ack
    public static final String MOVEMENT_RESPONSE_QUEUE = "java:/jms/queue/UVMSMovement";

}