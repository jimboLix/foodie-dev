package com.jimbolix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ruihui.li
 * @Date: 2019/12/1 19:47
 * @Description:
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
