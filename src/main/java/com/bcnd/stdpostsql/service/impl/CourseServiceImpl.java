package com.bcnd.stdpostsql.service.impl;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Lesson;
import com.bcnd.stdpostsql.repository.CourseRepository;
import com.bcnd.stdpostsql.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public Course getCourse(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course updatedCourse) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        course.setTitle(updatedCourse.getTitle());
        course.setCredits(updatedCourse.getCredits());

        return course;
    }

    @Override
    public Course addLesson(Long courseId, Lesson lesson) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        course.addLesson(lesson);

        return course;
    }
}