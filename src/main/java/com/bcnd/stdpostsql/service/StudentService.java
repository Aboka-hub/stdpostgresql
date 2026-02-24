package com.bcnd.stdpostsql.service;

import com.bcnd.stdpostsql.models.Student;
import com.bcnd.stdpostsql.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student update(Long id, Student student) {
        Student s = studentRepository.findById(id).orElse(null);
        if (s != null) {
            s.setFirstName(student.getFirstName());
            s.setLastName(student.getLastName());
            s.setEmail(student.getEmail());
        }
        return studentRepository.save(s);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
