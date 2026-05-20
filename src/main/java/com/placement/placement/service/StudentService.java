package com.placement.placement.service;

import java.util.List;
import com.placement.placement.entity.Student;

public interface StudentService {

    Student addStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudent(Long id);

    List<Student> getAllStudents();
}
