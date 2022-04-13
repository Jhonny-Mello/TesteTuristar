package com.br.Turistar;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.br.Turistar.model.Usuarios;
import com.br.Turistar.repository.UsuariosRepository;
import com.br.Turistar.service.UsuariosService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SpringBootTest
@WebAppConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java")
public class UsuariosTestes  {

	@Autowired
	private UsuariosService usuarioService;

	@Autowired
	UsuariosRepository usuarioRepository;

//	@Before
//public void InsertEmBanco() {
//		Usuarios usuario = new Usuarios(10L,"dsajnoikdas","shndaidhna@gmail.com",24,"13324393493");
//
//	}	
//	@Given("Usuario esta cadastrado")
//	public void usuario_esta_cadastrado() {
//	}
//
//	@When("executo DeleteById\\()")
//	public void executo_delete_by_id() throws Exception {
//
//		
//			usuarioService.deleteUsuarios(1L);
//	}
//
//	@Then("usuario e excluido")
//	public void usuario_e_excluido() throws Exception {
//		
//		assertEquals(Optional.empty(), usuarioService.getUsuariosById(1L));
//	}

//	public void criarUsuarios() {
//
//	}
//
//	@Given("Usuario esta cadastrado")
//	public void usuario_esta_cadastrado() {
//
//		Usuarios usuario = new Usuarios(10L, "dsajnoikdas", "shndaidhna@gmail.com", 24, "13324393493");
//	}
//
//	@When("executo DeleteById\\()")
//	public void executo_delete_by_id() {
//
//		usuarioService.deleteUsuarios(10L);
//	}

//	@Test
//	void TesteUserById() throws UsuariosNotFoundException {
//
//		Optional<Usuarios> usuario = usuarioService.getUsuariosById(3L);
//		assertNotEquals(Optional.empty(), usuario);
//		assertEquals(24, usuario.get().getAge());
//		assertEquals("joni",usuario.get().getName());
//		assertEquals("13324393493",usuario.get().getCpf());
//		assertEquals("shndaidhna@gmail.com",usuario.get().getEmail());
//	}

}
