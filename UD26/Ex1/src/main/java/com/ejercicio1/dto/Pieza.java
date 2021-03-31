package com.ejercicio1.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pieza")
public class Pieza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Suministra> suministra;
	
	//Controladores
	public Pieza() {
		
	}

	public Pieza(String nombre) {
		super();
		this.nombre = nombre;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	//toString
	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}

	
}
