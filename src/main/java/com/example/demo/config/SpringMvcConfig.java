package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @program: vhr
 * @description: Spring MVC 配置
 * @author: 全栈者也
 * @create: 2020 - 04 - 25 23:56
 **/
@Configuration
@ComponentScan(basePackages = "com.example.demo",useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringMvcConfig {



}
