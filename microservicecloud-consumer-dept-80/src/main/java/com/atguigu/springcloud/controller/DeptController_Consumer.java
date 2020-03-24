package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用 RestTemplate 访问restful接口非常简单
     * （url,        requestMap, ResponseBean.class）
     * rest请求路径  请求参数      返回的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/hello")
    public String hello(){
        return "你好。。。。";
    }



    @PostMapping("/consumer/add")
    public boolean add(Dept dept){
        Dept dept1 = restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Dept.class);
            return true;
    }

    @GetMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") int id){
       return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class, id);

    }
    

    @GetMapping("/consumer/list")
    public List<Dept> list() {
        //注意是 List.class
         return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    // 测试@EnableDiscoveryClient ,消费端可以调用服务发现
    @GetMapping("/consumer/discovery")
    public Object discovery() {

        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);

    }




}
