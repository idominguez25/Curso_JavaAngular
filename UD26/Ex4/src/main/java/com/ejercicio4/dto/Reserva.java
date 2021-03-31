package com.ejercicio4.dto;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date comienzo;
	private Date fin;
	
	@ManyToOne
	@JoinColumn(name="equipo_id")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="investigador_id")
	private Investigador investigador;
	
	
	//Constructores
	public Reserva() {
	}

	public Reserva(int id, Date comienzo, Date fin, Equipo equipo, Investigador investigador) {
		super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.equipo = equipo;
		this.investigador = investigador;
	}


	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Equipo getEquipos() {
		return equipo;
	}

	public void setEquipos(Equipo equipo) {
		this.equipo = equipo;
	}

	public Investigador getInvestigadores() {
		return investigador;
	}

	public void setInvestigadores(Investigador investigador) {
		this.investigador = investigador;
	}

	//toString
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", equipo=" + equipo
				+ ", investigador=" + investigador + "]";
	}	
}
