package com.example.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring.entity.AddressEntity;
import com.example.spring.repository.AddressRepository;

@SpringBootApplication
public class SpringAddressJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAddressJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AddressRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new AddressEntity("90010-170", "Praça Montevidéo"));
			repository.save(new AddressEntity("94935-410", "Lidio Batista Soares"));
			repository.save(new AddressEntity("01001-000", "Praça da Sé"));
		};
	}
}
