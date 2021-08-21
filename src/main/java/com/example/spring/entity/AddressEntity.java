package com.example.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String zipCode;
	private String publicPlace;


	public AddressEntity() {
		super();
	}

	public AddressEntity(String zipCode, String publicPlace) {
		super();
		this.zipCode = zipCode;
		this.publicPlace = publicPlace;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getzipCode() {
		return zipCode;
	}

	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getpublicPlace() {
		return publicPlace;
	}

	public void setpublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

}
