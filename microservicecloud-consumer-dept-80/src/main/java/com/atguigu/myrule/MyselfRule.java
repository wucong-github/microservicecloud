package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule(); //定义为RandomRule ,测试一下
        return new RoundRobinRule_ZHF();//自定义负载均衡方式
    }
}
