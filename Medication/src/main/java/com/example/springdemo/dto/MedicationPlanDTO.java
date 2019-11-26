package com.example.springdemo.dto;

public class MedicationPlanDTO {
	protected String patient;
	protected Integer id;
	
	
	
    public MedicationPlanDTO(Integer id,String patient, String intakeinterval) {
    	this.id = id;
    	this.patient = patient;
		this.intakeinterval = intakeinterval;
	}
    
    
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public MedicationPlanDTO() {
	}


	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getIntakeinterval() {
		return intakeinterval;
	}
	public void setIntakeinterval(String intakeinterval) {
		this.intakeinterval = intakeinterval;
	}
	protected String intakeinterval;
}
