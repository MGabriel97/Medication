package com.example.springdemo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "medication")
public class Medication {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
	protected Integer id;
	
	@Column(name = "name", nullable = false, length = 100)
	protected String name;
	
    @Column(name = "sideeffects")
    protected String sideeffects;
    
	 @Column(name = "dosage")
    protected String dosage;
	 
	 @ManyToOne()
	 @JoinColumn(name = "medicationplan_id")
	 private MedicationPlan medicationplan;

	public Medication(Integer id, String name, String sideeffects, String dosage) {
		this.id = id;
		this.name = name;
		this.sideeffects = sideeffects;
		this.dosage = dosage;
	}

	public Medication() {
	
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

	public Medication(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
    


}
