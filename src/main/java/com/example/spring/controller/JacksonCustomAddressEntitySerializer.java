package com.example.spring.controller;


import java.io.IOException;

import com.example.spring.entity.AddressEntity;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class JacksonCustomAddressEntitySerializer extends StdSerializer<AddressEntity> {
	
	private static final long serialVersionUID = -4022690158064513181L;

	

	public JacksonCustomAddressEntitySerializer() {
		this(null);
	}
	
	public JacksonCustomAddressEntitySerializer(Class<AddressEntity> t) {
		super(t);
	}
	
	@Override
	public void serialize(AddressEntity address, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		
		jgen.writeStartObject();
		
		/*if (address.getId() == null) {
			jgen.writeNullField("id");
		} else {
			jgen.writeNumberField("id", address.getId());
		}*/

		jgen.writeStringField("Cep", address.getZipCode());
		jgen.writeStringField("Logradouro", address.getPublicPlace());
		jgen.writeStringField("Complemento", address.getComplement());
		jgen.writeStringField("Bairro", address.getDistrict());
		jgen.writeStringField("Localidade", address.getLocation());
		jgen.writeStringField("Uf", address.getFederativeUnit());
		
		jgen.writeEndObject();
		
	}
	
	
	
	

}
