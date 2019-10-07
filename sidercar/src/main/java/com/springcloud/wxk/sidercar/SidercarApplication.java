package com.springcloud.wxk.sidercar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidercarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidercarApplication.class, args);
    }

}
