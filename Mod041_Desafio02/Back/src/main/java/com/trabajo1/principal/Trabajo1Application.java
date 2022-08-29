package com.trabajo1.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.trabajo1.controlador.UsuarioControlador;
import com.trabajo1.modelo.Usuario;
import com.trabajo1.repositorio.UsuarioRepositorio;

@SpringBootApplication
@ComponentScan({ "com.trabajo1" })
@EntityScan("com.trabajo1")
@EnableJpaRepositories("com.trabajo1")
public class Trabajo1Application implements CommandLineRunner {
	@Autowired
	private UsuarioRepositorio ur;
	@Autowired
	private UsuarioControlador uc;

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.ur.save(new Usuario("Alexis","Cabrera","alex@correo.com"));
		//this.uc.borrarUsuario(2);
		this.uc.modificarUsuario(9, new Usuario("Rogger","Vera","vera@web.com"));
	}

}
