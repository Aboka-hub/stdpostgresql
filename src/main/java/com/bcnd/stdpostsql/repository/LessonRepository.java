package com.bcnd.stdpostsql.repository;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
