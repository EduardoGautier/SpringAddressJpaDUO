package com.example.spring.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.entity.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
	
	AddressEntity findByzipCode(String zipCode);

	public List<AddressEntity> findAll();
	
}
