package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositeries.StudentRepositery;

@Service
public class StudentService {

    @Autowired
    private StudentRepositery studentRepositery1;

    public List<Student> studentList() {
        List<Student> students = studentRepositery1.findAll();
        return students;
    }

    public Student addStudent(Student student1) {
        return studentRepositery1.save(student1);

    }

}
