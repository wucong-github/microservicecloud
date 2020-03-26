package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 *  @EnableZuulProxy  开启Zuul代理
 */

@EnableZuulProxy
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Zuul_9527_App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_App.class, args);
    }

}
