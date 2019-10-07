package com.springcloud.wxk.microservicesimpleprovideuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProvideUserApplication {


    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvideUserApplication.class, args);
    }

}
