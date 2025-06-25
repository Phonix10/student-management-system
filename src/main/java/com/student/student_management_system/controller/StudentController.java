package com.student.student_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.student_management_system.entity.Student;
import com.student.student_management_system.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    
    @PostMapping()
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        Student created = studentService.addStudent(student);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }




    
}
