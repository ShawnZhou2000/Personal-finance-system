package com.qlu.keshe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qlu.keshe.mapper")
public class KesheApplication {

    public static void main(String[] args) {
        SpringApplication.run(KesheApplication.class, args);
    }

}
