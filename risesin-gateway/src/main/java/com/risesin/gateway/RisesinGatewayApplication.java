package com.risesin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableHystrix
@EnableScheduling
@SpringCloudApplication
@ComponentScan(basePackages = {"com.risesin.common.*"})
public class RisesinGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RisesinGatewayApplication.class, args);
    }

}
