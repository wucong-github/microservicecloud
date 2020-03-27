package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class Config_Git_DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_DeptProvider8001_App.class,args);
    }
}
