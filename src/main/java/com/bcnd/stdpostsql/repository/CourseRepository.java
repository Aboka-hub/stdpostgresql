package com.bcnd.stdpostsql.repository;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {
}