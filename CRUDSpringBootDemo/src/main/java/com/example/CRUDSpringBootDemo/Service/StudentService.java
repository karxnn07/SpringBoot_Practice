package com.example.CRUDSpringBootDemo.Service;

import com.example.CRUDSpringBootDemo.Entity.Student;
import com.example.CRUDSpringBootDemo.Repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {

        System.out.println("Inside StudentService");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting StudentService");
        return studentResp;
    }
}
