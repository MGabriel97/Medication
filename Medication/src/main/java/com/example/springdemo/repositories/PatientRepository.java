package com.example.springdemo.repositories;

import com.example.springdemo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;





@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	Patient findByName(String name);

    @Query(value = "SELECT u " +
            "FROM Patient u " +
            "ORDER BY u.name")
    List<Patient> getAllOrdered();
    
    @Transactional
    @Modifying
    @Query("delete from Patient b where b.name=:#{#name}")
    void deleteByName(@Param("name") String name);
}