package com.eschool.studentmanager.repo;

import com.eschool.studentmanager.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface StudentRepo{
    @Select("SELECT id, name, student_group as studentGroup FROM student")
    List<Student> findAll();

    @Insert("INSERT INTO student (name,student_group) VALUES(#{name}, #{studentGroup})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Student student);

    @Delete("DELETE FROM student WHERE id = #{id}")
    void delete(Long id);
}
