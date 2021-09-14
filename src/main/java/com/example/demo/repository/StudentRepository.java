package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {



    //SQL//SELECT *From student  WHERE email =?
    @Query("SELECT s FROM Student s where  s.email =?1")
    Optional<Student> findStudentByEmail(String email);


}
