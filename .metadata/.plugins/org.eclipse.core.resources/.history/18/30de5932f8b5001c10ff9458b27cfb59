package com.br.Turistar;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.br.Turistar.controller.BaresController;

@SpringBootTest
@AutoConfigureMockMvc
public class BaresControllerTests {
	
	@Autowired
    private BaresController baresController;
	
	@Autowired
	MockMvc mockMvc;
	
	@Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(baresController).build();
    }

	@Test
	public void testGetBaresController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/bares"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
