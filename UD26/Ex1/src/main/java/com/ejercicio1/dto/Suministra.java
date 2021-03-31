package com.ejercicio1.dto;

import javax.persistence.*;

@Entity
@Table(name="suministra")
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "precio")
	private Double precio;

	
	@ManyToOne
	@JoinColumn(name="pieza_id")
	private Pieza pieza;
	
	
	@ManyToOne
	@JoinColumn(name="proveedor_id")
	private Proveedor proveedor;
	
	//Constructores
	public Suministra() { 
	}
	
	public Suministra(int id, Double precio, Pieza pieza, Proveedor proveedor) {
		this.id = id;
		this.precio = precio;
		this.pieza = pieza;
		this.proveedor = proveedor;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	//toString
	@Override
	public String toString() {
		return "Suministra [id=" + id + ", precio=" + precio + ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}

	
}
