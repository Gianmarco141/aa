package com.usuario.service;

import java.util.List;

import com.usuario.entity.usuario;

public interface UsuarioService {
	
	
	public abstract usuario insertar(usuario obj);
	
	public abstract List<usuario> listausuario();
	
	public abstract List<usuario> listaPorCorreo(String correo);
	

	
	

}
