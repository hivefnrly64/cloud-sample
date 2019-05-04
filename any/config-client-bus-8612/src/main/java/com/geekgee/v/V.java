package com.geekgee.v;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 **  @author : Chata
 **  @description : 
 **  @date : 2019/5/4 07:10
 ***/
@Component
public class V {
    @Value("${foo}")
    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
