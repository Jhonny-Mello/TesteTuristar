package com.br.Turistar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Turistar.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Long>{

	
}
