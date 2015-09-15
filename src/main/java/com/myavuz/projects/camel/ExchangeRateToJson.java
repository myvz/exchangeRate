package com.myavuz.projects.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;


/**
 * A Camel Java DSL Router
 */
public class ExchangeRateToJson extends RouteBuilder {


    private JaxbDataFormat dataFormat = new JaxbDataFormat("com.myavuz.projects.exchangerate");
    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("file:src/data/?fileName=today.xml&noop=true")
                .unmarshal(dataFormat)
                .bean(EchoBean.class,"print")
                .marshal().json()
                .to("file:target/messages/info/?fileName=today.json");
    }

}
