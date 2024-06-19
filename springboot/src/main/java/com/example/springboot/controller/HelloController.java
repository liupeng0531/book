package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试类(最后可以删除)
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }

}
