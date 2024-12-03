package com.example.JPA_Project01.controller;

import com.example.JPA_Project01.entity.Student;
import com.example.JPA_Project01.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // For API creation
@RequestMapping("api/std")
public class StudentController {

    @Autowired
    private StudentService service;

    //this methode for create students details and fetch the data in Database
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){ //RequestBody for Json to Java object

        return service.saveStudent(student);

    }

    //This method for we get or display all the student details.
    @GetMapping("/all")
    public List<Student> getAllStudents(){

        List<Student> allStudentData = service.getAllStudentData();
        return allStudentData;

    }

    //This method for get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){

        return service.getStudentById(id);

    }

    //This method for Update student details and it updated by @Putmapping
    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable Integer id,@RequestBody Student student){

        Student updatedStudent = service.updateStudent(id, student);
        return updatedStudent;

    }

    //This method for delete student details and it updated by @DelelteMapping
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){

        service.deleteStudent(id);
        System.out.println("Delete Successfully");


    }

}
