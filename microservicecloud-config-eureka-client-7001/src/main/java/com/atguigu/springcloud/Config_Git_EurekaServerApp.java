package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  Eureka 服务器启动类，接收其他微服务注册进来
 */
@EnableEurekaServer
@SpringBootApplication
public class Config_Git_EurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApp.class,args);
    }

}
