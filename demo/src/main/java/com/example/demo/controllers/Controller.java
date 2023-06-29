package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class Controller {

    @Autowired
    private StudentService studentService1;

    @GetMapping
    public ResponseEntity<List<Student>> allStudentsEntity() {
        return new ResponseEntity<List<Student>>(studentService1.studentList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudEntity(@Valid Student studentData, BindingResult bindingResult,
            @RequestBody Student student) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<Student>("Invalid Data", HttpStatus.BAD_REQUEST);

        } else {
            return new ResponseEntity<Student>(studentService1.addStudent(student), HttpStatus.OK);
        }

    }

}
