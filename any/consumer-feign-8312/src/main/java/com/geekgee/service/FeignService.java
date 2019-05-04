package com.geekgee.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("EUREKA-CLIENT")
public interface FeignService {
    @GetMapping("/hi")
    public String feignHi(@RequestParam("name") String name);
}
