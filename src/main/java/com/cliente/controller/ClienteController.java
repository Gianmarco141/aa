package com.cliente.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cliente.entity.cliente;
import com.cliente.service.ClienteService;
import com.cliente.util.cons;

@RestController
@RequestMapping("/rest/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
	
	@Autowired
	private ClienteService service;

	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<cliente>> listar(){
		List<cliente> lista = service.listausuario();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> inserta(@RequestBody cliente obj){
		
		Map<String, Object> salida = new HashMap<>();
		try{
			 cliente objSalida = service.insertar(obj);
			 if (objSalida == null){
				 salida.put("mensaje", cons.MENSAJE_REG_ERROR);
			 }else {
				salida.put("mensaje", cons.MENSAJE_REG_EXITOSO);
				}
			}catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", cons.MENSAJE_REG_ERROR);
			}
			return ResponseEntity.ok(salida);

	}
	
	

}
