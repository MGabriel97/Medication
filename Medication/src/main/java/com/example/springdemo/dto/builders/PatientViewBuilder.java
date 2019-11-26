package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.PatientViewDTO;
import com.example.springdemo.entities.Patient;

public class PatientViewBuilder {
	private PatientViewBuilder() {
    }

    public static PatientViewDTO generateDTOFromEntity(Patient patient){
        return new PatientViewDTO(
        		patient.getId(),
        		patient.getName(),
        		patient.getAddress(),
        		patient.getMedicaldecord());
    }

    public static Patient generateEntityFromDTO(PatientViewDTO patientDTO){
        return new Patient(
        		patientDTO.getId(),
        		patientDTO.getName(),
        		patientDTO.getAddress(),
        		patientDTO.getMedicaldecord());
    }
}
