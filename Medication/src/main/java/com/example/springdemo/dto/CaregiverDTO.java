package com.example.springdemo.dto;



public class CaregiverDTO {
	
	private Integer id;
	 
	private String name;
	private String birthdate;
    private String gender;
    private String address;
	public Integer getId() {
		return id;
	}

	public CaregiverDTO(Integer id, String name, String birthdate, String gender, String address) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
	}

	public CaregiverDTO() {
		super();
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
