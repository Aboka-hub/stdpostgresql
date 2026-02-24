package com.bcnd.stdpostsql.service.impl;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Student;
import com.bcnd.stdpostsql.repository.CourseRepository;
import com.bcnd.stdpostsql.repository.StudentRepository;
import com.bcnd.stdpostsql.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    @Override
    public Student enroll(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        Course course = courseRepository.findById(courseId).orElseThrow();

        student.addCourse(course);
        return student;
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
