package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.dto.MedicationPlanWithMedication;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.dto.PersonWithItemsDTO;
import com.example.springdemo.services.MedicationPlanService;
import com.example.springdemo.services.MedicationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/medicationplan")
public class MedicationPlanController {

	
	private final MedicationPlanService medicationPlanService;
	 
	 @Autowired
	    public MedicationPlanController(MedicationPlanService medicationPlanService) {
	        this.medicationPlanService = medicationPlanService;
	    }
	 
	 @GetMapping(value = "/{id}")
	    public MedicationPlanDTO findById(@PathVariable("id") Integer id){
	        return medicationPlanService.findPersonById(id);
	    }
	 
	 @GetMapping(value = "/items")
	    public List<MedicationPlanWithMedication> findAllWithItems(){
	        return medicationPlanService.findAllFetch();
	    }
	 
	 @GetMapping(value = "/all")
	    public List<MedicationPlanDTO> findAll(){
	        return medicationPlanService.findAll();
	    }
	 
	 @PostMapping(value = "register")
	    public Integer insertPersonDTO(@RequestBody MedicationPlanDTO personDTO){
	        return medicationPlanService.insert(personDTO);
	    }
	 
	
}
