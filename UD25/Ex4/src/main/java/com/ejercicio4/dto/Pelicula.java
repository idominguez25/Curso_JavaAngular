package com.ejercicio4.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pelicula")
public class Pelicula {
	
	@Id
	@Column (name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column (name = "nombre")
	private String nombre;
	@Column (name = "calificacionedad")
	private Long calificacionEdad;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Sala> sala;
	
	//Constructores
	public Pelicula() {	
	}
	
	public Pelicula(Long codigo, String nombre, Long calificacionEdad, List<Sala> sala) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
		this.sala = sala;
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
	
	public Long getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(Long calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	//toString
	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad
				+ ", sala=" + sala + "]";
	}
	
	
	
}
