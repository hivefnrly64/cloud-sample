package com.geekgee.controller;

import com.geekgee.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 **  @author : Chata
 **  @description : 
 **  @date : 2019/5/2 23:56
 ***/
@RestController
public class FeignClientTestController {

    @Autowired
    private FeignService feignService;

    private static final String REST_URL_PREFIX="http://EUREKA-CLIENT";

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "emm")
    public String hi(@RequestParam("name") String name){
        System.out.println("feign~~~~~~~~~~~~~~~~~~~~");
        return feignService.feignHi(name);
    }

    public String emm(String name){
        return "sorry,"+name+" server is down";
    }
}
