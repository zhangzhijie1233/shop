package com.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/23 11:27
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyOrderApplication.class, args);
    }

}
