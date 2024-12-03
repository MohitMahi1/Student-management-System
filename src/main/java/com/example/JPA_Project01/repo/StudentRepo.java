package com.example.JPA_Project01.repo;

import com.example.JPA_Project01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Secondly we create an Interface in repo package for persistence

@Repository // It is not necessary but recommended to write
public interface StudentRepo extends JpaRepository<Student, Integer> { //It extends JpaRepository and it takes which table it is and the @Id is which type

    // Here JPA will provides predefine methods


}
