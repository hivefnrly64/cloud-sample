package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 **  @author : Chata
 **  @description : Eureka服务端8111
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication8111 {
    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication8111.class, args );
    }
}
