package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 **  @author : Chata
 **  @description : Eureka客户端8211
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication8211 {
    public static void main(String[] args) {
        SpringApplication.run( EurekaClientApplication8211.class, args );
    }
}
