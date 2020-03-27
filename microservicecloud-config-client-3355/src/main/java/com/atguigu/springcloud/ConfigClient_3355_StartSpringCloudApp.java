package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  有bootstrap.yml配置文件, 启动后会自动向3344端口请求配置文件，
 *  3344端口连接到 GitHub 的仓库，通过microservicecloud-config-client-dev 这个文件名
 *  读取到相关配置，返回给 Config 客户端
 */
@SpringBootApplication
public class ConfigClient_3355_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_3355_StartSpringCloudApp.class, args);
    }

}
