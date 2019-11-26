package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationViewDTO;
import com.example.springdemo.entities.Medication;

public class MedicationViewBuilder {
	 private MedicationViewBuilder() {
	    }

	    public static MedicationViewDTO generateDTOFromEntity(Medication medication) {
	        return new MedicationViewDTO(
	                medication.getId(),
	                medication.getName(),
	                medication.getDosage(),
	                medication.getSideeffects());
	    }

	    public static Medication generateEntityFromDTO(MedicationViewDTO medicationDTO) {
	        return new Medication(
	        		medicationDTO.getId(),
	        		medicationDTO.getName(),
	        		medicationDTO.getDosage(),
	        		medicationDTO.getSideeffects());
	    }
}
