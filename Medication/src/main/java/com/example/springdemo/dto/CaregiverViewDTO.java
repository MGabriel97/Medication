package com.example.springdemo.dto;

public class CaregiverViewDTO {
	private Integer id; 
	private String name;
	

	
	

	public CaregiverViewDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	public CaregiverViewDTO() {
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
