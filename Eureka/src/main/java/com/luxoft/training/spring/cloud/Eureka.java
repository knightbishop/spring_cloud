package com.luxoft.training.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableEurekaServer
public class Eureka
{
    public static void main(String[] args)
    {
        run(Eureka.class, args);
    }
}
