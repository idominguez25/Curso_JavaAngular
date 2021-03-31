package com.ejercicio4.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="investigador")
public class Investigador {
	
	@Id
	private String dni;
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "dni")
	private List<Reserva> reserva;
	
	@ManyToOne
	@JoinColumn(name="investigador_facultad_id")
	private Facultad facultad;
	
	//Constructores
	public Investigador() {
	}
	
	public Investigador(String dni, String nomapels, List<Reserva> reserva, Facultad facultad) {
		this.dni = dni;
		this.nomapels = nomapels;
		this.reserva = reserva;
		this.facultad = facultad;
	}

	//Getters y Setters
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
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
		return "Investigador [dni=" + dni + ", nomapels=" + nomapels + ", reserva=" + reserva + ", facultad="
				+ facultad + "]";
	}
}
