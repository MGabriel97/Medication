package com.example.springdemo.entities;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "caregiver")
public class Caregiver {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	protected Integer id;
	 
	@Column(name = "name", nullable = false, length = 100) 
	protected String name;
	
	@Column(name = "birthdate")
    protected String birthdate;
	 
    @Column(name = "gender")
    protected String gender;
	 
	 @Column(name = "address")
    protected String address;
    
    public Caregiver(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Caregiver(Integer id, String name, String birthdate, String gender, String address) {

		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
	}

	public Caregiver(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private List<Patient> patients;
    
	public Caregiver() {
	}

	public Caregiver(Integer id, String name, String birthdate, String gender, String address,
			List<Patient> patients) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.patients = patients;
	}
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)

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

}
