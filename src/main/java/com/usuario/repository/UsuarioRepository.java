package com.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.usuario.entity.usuario;

public interface UsuarioRepository extends JpaRepository<usuario, Integer>{
	
	
	public abstract List<usuario> findByCorreo(String correo);
	
	 
}
