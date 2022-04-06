package com.br.Turistar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Turistar.model.Rotas;

@Repository
public interface RotasRepository extends JpaRepository<Rotas, Integer>{

	
}
