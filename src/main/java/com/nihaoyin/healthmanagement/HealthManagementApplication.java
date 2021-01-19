package com.nihaoyin.healthmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/nihaoyin/healthmanagement/dao")
@SpringBootApplication
public class HealthManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthManagementApplication.class, args);
    }

}
