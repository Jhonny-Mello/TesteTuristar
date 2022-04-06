package com.br.Turistar.service;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Turistar.model.Bares;
import com.br.Turistar.repository.BaresRepository;
@Service
public class BaresService {
	
	@Autowired
	BaresService service;
	
	@Autowired
	BaresRepository baresRepository;
	
	public ArrayList<Bares> getAllBares(){
		
		ArrayList<Bares> bares = new ArrayList<>();
		baresRepository.findAll().forEach(bar -> bares.add(bar));
		return bares;
		
	}	

}


