package com.sap.StudentRepository;

import com.sap.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findStudentByName(String name);
}
