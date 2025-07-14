package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RequestMapping("/")
    public String helloWorld() {
        return """
            <html>
                <head>
                    <style>
                        body {
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            margin: 0;
                            background-color: #f9f9f9;
                        }
                        h1 {
                            font-size: 48px;
                            color: #2c3e50;
                            font-family: Arial, sans-serif;
                        }
                    </style>
                </head>
                <body>
                    <h1>Praneeth new app live and running</h1>
                </body>
            </html>
        """;
    }
}
