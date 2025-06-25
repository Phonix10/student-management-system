package com.student.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.student_management_system.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
