package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationViewDTO;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.services.MedicationService;
import com.example.springdemo.services.PersonService;

@RestController
@CrossOrigin
@RequestMapping(value = "/medication")
public class MedicationController {
	 private final MedicationService medicationService;
	 
	 @Autowired
	    public MedicationController(MedicationService medicationService) {
	        this.medicationService = medicationService;
	    }
	 
	 @GetMapping(value = "/{id}")
	    public MedicationViewDTO findById(@PathVariable("id") Integer id){
	        return medicationService.findMedicationById(id);
	    }
	 
	 @GetMapping(value = "/all")
	    public List<MedicationViewDTO> findAll(){
	        return medicationService.findAll();
	    }
	 
	 @PostMapping(value = "register")
	    public Integer insertPersonDTO(@RequestBody MedicationDTO medicationDTO){
	        return medicationService.insert(medicationDTO);
	    }
	 
	 @PutMapping(value = "update")
	    public Integer updatePerson(@RequestBody MedicationDTO medicationDTO) {
	        return medicationService.update(medicationDTO);
	    }

    @DeleteMapping(value = "delete")
	    public void delete(@RequestBody MedicationDTO medicationDTO){
	    	medicationService.delete(medicationDTO);
	    }
}
