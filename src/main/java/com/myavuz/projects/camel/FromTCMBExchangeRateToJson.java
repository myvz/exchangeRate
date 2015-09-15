package com.myavuz.projects.camel;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by myavuz on 15.09.2015.
 */
public class FromTCMBExchangeRateToJson extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:start")
                .to("http4://www.tcmb.gov.tr/kurlar/today.xml")
                .log("Requested www.tcmb.gov.tr/kurlar/today.xml")
                .unmarshal()
                .jaxb("com.myavuz.projects.exchangerate")
                .marshal().json()
                .to("file:target/messages/?fileName=response.json");

    }
}
