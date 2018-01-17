package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 *@SpringBootApplication是一个组合注解等同于下面的三个
 * 1：@Configuration
 * 2: @EnableAutoConfiguration
 * 3: @ComponentScan等
 * @author sls
 * @date 2018/1/2
 */

@EnableEurekaClient
@SpringBootApplication
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
