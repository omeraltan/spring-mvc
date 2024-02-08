package com.spring.mvc.studies.controller;

import com.spring.mvc.studies.forms.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

    @GetMapping(value = "/student/{studentId}")
    public Student getTestData(@PathVariable Integer studentId){
        Student student = new Student();
        student.setName("Peter");
        student.setId(studentId);

        return student;
    }


}
