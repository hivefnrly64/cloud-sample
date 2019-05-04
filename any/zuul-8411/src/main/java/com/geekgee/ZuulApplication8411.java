package com.geekgee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/***
 **  @author : Chata
 **  @description : zuul8411
 **  @date : 2019/5/2 21:06
 ***/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication8411 {
    public static void main(String[] args) {
        SpringApplication.run( ZuulApplication8411.class, args );
    }
}
