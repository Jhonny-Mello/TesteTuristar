package com.br.Turistar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Turistar.exceptions.UsuariosNotFoundException;
import com.br.Turistar.exceptions.usuariosAlreadyRegisteredException;
import com.br.Turistar.model.Usuarios;
import com.br.Turistar.repository.UsuariosRepository;

@Service
public class UsuariosService {

	@Autowired
	UsuariosRepository usuariosRepository;
	
	public List<Usuarios> getAllUsuarios(){
			
		return usuariosRepository.findAll();
	
	}

	public Optional<Usuarios> getUsuariosById(Long id) throws UsuariosNotFoundException{

        return usuariosRepository.findById(id);
    }
	
	public Usuarios postUsuarios(Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}
	

	public Usuarios updateUsuarios(Usuarios usuarios,Long id) throws usuariosAlreadyRegisteredException {
        
		verifyIfIsAlreadyRegistered(usuarios.getName());
		return usuariosRepository.save(usuarios);
	}
	
	public void deleteUsuarios(Long id){
		
		usuariosRepository.deleteById(id);
	} 
	
	public void deleteAllUsuarios() {
		
		usuariosRepository.deleteAll();
		
	}
	public Usuarios FindByName(String name) throws UsuariosNotFoundException {
		Usuarios founduser = usuariosRepository.findByName(name)
				.orElseThrow(() -> new UsuariosNotFoundException(name));
        return founduser;
	}
	private void verifyIfIsAlreadyRegistered(String name) throws usuariosAlreadyRegisteredException {
        Optional<Usuarios> optSavedBeer = usuariosRepository.findByName(name);
        if (optSavedBeer.isPresent()) {
            throw new usuariosAlreadyRegisteredException(name);
        }
    }
    private Usuarios verifyIfExists(Long id) throws UsuariosNotFoundException{ 
        return usuariosRepository.findById(id)
                .orElseThrow(() -> new UsuariosNotFoundException(id));
    }
}
