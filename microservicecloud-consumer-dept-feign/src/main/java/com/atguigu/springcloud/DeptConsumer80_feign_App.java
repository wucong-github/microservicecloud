package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *  @EnableFeignClients 开启Feign 负载均衡
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumer80_feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign_App.class, args);
    }

}
