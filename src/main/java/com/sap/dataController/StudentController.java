package com.sap.dataController;

import com.sap.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sap.Entity.Student;

import java.util.List;

@RestController
public class StudentController {


    private final StudentService studentservice;

    @Autowired
    public StudentController(StudentService studentservice){
        this.studentservice = studentservice;
    }

    @PostMapping("/add-student")
    public Student addStudent( @RequestBody Student student){

        return studentservice.addStudent(student);
    }

    @PostMapping("/add-students")
    public String addAllStudents( @RequestBody List<Student> students){

        return studentservice.saveAllStudent(students);
    }

    @GetMapping("/student/{name}")

    public Student getStudentById(@PathVariable  String name){
        return studentservice.getStudentByName(name);
    }

    @GetMapping("/students")

    public List<Student> getAllStudent(){
        return studentservice.getAllStudent();
    }

    @GetMapping("/student")

    public String sayHi(){
        return "Hi Deepak";
    }




}
