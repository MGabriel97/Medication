package com.example.springdemo.dto.builders;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springdemo.dto.ItemDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.dto.MedicationPlanWithMedication;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.entities.Item;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.MedicationPlan;
import com.example.springdemo.entities.Person;

public class MedicationPlanWithMedicationBuilder {
	 private MedicationPlanWithMedicationBuilder(){}

	    public static MedicationPlanWithMedication generateDTOFromEntity(MedicationPlan medicationPlan, List<Medication> medication){
	        List<MedicationDTO> dtos =  medication.stream()
	                .map(MedicationBuilder::generateDTOFromEntity)
	                .collect(Collectors.toList());

	        return new MedicationPlanWithMedication(
	        		medicationPlan.getId(),
	        		medicationPlan.getPatient(),
	        		medicationPlan.getIntakeinterval(),
	                dtos);
	    }
}
