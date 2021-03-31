package com.ejercicio3.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cajero")
public class Cajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Venta> venta;
	
	//Constructores
	public Cajero() {
		
	}

	public Cajero(Long codigo, String nomapels, List<Venta> venta) {
		this.codigo = codigo;
		this.nomapels = nomapels;
		this.venta = venta;
	}


	//Getters y Setters
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nomapels;
	}

	public void setNombre(String nomapels) {
		this.nomapels = nomapels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	//toString
	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nomapels=" + nomapels + ", venta=" + venta + "]";
	}
	
}
