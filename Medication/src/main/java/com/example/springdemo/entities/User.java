package com.example.springdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "user")

public class User {
	
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
	
	@Column(name = "rol")
    protected String rol;
	
	@OneToOne(mappedBy = "user")
    private Patient patient;
	 
	
    public User(Integer id, String name, String birthdate, String gender, String address, String medicaldecord, String rol) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.rol = rol;
	}
    
	public User() {
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
		return rol;
	}
	public void setMedicaldecord(String medicaldecord) {
		this.rol = medicaldecord;
	}

}

