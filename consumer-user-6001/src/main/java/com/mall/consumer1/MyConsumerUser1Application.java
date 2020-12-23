package com.mall.consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Zhang ZhiJie
 * @Date: 2020/12/22 17:06
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MyConsumerUser1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyConsumerUser1Application.class, args);
    }
}
