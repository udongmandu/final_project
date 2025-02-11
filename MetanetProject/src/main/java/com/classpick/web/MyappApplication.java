package com.classpick.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.classpick.web")
@EnableScheduling // 스케줄링 활성화
public class MyappApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

}
