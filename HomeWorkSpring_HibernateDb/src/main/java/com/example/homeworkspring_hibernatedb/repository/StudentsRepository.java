package com.example.homeworkspring_hibernatedb.repository;

import com.example.homeworkspring_hibernatedb.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

    /*List<Students> findAllByLastName(String lastName);


    @Query(value = "SELECT * FROM Students WHERE Students.firstName = :firstName", nativeQuery = true)
    List<Students> findAll(@Param("firstName") String firstName);*/
}
