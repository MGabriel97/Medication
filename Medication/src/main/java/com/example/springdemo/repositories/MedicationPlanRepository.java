package com.example.springdemo.repositories;

import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.MedicationPlan;
import com.example.springdemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicationPlanRepository extends JpaRepository<MedicationPlan, Integer> {

    
	@Query(value = "SELECT u " +
            "FROM MedicationPlan u " +
            "ORDER BY u.id")
    List<MedicationPlan> getAllOrdered();

    @Query(value = "SELECT p " +
            "FROM MedicationPlan p " +
            "INNER JOIN FETCH p.medications i"
    )
    List<MedicationPlan> getAllFetch();

	MedicationPlan findByPatient(String patient);
}