package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

  /*  @Bean
    public IRule myRule(){
//        return new RandomRule(); //定义为RandomRule ,测试一下
        return new RoundRobinRule_ZHF();//自定义负载均衡方式
    }*/



    @Bean
    public IRule myRule(){
        return new RandomRule();  // 用我们重新选择的随机算法，替代轮询
    }
}
