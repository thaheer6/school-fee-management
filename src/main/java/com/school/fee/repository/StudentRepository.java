package com.school.fee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.school.fee.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
