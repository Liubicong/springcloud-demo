package com.example.feign.controller;

import com.example.feign.feigninterface.HiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HiInterface hiInterface;

    @RequestMapping("/hi")
    public String hi(){
        return hiInterface.sayhelloclient();
    }
}
