package com.risesin.systemuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.risesin.service_api.modules.*"})
@ComponentScan(basePackages = {"com.risesin.systemuserservice.*", "com.risesin.service.*"})
@EnableJpaRepositories(value = "com.risesin.service_api.dao.*")
public class RisesinSystemuserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RisesinSystemuserserviceApplication.class, args);
    }

}
