package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringMybatisTgdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisTgdemoApplication.class, args);

        System.out.println(" 项目启动  ~~~ ");
    }

}
