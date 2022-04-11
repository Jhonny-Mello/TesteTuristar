package com.br.Turistar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.br.Turistar.model.Usuarios;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TuristarProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TuristarProjectApplication.class, args);
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuarios usuario = new Usuarios();
		System.out.println(usuario.getName());
		System.out.println(usuario.getClass().getSimpleName());
	}
	
}
