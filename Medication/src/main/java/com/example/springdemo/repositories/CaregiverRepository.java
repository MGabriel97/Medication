package com.example.springdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Person;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {
	
	Caregiver findByName(String name);

    @Query(value = "SELECT u " +
            "FROM Caregiver u " +
            "ORDER BY u.name")
    List<Caregiver> getAllOrdered();
    
    @Transactional
    @Modifying
    @Query("delete from Caregiver b where b.name=:#{#name}")
    void deleteByName(@Param("name") String name);
}