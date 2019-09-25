package com.risesin.enterpriseuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan("com.risesin.*")
@EnableJpaRepositories(value = "com.risesin.*")
@EntityScan(basePackages = "com.risesin.*")
public class RisesinEnterpriseuserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RisesinEnterpriseuserserviceApplication.class, args);
    }

}
