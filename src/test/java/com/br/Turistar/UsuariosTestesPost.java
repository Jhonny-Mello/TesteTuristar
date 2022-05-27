package com.br.Turistar;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.Turistar.model.Usuarios;
import com.br.Turistar.repository.UsuariosRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class UsuariosTestesPost {

RequestSpecification request = RestAssured.given();
	
	@Autowired
	UsuariosRepository usuarioRepository;
	
	@Autowired
	Usuarios usuarios;
	
	@Given("Usuario nao esta cadastrado")
	public void usuario_nao_esta_cadastrado() {
		
		request.get("/usuarios/10").print().isEmpty();
		
	}

	@When("adicionar usuario")
	public void adicionar_usuario() {
		request.post("/usuarios");
	}

	@Then("usuario cadastrado")
	public void usuario_cadastrado() {
		int a = request.get("/usuarios/10").getStatusCode();
		System.out.println("Status code: " + request.get("/usuarios/10").getStatusCode());
		assertEquals(200, a);
	}
}
