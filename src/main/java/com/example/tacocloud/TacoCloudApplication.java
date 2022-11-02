package com.example.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TacoCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }
}
