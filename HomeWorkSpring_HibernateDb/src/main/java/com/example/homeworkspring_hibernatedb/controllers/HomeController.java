package com.example.homeworkspring_hibernatedb.controllers;

import com.example.homeworkspring_hibernatedb.entity.Students;
import com.example.homeworkspring_hibernatedb.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
@Autowired
    StudentsRepository studentsRepository;

    public HomeController() {

    }

    @PostMapping("/")
    public Students createStudent(@RequestBody Students student) {
        return studentsRepository.save(student);
    }

    @GetMapping("/")
    public Iterable<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable("Id") int id) {
        return studentsRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Students updateStudent(@PathVariable("Id") int id, @RequestBody Students student) {
        student.setId(id);
        return studentsRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("Id") int id) {
        studentsRepository.deleteById(id);
    }
}
