package com.kuang.smsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
@ComponentScan(basePackages = {"com.kuang"})
public class ServiceSmsApplication {
    //15645026572
    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}