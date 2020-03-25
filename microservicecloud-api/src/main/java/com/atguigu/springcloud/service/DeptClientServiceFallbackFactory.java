package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 吴聪
 * @Description
 * @ClassName DeptClientServiceFallbackFactory
 * @Date 2020/3/25 0025
 * @Version 1.0
 */

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id)
                        .setDname("id名:" + id + "没有对应信息，服务降级，本地备用方法")
                        .setDb_source("no mysql");
            }
        };
    }
}
