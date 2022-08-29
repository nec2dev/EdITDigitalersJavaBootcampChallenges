package com.trabajo1.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo1.modelo.Usuario;
import com.trabajo1.repositorio.UsuarioRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UsuarioControlador {
	@Autowired
	private UsuarioRepositorio ur;

	// mostrar listado de usuarios registrados
	@GetMapping("usuario")
	public List<Usuario> getUsuario() {
		return this.ur.findAll();
	}

	// crear nuevo usuario
	@PostMapping("usuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return ur.save(usuario);
	}

	// eliminar usuario
	@DeleteMapping("/usuario/{id}")
	public void borrarUsuario(@PathVariable Integer id) {
		Usuario u = ur.findById(id).orElseThrow();
		ur.delete(u);
		System.out.println("borrado");
	}
	//editar usuario
	@PutMapping("/usuario/{id}")
	public ResponseEntity<Usuario> modificarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario){
		Usuario u = ur.findById(id).orElseThrow();
		u.setNombre(usuario.getNombre());
		u.setApellido(usuario.getApellido());
		u.setCorreo(usuario.getCorreo());
		Usuario dato = ur.save(u);
		return ResponseEntity.ok(dato);
	}
	
}
