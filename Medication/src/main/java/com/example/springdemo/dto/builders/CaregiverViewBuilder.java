package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.CaregiverViewDTO;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.dto.CaregiverViewDTO;

public class CaregiverViewBuilder {
	private CaregiverViewBuilder() {
    }

    public static CaregiverViewDTO generateDTOFromEntity(Caregiver caregiver) {
        return new CaregiverViewDTO(
        		caregiver.getId(),
        		caregiver.getName());
    }

    public static Caregiver generateEntityFromDTO(CaregiverViewDTO CaregiverViewDTO) {
        return new Caregiver(
        		CaregiverViewDTO.getId(),
        		CaregiverViewDTO.getName());
    }
}
