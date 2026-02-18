package com.bcnd.stdpostsql.Repository;

import com.bcnd.stdpostsql.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String email);
}
