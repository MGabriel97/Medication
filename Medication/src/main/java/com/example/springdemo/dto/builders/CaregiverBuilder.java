package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.entities.Caregiver;

public class CaregiverBuilder {
	 private CaregiverBuilder() {
	    }

	    public static CaregiverDTO generateDTOFromEntity(Caregiver caregiver) {
	        return new CaregiverDTO(
	        		caregiver.getId(),
	        		caregiver.getName(),
	        		caregiver.getBirthdate(),
	        		caregiver.getAddress(),
	        		caregiver.getGender());
	    }

	    public static Caregiver generateEntityFromDTO(CaregiverDTO CaregiverDTO) {
	        return new Caregiver(
	        		CaregiverDTO.getId(),
	        		CaregiverDTO.getName(),
	        		CaregiverDTO.getBirthdate(),
	        		CaregiverDTO.getAddress(),
	        		CaregiverDTO.getGender());
	    }
}
