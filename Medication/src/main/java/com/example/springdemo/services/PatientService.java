package com.example.springdemo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.PatientViewDTO;
import com.example.springdemo.dto.builders.MedicationBuilder;
import com.example.springdemo.dto.builders.PatientBuilder;
import com.example.springdemo.dto.builders.PatientViewBuilder;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.errorhandler.DuplicateEntryException;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.PatientRepository;
import com.example.springdemo.repositories.PatientRepository;

@Service
public class PatientService {
	private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    
    
    
    public PatientViewDTO findPatientById(Integer id){
        Optional<Patient> person  = patientRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return PatientViewBuilder.generateDTOFromEntity(person.get());
    }
    
    public List<PatientViewDTO> findAll(){
        List<Patient> persons = patientRepository.getAllOrdered();

        return persons.stream()
                .map(PatientViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }
    
    
    public Integer insert(PatientDTO PatientDTO) {
        

        Patient person = patientRepository.findByName(PatientDTO.getName());
        if(person != null){
            throw  new DuplicateEntryException("Person", "email", PatientDTO.getName());
        }

        return patientRepository
                .save(PatientBuilder.generateEntityFromDTO(PatientDTO))
                .getId();
    }
    
    public Integer update(PatientDTO patientDTO) {

        Patient person = patientRepository.findByName(patientDTO.getName());


      

        return patientRepository.save(PatientBuilder.generateEntityFromDTO(patientDTO)).getId();
    }

    public void delete(PatientDTO patientDTO){
        this.patientRepository.deleteByName(patientDTO.getName());
    }
}
