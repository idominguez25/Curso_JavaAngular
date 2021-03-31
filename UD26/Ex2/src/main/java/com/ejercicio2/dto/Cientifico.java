package com.ejercicio2.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientifico")
public class Cientifico {
	
	@Id
	private String dni;
	@Column (name = "nomapel")
	private String nomApel;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<AsignadoA> asignadoA;
	
	//Constructores
	public Cientifico() {
	}

	public Cientifico(String dni, String nomApel, List<AsignadoA> asignadoA) {
		this.dni = dni;
		this.nomApel = nomApel;
		this.asignadoA = asignadoA;
	}


	//Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApel() {
		return nomApel;
	}

	public void setNomApel(String nomApel) {
		this.nomApel = nomApel;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	//toString
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApel=" + nomApel + ", asignadoA=" + asignadoA + "]";
	}
}
