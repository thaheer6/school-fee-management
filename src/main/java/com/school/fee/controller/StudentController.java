package com.school.fee.controller;

import com.school.fee.entity.Student;
import com.school.fee.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student addOrUpdateStudent(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.delete(id);
    }
}
