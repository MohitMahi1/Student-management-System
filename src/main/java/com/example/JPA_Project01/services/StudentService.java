package com.example.JPA_Project01.services;

//thirdly we create class in service package for all method service

import com.example.JPA_Project01.entity.Student;
import com.example.JPA_Project01.repo.StudentRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){

        return studentRepo.save(student);
    }

    public List<Student> getAllStudentData(){

        List<Student> list = studentRepo.findAll();
        return list;
    }

    public Student getStudentById(Integer id){

        Optional<Student> byId = studentRepo.findById(id);
        Student student = byId.get();
        return student;

    }

    public Student updateStudent(Integer id, Student student){

        Optional<Student> studentById = studentRepo.findById(id);

        Student stud = null;
        if(studentById.isPresent()){
            Student dbStudentObject = studentById.get();
            dbStudentObject.setName(student.getName());
            dbStudentObject.setEmail(student.getEmail());
            dbStudentObject.setPhoneNum(student.getPhoneNum());

            stud = studentRepo.save(dbStudentObject);


        }
        else{
            System.out.println("Data not Present in the DB");
        }
        return stud;

    }

    public void deleteStudent(Integer id){

        studentRepo.deleteById(id);

    }
}
