package com.br.Turistar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Turistar.model.Agremiacoes;

@Repository
public interface AgremiacoesRepository extends JpaRepository<Agremiacoes, Integer>  {
	
	

}
