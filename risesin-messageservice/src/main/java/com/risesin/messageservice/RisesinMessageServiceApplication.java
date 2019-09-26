package com.risesin.messageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @AUTHOR Darling
 * @CREATE 2019-09-26
 * @DESCRIPTION TODO
 * @since 1.0.0
 */

@SpringBootApplication
public class RisesinMessageServiceApplication {
    public static void main(String[] args) {
        System.out.println("{\"code\":\"123456\"}");
        SpringApplication.run(RisesinMessageServiceApplication.class, args);
    }
}
