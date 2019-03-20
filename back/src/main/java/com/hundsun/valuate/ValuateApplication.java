package com.hundsun.valuate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hundsun.valuate.dao")
public class ValuateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValuateApplication.class, args);
    }

}
