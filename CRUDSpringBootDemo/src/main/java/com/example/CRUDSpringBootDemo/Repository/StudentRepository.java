package com.example.CRUDSpringBootDemo.Repository;

import com.example.CRUDSpringBootDemo.Entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student studentReq) {
        System.out.println("Inside StudentRepository");
        System.out.println("Exiting StudentRepository");

        Student s1 = new Student();
        s1.setName("Karan");
        s1.setAge(22);
        s1.setEmail("karxnn007@gmail.com");
        s1.setRollNo(101);
        s1.setSubject("Java");

        return s1;
    }
}
