package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/***
 **  @author : Chata
 **  @description : configserver8511
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication8511 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigServerApplication8511.class, args );
    }
}
