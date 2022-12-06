package com.sap.Entity;

import javax.persistence.*;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="Id")
    private int roll_no;

    @Column(name="Name")
    private  String name;

    @Column(name="Age")
    private  int age;

    @Column(name="Company")
    private  String company;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SUB_CODE", referencedColumnName = "sub_code")
    private Subject subject;

    public Student(){

    }

    public Student(int roll_no, String name, int age, String company) {
        this.roll_no = roll_no;
        this.name = name;
        this.age=age;
        this.company=company;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
