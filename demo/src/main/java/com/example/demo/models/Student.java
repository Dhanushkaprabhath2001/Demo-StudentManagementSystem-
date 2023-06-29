package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.IndexOptions.Unique;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    @Indexed(unique = true)
    private ObjectId id;

    private String name;

    @Min(18)
    @Max(50)
    @NotNull(message = "Input rate should insert")
    private Number age;

    @Indexed(unique = true)
    private String studentID;

}
