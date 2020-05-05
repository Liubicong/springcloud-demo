package com.example.feign.feigninterface;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client1")
public interface HiInterface {
    @RequestMapping(value = "/hi")
    String sayhelloclient();
}
