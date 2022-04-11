package com.br.Turistar;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.br.Turistar.exceptions.UsuariosNotFoundException;
import com.br.Turistar.model.Usuarios;
import com.br.Turistar.service.UsuariosService;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
class UsuariosTestes {

	@Autowired
	UsuariosService usuarioService;

	@Test
	void TesteUserDeleteById() throws UsuariosNotFoundException {

		usuarioService.deleteUsuarios(1L);
		assertEquals(Optional.empty(), usuarioService.getUsuariosById(1L));
	}

	@Test
	void TesteUserById() throws UsuariosNotFoundException {

		Optional<Usuarios> usuario = usuarioService.getUsuariosById(3L);
		assertNotEquals(Optional.empty(), usuario);
		assertEquals(24, usuario.get().getAge());
		assertEquals("joni",usuario.get().getName());
		assertEquals("13324393493",usuario.get().getCpf());
		assertEquals("shndaidhna@gmail.com",usuario.get().getEmail());
	}

}
