package com.example.springdemo.dto;

public class MedicationViewDTO {
protected Integer id;
	
	protected String name;
	 protected String sideeffects;
	    
	 protected String dosage;

	


	

	public MedicationViewDTO(Integer id, String name, String sideeffects, String dosage) {
		this.id = id;
		this.name = name;
		this.sideeffects = sideeffects;
		this.dosage = dosage;
	}

	public String getSideeffects() {
		return sideeffects;
	}

	public void setSideeffects(String sideeffects) {
		this.sideeffects = sideeffects;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
