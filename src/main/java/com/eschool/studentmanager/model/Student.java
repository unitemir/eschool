package com.eschool.studentmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String studentGroup;

    public Student(String name, String group) {
        this.name = name;
        this.studentGroup = group;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentGroup='" + studentGroup + '\'' +
                '}';
    }
}