package com.br.Turistar.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.Turistar.exceptions.UsuariosNotFoundException;
import com.br.Turistar.exceptions.usuariosAlreadyRegisteredException;
import com.br.Turistar.model.Usuarios;
import com.br.Turistar.service.UsuariosService;

@RestController
public class UsuariosController {

	@Autowired
	UsuariosService usuariosService;
	
	@GetMapping("/usuarios")
	public ArrayList<Usuarios> getAllUsuarios(){
		
		return usuariosService.getAllUsuarios();
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuarios getUsuariosById(@PathVariable Long id) throws UsuariosNotFoundException {
		return usuariosService.getUsuariosById(id);
	}
	@PutMapping("/usuarios/{id}")
	public Usuarios updateUsuarios(@PathVariable Long id,@RequestBody Usuarios usuarios) throws usuariosAlreadyRegisteredException {
		
		return usuariosService.updateUsuarios(usuarios,id);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void deleteUsuarios(@PathVariable Long id) {
		
		usuariosService.deleteUsuarios(id);
	}
	
	@DeleteMapping("/usuarios")
	public void deleteAllUsuarios() {
		
		usuariosService.deleteAllUsuarios();
	}
}

