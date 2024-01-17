package com.springboot.boardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringbootBoardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBoardProjectApplication.class, args);
    }

}
