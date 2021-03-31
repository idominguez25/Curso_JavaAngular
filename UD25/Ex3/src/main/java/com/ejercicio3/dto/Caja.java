package com.ejercicio3.dto;

import javax.persistence.*;

@Entity
@Table(name="caja")
public class Caja {
	
	@Id
	@Column(name = "numreferencia")
	private String numReferencia;
	private String contenido;
	private Double valor;

	
	@ManyToOne
	@JoinColumn(name="almacen_id")
	private Almacen almacen;
	
	//Constructores
	public Caja() {
	}

	public Caja(String numReferencia, String contenido, Double valor, Almacen almacen) {
		super();
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	//Getters y Setters
	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	//toString
	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

	

}
