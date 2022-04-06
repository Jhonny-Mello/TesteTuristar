package com.br.Turistar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Turistar.model.Bares;

@Repository
public interface BaresRepository extends JpaRepository<Bares, Integer> {
	
}
