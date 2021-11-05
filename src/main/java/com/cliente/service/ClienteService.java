package com.cliente.service;

import java.util.List;

import com.cliente.entity.cliente;

public interface ClienteService {
	
	
	public abstract cliente insertar(cliente obj);
	
	public abstract List<cliente> listausuario();
	
	public abstract List<cliente> listaPorCorreo(String correo);
	

	
	

}
