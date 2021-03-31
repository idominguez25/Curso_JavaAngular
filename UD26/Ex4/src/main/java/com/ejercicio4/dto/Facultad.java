package com.ejercicio4.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultad")
public class Facultad {
	
	@Id
	private Long codigo;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Equipo> equipo;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Investigador> investigador;
	
	//Constructores
	public Facultad() {
	}

	public Facultad(Long codigo, String nombre, List<Equipo> equipo, List<Investigador> investigador) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.equipo = equipo;
		this.investigador = investigador;
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

	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	//toString
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}
}
