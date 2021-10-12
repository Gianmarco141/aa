package com.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.entity.usuario;
import com.usuario.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public usuario insertar(usuario obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<usuario> listausuario() {
		return repository.findAll();
	}

	@Override
	public List<usuario> listaPorCorreo(String correo) {
		return repository.findByCorreo(correo);
	}

}
