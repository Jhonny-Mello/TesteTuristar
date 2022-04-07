package com.br.Turistar.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsuariosNotFoundException extends Exception{

	   public UsuariosNotFoundException(String name) {
	        super(String.format("Beer with name %s not found in the system.", name));
	    }

	    public UsuariosNotFoundException(Long id) {
	        super(String.format("Beer with id %s not found in the system.", id));

	    }
}