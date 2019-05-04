package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 **  @author : Chata
 **  @description : Feign客户端8312
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//熔断
@EnableCircuitBreaker
public class FeignClientApplication8312 {
    public static void main(String[] args) {
        SpringApplication.run( FeignClientApplication8312.class, args );
    }
}
