package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.AddressEntity;
import com.example.spring.repository.AddressRepository;

@RestController
@RequestMapping("/api/addresses/zip/")
public class AddressRestController {

	@Autowired
	 AddressRepository repository;
	
	@GetMapping("{zip}")
	public List<AddressEntity> getIterableZip(@PathVariable String zip) {
		return repository.findByZip(zip);
	}

	
}