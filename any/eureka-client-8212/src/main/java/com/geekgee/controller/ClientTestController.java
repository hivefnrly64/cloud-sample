package com.geekgee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 **  @author : Chata
 **  @description : 
 **  @date : 2019/5/2 23:56
 ***/
@RestController
public class ClientTestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return "hi:"+name+",---from ClientTestController 8212-->";
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-CLIENT-8212");
        instances.forEach(i->{
            System.out.println(i.getServiceId()+":"+i.getHost()+":"+i.getPort()+":"+i.getUri());
        });
        return this.discoveryClient;
    }
}
