package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @EnableHystrixDashboard 开启 HystrixDashboard 服务监控
 */
@EnableHystrixDashboard
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DeptConsumer9001_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001_DashBoard_App.class, args);
    }

}
