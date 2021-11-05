package com.cliente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cliente.entity.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Integer>{
	
	
	public abstract List<cliente> findByCorreo(String correo);
	
	 
}
