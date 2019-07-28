package com.cms.scaffold.route.operate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zhangjiaheng
 */
@SpringBootApplication(scanBasePackages = {"com.cms.scaffold.route.operate"})
@EnableAsync
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {})
@EnableHystrix
public class RouteOperateApplication {
    public static void main(String[] args) {
        System.setProperty("projectName", "scaffold-route-operate");
        SpringApplication.run(RouteOperateApplication.class, args);
    }


}