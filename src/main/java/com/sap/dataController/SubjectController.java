package com.sap.dataController;
import com.sap.Entity.Subject;
import com.sap.StudentRepository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectRepo subjectrepo;

    @PostMapping("/add-subject")
    public String addStudent(@RequestBody Subject subject){

       subjectrepo.save(subject);

       return  "Subject saved successfully";
    }

    @GetMapping("/subjects")

    public List<Subject> getAllSubjects(){

        return subjectrepo.findAll();
    }



}
