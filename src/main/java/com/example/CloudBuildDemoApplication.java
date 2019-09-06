package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudBuildDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBuildDemoApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Google Cloud Build rocks!!";
    }
}
