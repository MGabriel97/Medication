package com.example.springdemo.services;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationViewDTO;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.dto.builders.MedicationBuilder;
import com.example.springdemo.dto.builders.MedicationViewBuilder;
import com.example.springdemo.dto.builders.PersonBuilder;
import com.example.springdemo.dto.builders.PersonViewBuilder;
import com.example.springdemo.dto.builders.PersonWithItemsBuilder;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Person;
import com.example.springdemo.errorhandler.DuplicateEntryException;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.MedicationRepository;
import com.example.springdemo.repositories.PersonRepository;
import com.example.springdemo.validators.PersonFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicationService {

    private final MedicationRepository medicationRepository;

    @Autowired
    public MedicationService(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }
    
    
    
    public MedicationViewDTO findMedicationById(Integer id){
        Optional<Medication> person  = medicationRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return MedicationViewBuilder.generateDTOFromEntity(person.get());
    }
    
    public List<MedicationViewDTO> findAll(){
        List<Medication> persons = medicationRepository.getAllOrdered();

        return persons.stream()
                .map(MedicationViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }
    
    
    public Integer insert(MedicationDTO medicationDTO) {
        

        Medication person = medicationRepository.findByName(medicationDTO.getName());
        if(person != null){
            throw  new DuplicateEntryException("Person", "email", medicationDTO.getName());
        }

        return medicationRepository
                .save(MedicationBuilder.generateEntityFromDTO(medicationDTO))
                .getId();
    }
    
    public Integer update(MedicationDTO medicationDTO) {

        Optional<Medication> person = medicationRepository.findById(medicationDTO.getId());

        if(!person.isPresent()){
            throw new ResourceNotFoundException("Person", "user id", medicationDTO.getId().toString());
        }
      

        return medicationRepository.save(MedicationBuilder.generateEntityFromDTO(medicationDTO)).getId();
    }

    public void delete(MedicationDTO medicationDTO){
        this.medicationRepository.deleteByName(medicationDTO.getName());
    }

}