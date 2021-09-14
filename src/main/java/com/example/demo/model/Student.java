package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
//@AllArgsConstructor
@Builder
@NoArgsConstructor


@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name="Student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue (strategy = GenerationType.SEQUENCE,
            generator = "student_sequence")
    private Long id;

    @Column (name ="name")
    private String name;

    @Column (name ="email")
    private String email;

    @Column (name = "data_of_birthday")
    private LocalDate dateOfBirthday;

    @Column (name = "age")
    @Transient
    private Integer age;





    public Student(Long id, String name, String email, LocalDate dateOfBirthday, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirthday = dateOfBirthday;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dateOfBirthday, Integer age) {
        this.name = name;
        this.email = email;
        this.dateOfBirthday = dateOfBirthday;
        this.age = age;
    }



    public Integer getAge() {
        return Period.between(this.dateOfBirthday, LocalDate.now()).getYears();
    }
}
