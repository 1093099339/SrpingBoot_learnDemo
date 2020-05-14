package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @program: vhr
 * @description: spring  配置
 * @author: 全栈者也
 * @create: 2020 - 04 - 25 23:43
 **/
@Configuration
        @ComponentScan(basePackages = "com.example.demo",useDefaultFilters = true,
                excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {

    /**
     * @Configuration 注解表示这是一个配置类，在我们这里，这个配置的作用类似于 applicationContext.xmlx
     * @ComponentScan 注解表示配置包扫描，里面的属性和 xml 配置中的属性都是一一对应的
     * useDefaultFilters 表示使用默认的过滤器，然后又除去 Controller 注解， 即在 Spring 容器中扫描除了
     *  Controller 之外的其它所有的 bean
     */



}
