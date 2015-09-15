package com.myavuz.projects.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {


        CamelContext camelContext = initializeCamelContext();
        //camelContext.addRoutes(new ExchangeRateToJson());
        camelContext.addRoutes(new FromTCMBExchangeRateToJson());
        camelContext.start();
        ProducerTemplate template = camelContext.createProducerTemplate();
        template.sendBody("direct:start", "This is a test message");
        Thread.sleep(10000);
        camelContext.stop();
    }

    private static CamelContext initializeCamelContext() {
        CamelContext camelContext = new DefaultCamelContext();

        /*camelContext.getProperties().put("http.proxyHost",System.getProperty("http.proxyHost"));
        camelContext.getProperties().put("http.proxyPort",System.getProperty("http.proxyPort"));
        camelContext.getProperties().put("http.proxyUser",System.getProperty("http.proxyUser"));
        camelContext.getProperties().put("http.proxyPassword",System.getProperty("http.proxyPassword"));*/
        return camelContext;
    }

}

