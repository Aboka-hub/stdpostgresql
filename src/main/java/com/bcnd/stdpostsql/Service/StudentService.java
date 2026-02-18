package com.bcnd.stdpostsql.Service;

import com.bcnd.stdpostsql.Models.Student;
import com.bcnd.stdpostsql.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
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
            s.setAge(student.getAge()) ;
        }
        return studentRepository.save(s);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
