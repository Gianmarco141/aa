package com.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.entity.usuario;
import com.usuario.service.UsuarioService;


@RestController
@RequestMapping("/rest/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class loginController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/porcorreo/{paramcorreo}")
	@ResponseBody
	public ResponseEntity<List<usuario>> listaCorreo(@PathVariable("paramcorreo") String correo) {
		List<usuario> lista = service.listaPorCorreo(correo);
		return ResponseEntity.ok(lista);
	}

}
