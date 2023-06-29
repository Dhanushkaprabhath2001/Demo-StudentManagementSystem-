package com.example.demo.repositeries;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Student;

public interface StudentRepositery extends MongoRepository<Student, ObjectId> {

}
