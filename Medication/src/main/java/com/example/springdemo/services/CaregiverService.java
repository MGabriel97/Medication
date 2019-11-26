package com.example.springdemo.services;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.CaregiverViewDTO;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.dto.builders.CaregiverBuilder;
import com.example.springdemo.dto.builders.CaregiverViewBuilder;
import com.example.springdemo.dto.builders.PersonBuilder;
import com.example.springdemo.dto.builders.PersonViewBuilder;
import com.example.springdemo.dto.builders.PersonWithItemsBuilder;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Person;
import com.example.springdemo.errorhandler.DuplicateEntryException;
import com.example.springdemo.errorhandler.ResourceNotFoundException;
import com.example.springdemo.repositories.CaregiverRepository;
import com.example.springdemo.repositories.PersonRepository;
import com.example.springdemo.validators.PersonFieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CaregiverService {

    private final CaregiverRepository CaregiverRepository;

    @Autowired
    public CaregiverService(CaregiverRepository CaregiverRepository) {
        this.CaregiverRepository = CaregiverRepository;
    }
    
    
    
    public CaregiverViewDTO findCaregiverById(Integer id){
        Optional<Caregiver> person  = CaregiverRepository.findById(id);

        if (!person.isPresent()) {
            throw new ResourceNotFoundException("Person", "user id", id);
        }
        return CaregiverViewBuilder.generateDTOFromEntity(person.get());
    }
    
    public List<CaregiverViewDTO> findAll(){
        List<Caregiver> persons = CaregiverRepository.getAllOrdered();

        return persons.stream()
                .map(CaregiverViewBuilder::generateDTOFromEntity)
                .collect(Collectors.toList());
    }
    
    
    public Integer insert(CaregiverDTO CaregiverDTO) {
        

        Caregiver person = CaregiverRepository.findByName(CaregiverDTO.getName());
        if(person != null){
            throw  new DuplicateEntryException("Person", "email", CaregiverDTO.getName());
        }

        return CaregiverRepository
                .save(CaregiverBuilder.generateEntityFromDTO(CaregiverDTO))
                .getId();
    }
    
    public Integer update(CaregiverDTO CaregiverDTO) {

        Optional<Caregiver> person = CaregiverRepository.findById(CaregiverDTO.getId());

        
      

        return CaregiverRepository.save(CaregiverBuilder.generateEntityFromDTO(CaregiverDTO)).getId();
    }

    public void delete(CaregiverDTO CaregiverDTO){
        this.CaregiverRepository.deleteByName(CaregiverDTO.getName());
    }

}