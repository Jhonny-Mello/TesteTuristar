package com.br.Turistar.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Turistar.model.Agremiacoes;
import com.br.Turistar.repository.AgremiacoesRepository;

@Service
public class AgremiacoesService {
	
	@Autowired
	AgremiacoesService service;
	
	@Autowired
	AgremiacoesRepository agremiacoesRepository;
	
	//Pegando todos usuarios
	public ArrayList<Agremiacoes> getAllAgreamicoes(){
		
		ArrayList<Agremiacoes> agremiacoes = new ArrayList<>();
		agremiacoesRepository.findAll().forEach(agre -> agremiacoes.add(agre));
		return agremiacoes;
	}
	
	
}
