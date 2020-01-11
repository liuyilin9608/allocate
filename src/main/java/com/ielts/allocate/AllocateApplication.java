package com.ielts.allocate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ielts.allocate.mapper")
public class AllocateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllocateApplication.class, args);
    }

}
