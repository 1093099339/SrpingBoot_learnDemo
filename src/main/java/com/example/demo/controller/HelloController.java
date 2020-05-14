package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: vhr
 * @description: hello springboot
 * @author: 全栈者也
 * @create: 2020 - 04 - 26 00:11
 **/
@RestController
public class HelloController {

        @GetMapping("/hello")
        public String hello(){
            return  "hello springboot";
        }

}
