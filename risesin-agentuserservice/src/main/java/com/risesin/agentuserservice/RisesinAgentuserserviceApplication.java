package com.risesin.agentuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RisesinAgentuserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RisesinAgentuserserviceApplication.class, args);
    }

}
