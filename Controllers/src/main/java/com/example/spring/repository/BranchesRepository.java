package com.example.spring.repository;

import com.example.spring.entity.Branches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BranchesRepository extends JpaRepository<Branches,String> {
    List<Branches> findFirstByCreationDateIsBetween(LocalDateTime start,LocalDateTime end);


    @Query(value = "SELECT * FROM Branches WHERE Branches.name = :name",nativeQuery = true)
    List<Branches> findAll(@Param("name") String ok);
}
