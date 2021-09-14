package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
/*@EntityScan (basePackages = "com.example.demo")
@EnableJpaRepositories
@RestController*/

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}

