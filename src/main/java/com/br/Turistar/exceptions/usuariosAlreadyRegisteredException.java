package com.br.Turistar.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class usuariosAlreadyRegisteredException extends Exception{

	 public usuariosAlreadyRegisteredException(String Username) {
	        super(String.format("User with name "+ Username +" already registered in the system."));
	    }
}
