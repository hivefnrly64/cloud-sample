package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/***
 **  @author : Chata
 **  @description : bus8612
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@RefreshScope
public class ConfigClientBusApplication8612 {
    public static void main(String[] args) {
        SpringApplication.run( ConfigClientBusApplication8612.class, args );
    }
}
