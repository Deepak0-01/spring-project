package com.sap.Entity;

import javax.persistence.*;

@Entity
@Table(name="Subject")
public class Subject {

    @Id
    @Column(name="SUB_CODE")
    private int sub_code;
   @Column(name="SUB_NAME")
    private String sub_name;




    public Subject(){
    }

    public Subject(int sub_code, String sub_name) {
        this.sub_code = sub_code;
        this.sub_name = sub_name;
    }

    public int getSub_code() {
        return sub_code;
    }

    public void setSub_code(int sub_code) {
        this.sub_code = sub_code;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
}
