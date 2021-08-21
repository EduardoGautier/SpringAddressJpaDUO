package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.AddressEntity;
import com.example.spring.repository.AddressRepository;

@RestController
@RequestMapping("/api/addresses/zip/")
public class AddressRestController {

	@Autowired
	 AddressRepository repository;
	
	@Bean
	public void populate() {
		repository.save(new AddressEntity("90010-170", "Praça Montevidéo"));
		repository.save(new AddressEntity("94935-410", "Lidio Batista Soares"));
		repository.save(new AddressEntity("01001-000", "Praça da Sé"));
	}
	
	@GetMapping("{zipCode}")
	public List<AddressEntity> getIterableZip(@PathVariable String zipCode) {
		return repository.findByzipCode(zipCode);
	}
	
	@PostMapping("add")
	public AddressEntity addCep(@RequestBody AddressEntity zipCode) {
		return repository.save(zipCode);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}

	
}