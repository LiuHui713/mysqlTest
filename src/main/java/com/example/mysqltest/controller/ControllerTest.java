package com.example.mysqltest.controller;

import com.example.mysqltest.dao.StudentRepository;
import com.example.mysqltest.entity.Student;
import com.example.mysqltest.entity.Teacher;

import com.example.mysqltest.dao.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("/student")
    public Student insertStudent(Student student){
        Student save = studentRepository.save(student);
        return save;
    }

    @GetMapping("/teacher")
    public Teacher insertTeacher(Teacher teacher){
        Teacher save = teacherRepository.save(teacher);
        return save;
    }

}
