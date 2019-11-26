package com.example.springdemo.dto;

public class PatientViewDTO {
	protected Integer id;
	protected String name;
	protected String address;
	protected String medicaldecord;
	
	
	
	


	public PatientViewDTO(Integer id, String name, String address, String medicaldecord) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.medicaldecord = medicaldecord;
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


	public PatientViewDTO() {
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
