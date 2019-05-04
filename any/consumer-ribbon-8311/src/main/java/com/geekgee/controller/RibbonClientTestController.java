package com.geekgee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/***
 **  @author : Chata
 **  @description : 
 **  @date : 2019/5/2 23:56
 ***/
@RestController
public class RibbonClientTestController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX="http://EUREKA-CLIENT";

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name){
        System.out.println("ribbon~~~~~~~~~~~~~~~~~~~~");
        return restTemplate.getForObject(REST_URL_PREFIX+"/hi?name="+name,String.class);
    }
}
