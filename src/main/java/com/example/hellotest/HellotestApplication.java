package com.example.hellotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hellotest.dao")
public class HellotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellotestApplication.class, args);
    }



}
