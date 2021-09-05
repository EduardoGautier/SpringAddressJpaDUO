package com.example.spring.controller;


import java.io.IOException;

import com.example.spring.entity.AddressEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
public class JacksonCustomAddressEntityDeserializer extends StdDeserializer<AddressEntity> {
	
	private static final long serialVersionUID = -3413827126625189247L;

	

	public JacksonCustomAddressEntityDeserializer(){
		this(null);
	}

	public JacksonCustomAddressEntityDeserializer(Class<AddressEntity> t) {
		super(t);
	}
	
	@Override
	public AddressEntity deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
		JsonNode node = parser.getCodec().readTree(parser);
		AddressEntity address = new AddressEntity();
		String zip = node.get("cep").asText(null);
		String publicPlace = node.get("logradouro").asText(null);
		String complement = node.get("Complemento").asText(null);
		String district = node.get("Bairro").asText(null);
		String location = node.get("Localidade").asText(null);
		String federativeUnit = node.get("UF").asText(null);

		address.setZipCode(zip);
		address.setPublicPlace(publicPlace);	  
		address.setComplement(complement);
		address.setDistrict(district);
		address.setLocation(location);
		address.setFederativeUnit(federativeUnit);
		
		return address;
	}
	
}