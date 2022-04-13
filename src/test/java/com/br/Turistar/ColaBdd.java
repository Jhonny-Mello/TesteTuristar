package com.br.Turistar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions
public class ColaBdd extends ControllerTests{
	
	@Given("Usuario esta cadastrado")
	public void usuario_esta_cadastrado() {
		
			super.setUp();
	}

	@When("executo DeleteById\\()")
	public void executo_delete_by_id() throws Exception {
		
		super.testGetUsuariosController();
	}
}
