package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeptController_Consumer {

    /**
     * 引入 基础模块的Service 方法，进行负载均衡访问
     */
    @Autowired
    private DeptClientService deptFeign;

    @GetMapping("/consumer/list")
    public List<Dept> list() {

        return deptFeign.list();
    }


    @GetMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptFeign.get(id);
    }


}
