package com.ejercicio4.dto;

import javax.persistence.*;

@Entity
@Table(name="sala")
public class Sala {
	
	@Id
	@Column (name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column (name = "nombre")
	private String nombre;

	
	@ManyToOne
	@JoinColumn(name="pelicula_id")
	private Pelicula pelicula;
	
	//Constructores
	
	public Sala() {
	}

	public Sala(Long codigo, String nombre, Pelicula pelicula) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	//Getters y Setters
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	//toString
	@Override
	public String toString() {
		return "Sala [codigo=" + codigo + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}


}
