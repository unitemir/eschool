package com.eschool.studentmanager.service;

import com.eschool.studentmanager.model.Student;
import com.eschool.studentmanager.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo=studentRepo;
    }

    public void addStudent(Student student){studentRepo.insert(student); }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public void deleteStudent(long id){studentRepo.delete(id);}
}
