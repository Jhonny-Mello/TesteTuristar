package com.br.Turistar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.Turistar.model.Rotas;
import com.br.Turistar.repository.RotaRepository;

@CrossOrigin
@RestController
public class RotasController {

	@Autowired
	RotaRepository rotaRepository;

	@RequestMapping(value = "/rotas", method = RequestMethod.GET)
	public List<Rotas> getAllRotas() {
		return rotaRepository.findAll();
	}

	@RequestMapping(value = "/rotas", method = RequestMethod.POST)
	public ResponseEntity<Rotas> salvaRotas(@RequestBody Rotas rotas) {
		return ResponseEntity.ok(rotaRepository.save(rotas));
	}

	@RequestMapping(value = "/rotas/id={id}", method = RequestMethod.GET)
	public ResponseEntity<Rotas> getRotas(@PathVariable(value = "id") int id) {
		Optional<Rotas> rota = rotaRepository.findById(id);

		if (rota.isPresent())
			return new ResponseEntity<Rotas>(rota.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/rotas/end={end}", method = RequestMethod.GET)
	public ResponseEntity<List<Rotas>> findByEnd(@PathVariable String end){
		
		List<Rotas> rota = rotaRepository.findByEnd(end.trim());
		
		return new ResponseEntity<List<Rotas>>(rota, HttpStatus.OK);
	}
}