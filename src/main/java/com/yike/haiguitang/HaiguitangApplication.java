package com.yike.haiguitang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yike.haiguitang.mapper")
public class HaiguitangApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaiguitangApplication.class, args);
    }

}
