package com.kuang.staservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description:
 * @Author: YangSong
 * @Date: 2023-4-4 19:08
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kuang"})
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.kuang.staservice.mapper")
@EnableScheduling//开启定时任务
public class ServiceStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStatisticsApplication.class, args);
    }
}
