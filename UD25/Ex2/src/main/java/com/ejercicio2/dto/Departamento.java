package com.ejercicio2.dto;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departamento")
public class Departamento {
	
	@Id
	private Long codigo;
	private String nombre;
	private Double presupuesto;
	
	@OneToMany
	@JoinColumn(name = "dni")
	private List<Empleado> empleado;
	
	//Constructores
	public Departamento() {
	}

	public Departamento(Long codigo, String nombre, Double presupuesto, List<Empleado> empleado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
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

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	//toString
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}

	
	
}
