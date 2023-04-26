package com.kuang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: YangSong
 * @Date: 2023-4-4 10:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OnlineEducationGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineEducationGatewayApplication.class, args);
    }
}
