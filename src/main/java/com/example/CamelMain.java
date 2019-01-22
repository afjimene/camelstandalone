package com.example;

import com.example.camel.JettyRoute;
import org.apache.camel.main.Main;

public class CamelMain {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.addRouteBuilder(new JettyRoute());
        main.run();
    }
}
