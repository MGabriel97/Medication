package com.example.springdemo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;
@Entity
@Table(name = "medicationplan")
public class MedicationPlan {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
	protected Integer id;
	
	 @Column(name = "patient")
	 protected String patient;
	
    @Column(name = "intakeinterval")
    protected String intakeinterval;
    
    @OneToMany(mappedBy = "medicationplan", fetch = FetchType.LAZY)
    private List<Medication> medications;

    
    
    
    
    
    
	public MedicationPlan() {
	}

	public MedicationPlan(Integer id,String patient, String intakeinterval) {
		this.id = id;
		this.patient = patient;
		this.intakeinterval = intakeinterval;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer patient) {
		this.id = patient;
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

	public List<Medication> getMedication() {
		return medications;
	}

	public void setMedication(List<Medication> medication) {
		this.medications = medication;
	}

	
    


}
