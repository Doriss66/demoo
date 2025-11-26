package com.example.demoo.controller;

import com.example.demoo.model.Student;
import com.example.demoo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot demoo deployed on Render!";
    }
}