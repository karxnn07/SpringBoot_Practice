package com.example.CRUDSpringBootDemo.Controller;

import com.example.CRUDSpringBootDemo.Entity.Student;
import com.example.CRUDSpringBootDemo.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println("Inside StudentController");
        Student createdStudent = studentService.createStudent(student);
        System.out.println("Exiting StudentController");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }
}
