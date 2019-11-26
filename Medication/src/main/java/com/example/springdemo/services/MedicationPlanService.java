package com.example.springdemo.services;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.dto.MedicationPlanWithMedication;
import com.example.springdemo.dto.MedicationViewDTO;
import com.example.springdemo.dto.builders.MedicationPlanBuilder;
import com.example.springdemo.dto.builders.MedicationPlanWithMedicationBuilder;
import com.example.springdemo.dto.builders.MedicationViewBuilder;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.MedicationPlan;
import com.example.springdemo.errorhandler.DuplicateEntryException;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.MedicationPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicationPlanService {

    private final  MedicationPlanRepository medicationPlanRepository;

    @Autowired
    public MedicationPlanService(MedicationPlanRepository medicationPlanRepository) {
		this.medicationPlanRepository = medicationPlanRepository;
    }
    










	public MedicationPlanDTO findPersonById(Integer id){
        Optional<MedicationPlan> person  = medicationPlanRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return MedicationPlanBuilder.generateDTOFromEntity(person.get());
    }


    public List<MedicationPlanWithMedication> findAllFetch(){
        List<MedicationPlan> personList = medicationPlanRepository.getAllFetch();

        return personList.stream()
                .map(x-> MedicationPlanWithMedicationBuilder.generateDTOFromEntity(x, x.getMedication()))
                .collect(Collectors.toList());
    }
    public List<MedicationPlanDTO> findAll(){
        List<MedicationPlan> persons = medicationPlanRepository.getAllOrdered();

        return persons.stream()
                .map(MedicationPlanBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }


   
   

    public Integer insert(MedicationPlanDTO personDTO) {
        

        MedicationPlan person = medicationPlanRepository.findByPatient(personDTO.getPatient());
        if(person != null){
            throw  new DuplicateEntryException("Person", "email", personDTO.getPatient());
        }

        return medicationPlanRepository
                .save(MedicationPlanBuilder.generateEntityFromDTO(personDTO))
                .getId();
    }

   

    
}