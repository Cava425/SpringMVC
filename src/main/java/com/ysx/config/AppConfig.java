package com.ysx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class AppConfig extends WebMvcConfigurationSupport {

    // 继承WebMvcConfigurationSupport是为了配置SpringMVC，初始化时并不需要

}
