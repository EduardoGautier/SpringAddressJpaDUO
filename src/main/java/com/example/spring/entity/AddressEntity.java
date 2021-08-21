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
	private String zip;
	private String publicPlace;


	public AddressEntity() {
		super();
	}

	public AddressEntity(String zip, String publicPlace) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLogradouro() {
		return publicPlace;
	}

	public void setLogradouro(String publicPlace) {
		this.publicPlace = publicPlace;
	}

}
