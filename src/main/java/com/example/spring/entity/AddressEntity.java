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
	
	@Column(name = "complement")
	private String complement;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "federativeUnit")
	private String federativeUnit;

	
	public AddressEntity() {
		super();
	}




	public AddressEntity(String zipCode, String publicPlace, String complement, String district, String location,String federativeUnit) {
		super();
		this.zipCode = zipCode;
		this.publicPlace = publicPlace;
		this.complement = complement;
		this.district = district;
		this.location = location;
		this.federativeUnit = federativeUnit;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getPublicPlace() {
		return publicPlace;
	}



	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}



	public String getComplement() {
		return complement;
	}



	public void setComplement(String complement) {
		this.complement = complement;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getFederativeUnit() {
		return federativeUnit;
	}



	public void setFederativeUnit(String federativeUnit) {
		this.federativeUnit = federativeUnit;
	}



	
}
