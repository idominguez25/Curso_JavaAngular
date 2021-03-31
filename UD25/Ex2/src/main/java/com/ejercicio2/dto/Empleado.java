package com.ejercicio2.dto;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	private String dni;
	private String nombre;
	private String apellidos;

	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
	//Constructores
	public Empleado() {
	}

	public Empleado(String dni, String nombre, String apellido, Departamento departamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.departamento = departamento;
	}

	//Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellidos;
	}

	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//toString
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellidos + ", departamento="
				+ departamento + "]";
	}

	

}
