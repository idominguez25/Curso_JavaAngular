package com.ejercicio2.dto;

import javax.persistence.*;

@Entity
@Table(name="asignadoa")
public class AsignadoA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cientifico_id")
	private Cientifico cientifico;
	
	
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	private Proyecto proyecto;
	
	//Constructores
	public AsignadoA() {
	}

	public AsignadoA(Cientifico cientifico, Proyecto proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	//Getters y Setters
	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "AsignadoA [cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}


}
