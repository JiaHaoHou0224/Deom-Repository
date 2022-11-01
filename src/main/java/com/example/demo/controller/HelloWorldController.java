package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //web控制器构造型注释，响应浏览器请求。
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello, 后家豪!";
    }
}
