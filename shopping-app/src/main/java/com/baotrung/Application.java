package com.baotrung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages = {"com.baotrung.core.business","com.baotrung.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}