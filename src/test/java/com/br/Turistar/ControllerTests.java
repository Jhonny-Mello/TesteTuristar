package com.br.Turistar;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.br.Turistar.controller.BaresController;
import com.br.Turistar.model.Usuarios;
import com.br.Turistar.service.UsuariosService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ControllerTests extends UsuariosService{

	@Autowired
	UsuariosService usuarioService;

	@Autowired
	ObjectMapper objectmapper;

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

	@Test
	public void testGetAgremiacoesController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/agremiacoes"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testGetUsuariosController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/usuarios"))
			.andExpect(MockMvcResultMatchers.status()
					.isOk());
	}

	@Test
	public void testGetRotasController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/rotas"))
			.andExpect(MockMvcResultMatchers.status()
					.isOk());
	}

	// verifica se valor nome do usuário é do tipo String()//

	@Test
	public void testVerificaNome() throws Exception {

		String stringcomparacao = "a";
		Usuarios usuario = new Usuarios();
		usuario.setName("helielson");

		assertEquals(usuario.getName().getClass().getSimpleName(), stringcomparacao.getClass().getSimpleName());
		usuarioService.postUsuarios(usuario);
	}

	// verifica funcionamento e conteudo da rota - Verifica se o conteudo é
	// compativel com JSON//

	@Test
	public void testGetUsuariosByIdController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/usuarios/1")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
				.andExpect((MockMvcResultMatchers.content().string(containsString(
						"{\"id\":1,\"name\":\"joni\",\"email\":\"shndaidhna@gmail.com\",\"age\":24,\"cpf\":\"13324393493\"}"))));
	}

	// verifica funcionamento do método deleteById() em usuarios e conteudo da
	// rota//

	@Test
	public void testDeleteUsuariosByIdController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.delete("/usuarios/2"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andExpect((MockMvcResultMatchers.status().is(200)))
				.andExpect(MockMvcResultMatchers.content().string(containsString("")));
	}

	// verifica funcionamento do método deleteAll() em usuarios e conteudo da rota//

	@Test
	public void testDeleteAllUsuariosByIdController() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.delete("/usuarios"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andExpect((MockMvcResultMatchers.status().is(200)))
				.andExpect(MockMvcResultMatchers.content().string(containsString("")));
	}

	// Verifica funcionamento do método POST em Usuarios//

	@Test
	public void testPostUsuarios() throws Exception {

		this.mockMvc
				.perform(MockMvcRequestBuilders.post("/usuarios")
						.content(asJsonString(new Usuarios(null, "jonilson", "heihei@gmail.com", 2, "1234535623")))
						.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
				.andExpect((MockMvcResultMatchers.status().is(200)));
	
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
