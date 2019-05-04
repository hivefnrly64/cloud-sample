package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 **  @author : Chata
 **  @description : Eureka服务端8112
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication8112 {
    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication8112.class, args );
    }
}
