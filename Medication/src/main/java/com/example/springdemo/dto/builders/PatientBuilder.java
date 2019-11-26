package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.entities.Person;

public class PatientBuilder {
	private PatientBuilder() {
    }

    public static PatientDTO generateDTOFromEntity(Patient patient){
        return new PatientDTO(
        		patient.getId(),
        		patient.getName(),
        		patient.getBirthdate(),
        		patient.getGender(),
        		patient.getAddress(),
        		patient.getMedicaldecord(),
        		patient.getCaregiver(),
        		patient.getUser());
    }

    public static Patient generateEntityFromDTO(PatientDTO patientDTO){
        return new Patient(
        		patientDTO.getId(),
        		patientDTO.getName(),
        		patientDTO.getBirthdate(),
        		patientDTO.getGender(),
        		patientDTO.getAddress(),
        		patientDTO.getMedicaldecord(),
        		patientDTO.getCaregiver(),
        		patientDTO.getUser());
    }
}
