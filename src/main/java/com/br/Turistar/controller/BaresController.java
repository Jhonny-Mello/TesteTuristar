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

import com.br.Turistar.model.Bares;
import com.br.Turistar.repository.BaresRepository;
import com.br.Turistar.service.BaresService;
@CrossOrigin
@RestController
public class BaresController {

	@Autowired
	BaresRepository baresRepository;
	
	@Autowired
	BaresService baresService;

	@RequestMapping(value = "/bares", method = RequestMethod.GET)
	public List<Bares> GetAllBares() {
		
		return baresRepository.findAll();
	}
	
	@RequestMapping(value = "/bares/{id}", method = RequestMethod.GET)
	public ResponseEntity<Bares> GetBar(@PathVariable(value = "id") int id) {
		
		Optional<Bares> bares = baresRepository.findById(id);
		
		if (bares.isPresent()) {
			return new ResponseEntity<Bares>(bares.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}			
	}
	
	@RequestMapping(value = "/bares/{id}", method = RequestMethod.DELETE)
	public void DeleteAgremiacoes(@PathVariable(value = "id") int id){
		baresRepository.deleteById(id);
	}
	
	
	@RequestMapping(value = "/bares", method = RequestMethod.POST)
	public void PostAgremiacoes(@Valid @RequestBody Bares bares) {
		baresRepository.save(bares);
		
	}
}
