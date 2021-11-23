package com.example.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ExamModel{

    @Id
    private String name;

    @Column
    private String usn;

    @Column
    private String gender;

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}