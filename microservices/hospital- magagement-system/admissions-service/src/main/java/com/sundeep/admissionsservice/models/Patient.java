package com.sundeep.admissionsservice.models;

public class Patient {
	
	private String id;
	private String name;
	private String nationality;
	
	public Patient(String id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}
 }
