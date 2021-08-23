package com.example.spring;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class SpringAddressJpaApplicationTest {
	
	@Autowired
	private MockMvc mvc;


	@Test
	public void testGetAllAddressSucess() throws Exception {
		mvc.perform(MockMvcRequestBuilders
				.get("/api/addresses/zip/90010170"))
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.APPLICATION_JSON))
					.andExpect(jsonPath("$.Cep").value("90010170"));
	}


	@Test
	void testGetAllAddressNotFound() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/addresses/zip/")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}

	
}
