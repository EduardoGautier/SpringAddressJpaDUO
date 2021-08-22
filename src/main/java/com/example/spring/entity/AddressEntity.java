package com.example.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name = "adresses")
@JsonIgnoreProperties
@JsonSerialize(using = com.example.spring.controller.JacksonCustomAddressEntitySerializer.class)
@JsonDeserialize(using = com.example.spring.controller.JacksonCustomAddressEntityDeserializer.class)
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "zipCode")
	private String zipCode;
	
	@Column(name = "publicPlace")
	private String publicPlace;

	
	public AddressEntity() {
		super();
	}
	

	public AddressEntity(String zipCode) {
		super();
		this.zipCode = zipCode;
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
