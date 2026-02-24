package com.bcnd.stdpostsql.service;

import com.bcnd.stdpostsql.models.Student;

import java.util.List;

public interface StudentService {
    Student getById(Long id);
    Student create(Student student);
    Student enroll(Long studentId, Long courseId);
    void deleteById(Long id);
}
