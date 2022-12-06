package com.sap.StudentService;

import com.sap.Entity.Student;
import com.sap.StudentRepository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    StudentRepo studentRepository;

     @Autowired
    public StudentService(StudentRepo studentRepository){
        this.studentRepository = studentRepository;
    }

    public  Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    public String saveAllStudent(List<Student>students)
    {
         studentRepository.saveAll(students);

         return "Data saved Successfully";
    }

    public Student getStudentByName(String name)
    {
        return studentRepository.findStudentByName(name);
    }

}
