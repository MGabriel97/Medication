package com.example.springdemo.dto;

import java.util.List;

public class MedicationPlanWithMedication {
	protected Integer id;
	protected String patient;
    public MedicationPlanWithMedication(Integer id,String patient, String name, List<MedicationDTO> items) {
		this.id=id;
    	this.patient = patient;
		this.name = name;
		this.items = items;
	}
	private String name;
    private List<MedicationDTO> items;
	public MedicationPlanWithMedication() {
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MedicationDTO> getItems() {
		return items;
	}
	public void setItems(List<MedicationDTO> items) {
		this.items = items;
	}

    
    
}