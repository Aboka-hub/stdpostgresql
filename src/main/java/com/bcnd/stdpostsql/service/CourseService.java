package com.bcnd.stdpostsql.service;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Lesson;

public interface CourseService {
    public Course getCourse(Long id);
    public Course createCourse(Course course);
    public Course updateCourse(Long id, Course updatedCourse);
    public Course addLesson(Long courseId, Lesson lesson);
}
