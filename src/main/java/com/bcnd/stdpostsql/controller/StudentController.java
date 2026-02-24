package com.bcnd.stdpostsql.controller;

import com.bcnd.stdpostsql.models.Student;
import com.bcnd.stdpostsql.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.create(student);
    }

    @PostMapping("/{studentId}/courses/{coursesId}")
    public Student save(@PathVariable Long studentId, @PathVariable Long coursesId) {
        return studentService.enroll(studentId, coursesId);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
