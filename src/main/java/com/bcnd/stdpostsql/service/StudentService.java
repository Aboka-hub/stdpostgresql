package com.bcnd.stdpostsql.service;

import com.bcnd.stdpostsql.models.Student;

import java.util.List;

public interface StudentService {
    public Student create(Student student);
    public Student getById(Long id);
    public List<Student> getAll();
    public Student update(Long id, Student student);
    public void deleteById(Long id);
}
