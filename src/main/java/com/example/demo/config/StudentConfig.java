package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
       CommandLineRunner commandLineRunner(StudentRepository repository) {
           return args -> {

                   Student anton = new Student(

                           "Anton",
                           "anton@mail.com",
                           LocalDate.of(2000,Month.APRIL, 5),21 );

               Student alex = new Student(

                       "Alex",
                       "alex@mail.com",
                       LocalDate.of(2001,Month.APRIL, 3),20 );
               repository.saveAll(
                       List.of(anton, alex)
               );





               };
           };
       }


