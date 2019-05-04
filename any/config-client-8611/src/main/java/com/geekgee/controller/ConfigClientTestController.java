package com.geekgee.controller;

import com.geekgee.v.V;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 **  @author : Chata
 **  @description :
 **  @date : 2019/5/4 07:11
 ***/
@RestController
public class ConfigClientTestController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private V v;
    @GetMapping("/emm")
    public String emm(){
        return v.getFoo();
    }
}
