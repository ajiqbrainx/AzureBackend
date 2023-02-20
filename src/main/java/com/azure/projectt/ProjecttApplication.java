package com.azure.projectt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjecttApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjecttApplication.class, args);
    }

    @GetMapping("/get")
    public String show() {
        return "Successfully Deplyed";
    }

}
