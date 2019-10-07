package com.springcloud.wxk.springcloudstartereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStarterEurekaServerHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterEurekaServerHaApplication.class, args);
    }

}
