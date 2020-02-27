/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StreamEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        StreamEndpoint target = (StreamEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "filename":
        case "fileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "filewatcher":
        case "fileWatcher": target.setFileWatcher(property(camelContext, boolean.class, value)); return true;
        case "grouplines":
        case "groupLines": target.setGroupLines(property(camelContext, int.class, value)); return true;
        case "groupstrategy":
        case "groupStrategy": target.setGroupStrategy(property(camelContext, org.apache.camel.component.stream.GroupStrategy.class, value)); return true;
        case "initialpromptdelay":
        case "initialPromptDelay": target.setInitialPromptDelay(property(camelContext, long.class, value)); return true;
        case "promptdelay":
        case "promptDelay": target.setPromptDelay(property(camelContext, long.class, value)); return true;
        case "promptmessage":
        case "promptMessage": target.setPromptMessage(property(camelContext, java.lang.String.class, value)); return true;
        case "retry": target.setRetry(property(camelContext, boolean.class, value)); return true;
        case "scanstream":
        case "scanStream": target.setScanStream(property(camelContext, boolean.class, value)); return true;
        case "scanstreamdelay":
        case "scanStreamDelay": target.setScanStreamDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "autoclosecount":
        case "autoCloseCount": target.setAutoCloseCount(property(camelContext, int.class, value)); return true;
        case "closeondone":
        case "closeOnDone": target.setCloseOnDone(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.setReadTimeout(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
