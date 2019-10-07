package com.springcloud.wxk.microservicesimpleconsumermovie.bean;

import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public SpringMvcContract feignContract(){
        return new SpringMvcContract();
    }
}
