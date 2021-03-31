package com.ejercicio3.dto;

import javax.persistence.*;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="maquinaregistradora_id")
	private MaquinaRegistradora maquinaRegistradora;
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="cajero_id")
	private Cajero cajero;
	
	//Constructor	
	public Venta() {
	}
	
	public Venta(int id,MaquinaRegistradora maquinaRegistradora, Producto producto, Cajero cajero) {
		this.id = id;
		this.maquinaRegistradora = maquinaRegistradora;
		this.producto = producto;
		this.cajero = cajero;
	}

	//Getters y setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	//toString
	@Override
	public String toString() {
		return "Venta [id=" + id + ", maquinaRegistradora=" + maquinaRegistradora + ", producto="
				+ producto + ", cajero=" + cajero + "]";
	}

}
