package com.geekgee.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/***
 **  @author : Chata
 **  @description : ribbon-config
 **  @date : 2019/5/3 09:16
 ***/
@Configuration
public class ConfigBean {

    /**
     * Ribbon客户端负载均衡，默认轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
  /*  @Bean
    public IRule myRule(){
        return new RandomRule();
    }*/
}
