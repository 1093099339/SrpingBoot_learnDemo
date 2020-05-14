package com.example.demo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program: vhr
 * @description: 配置 web.xml
 * @author: 全栈者也
 * @create: 2020 - 04 - 26 00:01
 **/
public class WebInit implements WebApplicationInitializer {

        @Override
        public  void onStartup(ServletContext servletContext){

            //首先来加载的 SpringMVC的配置文件
            AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
            ctx.register(SpringMvcConfig.class);

            //添加 DispatcherServlet
            ServletRegistration.Dynamic springMVC = servletContext.addServlet("springMVC",new DispatcherServlet(ctx));

            //给 DispatcherServlet 添加路径映射
            springMVC.addMapping("/");

            //给 DispatcherServlet 添加启动时机
            springMVC.setLoadOnStartup(1);

        }

}
