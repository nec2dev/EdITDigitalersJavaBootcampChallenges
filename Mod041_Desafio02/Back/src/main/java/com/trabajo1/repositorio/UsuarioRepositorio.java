package com.trabajo1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabajo1.modelo.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {

}
