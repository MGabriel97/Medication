package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.PatientViewDTO;
import com.example.springdemo.services.PatientService;
import com.example.springdemo.services.TaskService;

@RestController
@CrossOrigin
@RequestMapping(value = "/patient")
public class PatientController {
	
	
	private final PatientService patientService;
	 
	 @Autowired
	    public PatientController(PatientService patientService) {
	        this.patientService = patientService;
	    }
	 
	 @GetMapping(value = "/{id}")
	    public PatientViewDTO findById(@PathVariable("id") Integer id){
	        return patientService.findPatientById(id);
	    }
	 
	 @GetMapping(value = "/all")
	    public List<PatientViewDTO> findAll(){
	        return patientService.findAll();
	    }
	 
	 @PostMapping(value = "register")
	    public Integer insertPersonDTO(@RequestBody PatientDTO medicationDTO){
	        return patientService.insert(medicationDTO);
	    }
	 
	 @PutMapping(value = "update")
	    public Integer updatePerson(@RequestBody PatientDTO medicationDTO) {
	        return patientService.update(medicationDTO);
	    }

   @DeleteMapping(value = "delete")
	    public void delete(@RequestBody PatientDTO medicationDTO){
	    	patientService.delete(medicationDTO);
	    }
}
