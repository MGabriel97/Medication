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

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.CaregiverViewDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.MedicationViewDTO;
import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.PersonViewDTO;
import com.example.springdemo.services.CaregiverService;
import com.example.springdemo.services.MedicationService;
import com.example.springdemo.services.PersonService;

@RestController
@CrossOrigin
@RequestMapping(value = "/caregiver")
public class CaregiverController {
	 private final CaregiverService caregiverService;
	 
	 @Autowired
	    public CaregiverController(CaregiverService caregiverService) {
	        this.caregiverService = caregiverService;
	    }
	 
	 
	 
	 @GetMapping(value = "/{id}")
	    public CaregiverViewDTO findById(@PathVariable("id") Integer id){
	        return caregiverService.findCaregiverById(id);
	    }
	 
	 @GetMapping(value = "/all")
	    public List<CaregiverViewDTO> findAll(){
	        return caregiverService.findAll();
	    }
	 
	 @PostMapping(value = "register")
	    public Integer insertPersonDTO(@RequestBody CaregiverDTO medicationDTO){
	        return caregiverService.insert(medicationDTO);
	    }
	 
	 @PutMapping(value = "update")
	    public Integer updatePerson(@RequestBody CaregiverDTO medicationDTO) {
	        return caregiverService.update(medicationDTO);
	    }

    @DeleteMapping(value = "delete")
	    public void delete(@RequestBody CaregiverDTO medicationDTO){
    	caregiverService.delete(medicationDTO);
	    }
}
