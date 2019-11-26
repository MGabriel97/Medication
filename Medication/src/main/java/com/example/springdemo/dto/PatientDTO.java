package com.example.springdemo.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.entities.User;

public class PatientDTO {
	
	
	protected Integer id;
	
	public PatientDTO(Integer id, String name, String birthdate, String gender, String address, String medicaldecord) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.medicaldecord = medicaldecord;
	}


	public PatientDTO() {
	}


	protected String name;
    protected String birthdate;
    

    protected String gender;
    protected String address;
    protected String medicaldecord;
    private Caregiver caregiver;
    private User user;
    public PatientDTO(Integer id, String name, String birthdate, String gender, String address, String medicaldecord,
			Caregiver caregiver, User user) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.medicaldecord = medicaldecord;
		this.caregiver = caregiver;
		this.user = user;
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


	public PatientDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	public void setMedicaldecord(String medicaldecord) {
		this.medicaldecord = medicaldecord;
	}




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




	
	
}
