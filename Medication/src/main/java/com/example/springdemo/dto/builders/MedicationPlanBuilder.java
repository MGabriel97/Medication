package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.entities.MedicationPlan;

public class MedicationPlanBuilder {
	 private MedicationPlanBuilder() {
	    }

	    public static MedicationPlanDTO generateDTOFromEntity(MedicationPlan medication) {
	        return new MedicationPlanDTO(
	        		medication.getId(),
	                medication.getPatient(),
	                medication.getIntakeinterval());
	    }

	    public static MedicationPlan generateEntityFromDTO(MedicationPlanDTO medicationDTO) {
	        return new MedicationPlan(
	        		medicationDTO.getId(),
	        		medicationDTO.getPatient(),
	        		medicationDTO.getIntakeinterval());
	    }
}
