package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.ItemDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.entities.Item;
import com.example.springdemo.entities.Medication;

public class MedicationBuilder {
	 private MedicationBuilder() {
	    }

	    public static MedicationDTO generateDTOFromEntity(Medication medication) {
	        return new MedicationDTO(
	                medication.getId(),
	                medication.getName(),
	                medication.getSideeffects(),
	                medication.getDosage());
	    }

	    public static Medication generateEntityFromDTO(MedicationDTO medicationDTO) {
	        return new Medication(
	        		medicationDTO.getId(),
	        		medicationDTO.getName(),
	        		medicationDTO.getSideeffects(),
	        		medicationDTO.getDosage());
	    }
}
