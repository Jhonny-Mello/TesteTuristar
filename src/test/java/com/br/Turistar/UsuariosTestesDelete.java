package com.br.Turistar;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.Turistar.model.Usuarios;
import com.br.Turistar.repository.UsuariosRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;



public class UsuariosTestesDelete  {
	
	RequestSpecification request = RestAssured.given();
	
	@Autowired
	UsuariosRepository usuarioRepository;
	
	@Autowired
	Usuarios usuarios;

	@Given("Usuario esta cadastrado")
	public void usuario_esta_cadastrado() {
		
		request.post("/usuarios");
		
	}
	@When(("^Excluo usuario (.*)$")) 
	public void executo_delete_by_id(String id) throws Exception {
		
		request.delete("/usuarios/" + id);
	
	}
	
	@Then("^Usuario (.*) excluido$")
	public void verifico_existencia_de_usuario(String id) {
		
		String comparar = request.get("/usuarios/"+ id).getContentType();
		comparar.equals(null);
	}
	
/*************************************************************************/
	/*************************************************************************/
		/*************************************************************************/
	@Given("Usuarios cadastrados")
	public void usuarios_cadastrados() {
		
		request.get("/usuarios");

	}
	@When("Excluo todos os usuarios")
	public void excluo_todos_os_usuarios() {
		
		request.delete("/usuarios");
		
	}
	@Then("Todos usuarios excluidos")
	public void todos_usuarios_excluidos() {
		
		request.get("/usuarios").print().isEmpty();
	}

/*************************************************************************/
	/*************************************************************************/
		/*************************************************************************/

	
}
