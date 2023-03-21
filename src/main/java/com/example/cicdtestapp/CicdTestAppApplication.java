package com.example.cicdtestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CicdTestAppApplication {

    @Bean
    public String hellworld(){
        return "helloworld";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdTestAppApplication.class, args);
    }
}
