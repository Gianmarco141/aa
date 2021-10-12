package com.usuario.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name= "cliente")

public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	private String nombres;
	private String apellidos;
	private String edad;
	private String telefono;
	private String correo;
	private String password;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaReg;
	
	public usuario () {
		this.fechaReg = LocalDate.now();
			
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getFechaReg() {
		return fechaReg;
	}

	public void setFechaReg(LocalDate fechaReg) {
		this.fechaReg = fechaReg;
	}
	

	
	
	

	}
