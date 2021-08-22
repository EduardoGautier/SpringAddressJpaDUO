package com.example.spring.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.spring.entity.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
	
	AddressEntity findByzipCode(String zipCode);

}
