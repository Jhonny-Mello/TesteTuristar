package com.br.Turistar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isNull;

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
	void TesteUserById() throws UsuariosNotFoundException {

		Usuarios usuario = usuarioService.getUsuariosById(1L);
		System.out.println(usuario.getName());
		assertEquals("24", String.valueOf(usuario.getAge()));
		// assertEquals("13324393493", usuario.getCpf());
		// assertEquals("shndaidhna@gmail.com ", usuario.getEmail());
		// assertEquals("joni", usuario.getName());

	}

	@Test
	void TesteUserDeleteById() throws UsuariosNotFoundException {
		Usuarios usuario = usuarioService.getUsuariosById(1L);
		usuarioService.deleteUsuarios(1L);
		assertEquals(null, usuarioService.getUsuariosById(1L));
	}

}
