package com.student.student_management_system.service;

import java.util.List;

import com.student.student_management_system.entity.Student;

public interface StudentService {

    Student addStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudents();

}