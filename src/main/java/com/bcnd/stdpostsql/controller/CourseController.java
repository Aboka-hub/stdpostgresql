package com.bcnd.stdpostsql.controller;

import com.bcnd.stdpostsql.models.Course;
import com.bcnd.stdpostsql.models.Lesson;
import com.bcnd.stdpostsql.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PostMapping("/{courseId}/lessons")
    public Course addLesson(@PathVariable Long courseId, @RequestBody Lesson lesson) {
        return courseService.addLesson(courseId, lesson);
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }


}
