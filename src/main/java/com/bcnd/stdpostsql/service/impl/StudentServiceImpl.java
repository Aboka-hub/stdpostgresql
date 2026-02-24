package com.bcnd.stdpostsql.service.impl;

import com.bcnd.stdpostsql.models.Student;
import com.bcnd.stdpostsql.repository.StudentRepository;
import com.bcnd.stdpostsql.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student update(Long id, Student student) {
        Student s = studentRepository.findById(id).orElse(null);
        if (s != null) {
            s.setFirstName(student.getFirstName());
            s.setLastName(student.getLastName());
            s.setEmail(student.getEmail());
            s.setCourses(student.getCourses());
            studentRepository.save(s);
        }
        return s;
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
