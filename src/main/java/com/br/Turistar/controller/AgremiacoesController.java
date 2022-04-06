package com.br.Turistar.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.Turistar.model.Agremiacoes;
import com.br.Turistar.repository.AgremiacoesRepository;
import com.br.Turistar.service.AgremiacoesService;
@CrossOrigin
@RestController
public class AgremiacoesController {
	
	@Autowired
	AgremiacoesRepository agremiacoesRepository;
	
	@Autowired
	AgremiacoesService agremiacoesService;
		
	@RequestMapping(value = "/agremiacoes", method = RequestMethod.GET)
	public List<Agremiacoes> GetAllAgremiacoes() {
		
		return agremiacoesRepository.findAll();
	}
	
	@RequestMapping(value = "/agremiacoes/{id}", method = RequestMethod.GET)
	public ResponseEntity<Agremiacoes> GetAgremiacoes(@PathVariable(value = "id") int id) {
		
		Optional<Agremiacoes> agremiacoes = agremiacoesRepository.findById(id);
		
		if (agremiacoes.isPresent()) {
			return new ResponseEntity<Agremiacoes>(agremiacoes.get(), HttpStatus.OK);
		}
			
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
	}
		
	@RequestMapping(value = "/agremiacoes/{id}", method = RequestMethod.DELETE)
	public void DeleteAgremiacoes(@PathVariable(value = "id") int id){
		agremiacoesRepository.deleteById(id);
	}
	
	
	@RequestMapping(value = "/agremiacoes", method = RequestMethod.POST)
	public void PostAgremiacoes(@Valid @RequestBody Agremiacoes agremiacoes) {
		agremiacoesRepository.save(agremiacoes);		
	}
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String OlaMundo() {
		return "Olá Mundo";
	}
}
