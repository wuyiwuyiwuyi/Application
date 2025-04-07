package com.business.applicationserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationServiceProviderApplication {

    public static void main(String[] args) {
        System.out.println("开始启动");
        SpringApplication.run(ApplicationServiceProviderApplication.class, args);
        System.out.println("启动成功");
    }

}
