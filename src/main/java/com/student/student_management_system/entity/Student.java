package com.student.student_management_system.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollmentid")
    private Long id;

    @Column(nullable = false)
    private String name;

    private int age;

    @Column(length = 10, nullable = false)
    private String phoneNumber;

    private String studentClass;

    @Column(unique = true, nullable = false)
    private String email;
    
}
