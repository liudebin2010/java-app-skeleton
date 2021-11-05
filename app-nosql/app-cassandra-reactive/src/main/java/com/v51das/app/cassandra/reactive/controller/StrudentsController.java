package com.v51das.app.cassandra.reactive.controller;

import com.v51das.app.cassandra.reactive.model.Student;
import com.v51das.app.cassandra.reactive.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StrudentsController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save")
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "success";
    }

    @GetMapping(value = "/all")
    public List<Student> getStudent(){
        return studentService.queryAllStudent();
    }
}
