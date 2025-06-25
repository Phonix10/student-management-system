package com.student.student_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student_management_system.entity.Student;
import com.student.student_management_system.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = getStudentById(id);
        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setPhoneNumber(updatedStudent.getPhoneNumber());
        student.setStudentClass(updatedStudent.getStudentClass());
        student.setEmail(updatedStudent.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found");
        }
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        if (studentRepository.count() == 0) {
            throw new RuntimeException("No students in database");
        }
        return studentRepository.findAll();
    }
    
}
