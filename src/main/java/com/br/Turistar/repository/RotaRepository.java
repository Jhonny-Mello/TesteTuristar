package com.br.Turistar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.Turistar.model.Rotas;

@Repository
public interface RotaRepository extends JpaRepository<Rotas, Integer> {

	@Query(value = "select r from Rotas r where r.fim like %?1%")
	List<Rotas> findByEnd(String end);
	
}