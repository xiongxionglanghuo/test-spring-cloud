package com.springcloud.wxk.microservicesimpleprovideuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProvideUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProvideUserApplication.class, args);
    }

}
