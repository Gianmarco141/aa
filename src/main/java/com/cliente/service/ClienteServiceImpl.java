package com.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.entity.cliente;
import com.cliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public cliente insertar(cliente obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<cliente> listausuario() {
		return repository.findAll();
	}

	@Override
	public List<cliente> listaPorCorreo(String correo) {
		return repository.findByCorreo(correo);
	}

}
