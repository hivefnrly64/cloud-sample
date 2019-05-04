package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 **  @author : Chata
 **  @description : Ribbon客户端8212
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientApplication8311 {
    public static void main(String[] args) {
        SpringApplication.run( RibbonClientApplication8311.class, args );
    }
}
