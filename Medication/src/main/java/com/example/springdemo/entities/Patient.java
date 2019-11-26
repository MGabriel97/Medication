package com.example.springdemo.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "patient")

public class Patient {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	protected Integer id;
	
	@Column(name = "name", length = 100, unique=true, nullable = false)
	protected String name;
	
	@Column(name = "birthdate")
    protected String birthdate;
    
	@Column(name = "gender")
    protected String gender;
    
	@Column(name = "address")
    protected String address;
    
	@Column(name = "medicaldecord")
    protected String medicaldecord;
	
	@ManyToOne()
    @JoinColumn(name = "caregiver_id")
    private Caregiver caregiver;
	
	public Patient(Integer id, String name, String address, String medicaldecord) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.medicaldecord = medicaldecord;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
    public Caregiver getCaregiver() {
		return caregiver;
	}

	public void setCaregiver(Caregiver caregiver) {
		this.caregiver = caregiver;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Patient(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Patient(Integer id, String name, String birthdate, String gender, String address, String medicaldecord,
			Caregiver caregiver, User user) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.medicaldecord = medicaldecord;
		this.caregiver = caregiver;
		this.user = user;
	}

	public Patient(Integer id, String name, String birthdate, String gender, String address, String medicaldecord) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.medicaldecord = medicaldecord;
	}
    
	public Patient() {
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMedicaldecord() {
		return medicaldecord;
	}
	public void setMedicaldecord(String medicaldecord) {
		this.medicaldecord = medicaldecord;
	}

}

