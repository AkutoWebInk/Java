package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.Student;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
            new Student(
                1L,
                "Alex",
                "alex.foo@gmail.com",
                LocalDate.of(2000,Month.JANUARY, 5),
                21));
    }
}
