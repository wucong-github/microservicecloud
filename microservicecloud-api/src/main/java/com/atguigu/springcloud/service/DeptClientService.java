package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 吴聪
 * @Description
 * @ClassName DeptClientService
 * @Date 2020/3/25 0025
 * @Version 1.0
 */

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @GetMapping("/dept/list")
    public List<Dept> list();

}
