package com.example.camel;

import org.apache.camel.builder.RouteBuilder;

public class JettyRoute extends RouteBuilder {

    public void configure() throws Exception {
        from("jetty:http://0.0.0.0:8080/hello")
                .to("file:data/request")
                .transform().simple("Hello from Camel");
    }
}
