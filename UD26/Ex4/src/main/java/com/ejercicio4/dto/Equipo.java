package com.ejercicio4.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="equipo")
public class Equipo {
	
	@Id
	@Column (name = "numserie")
	private String numSerie;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "numserie")
	private List<Reserva> reserva;
	
	@ManyToOne
	@JoinColumn(name="facultad_id")
	private Facultad facultad;
	
	//Constructores
	public Equipo() {
	}
	
	public Equipo(String numSerie, String nombre, List<Reserva> reserva, Facultad facultad) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}
	
	//Getters y Setters
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	//toString
	@Override
	public String toString() {
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", reserva=" + reserva + ", facultad="
				+ facultad + "]";
	}

}
