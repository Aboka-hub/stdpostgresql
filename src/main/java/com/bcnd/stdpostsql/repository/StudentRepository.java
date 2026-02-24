package com.bcnd.stdpostsql.repository;

import com.bcnd.stdpostsql.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String email);
}
