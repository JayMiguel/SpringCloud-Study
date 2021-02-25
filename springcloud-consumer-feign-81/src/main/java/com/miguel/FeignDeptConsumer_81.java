package com.miguel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.miguel")
public class FeignDeptConsumer_81 {

    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_81.class, args);
    }

}
