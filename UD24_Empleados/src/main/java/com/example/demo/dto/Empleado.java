package com.example.demo.dto;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="empleado")
public class Empleado {
	
	enum Trabajo{
		TÉCNICO(1300),INGENIERO(2300),DISEÑADOR(2000),DESARROLLADOR(1200);
		private Double sueldo;
		
		Trabajo(double sueldo){
			this.sueldo = sueldo;
		}
		
		Double getsueldo() {
			return this.sueldo;
		}
		
		
		static Double obtenersueldoPorTrabajo(String trabajo) {
			boolean encontrado = false;
			Double sueldo = 0.0;
			List<Trabajo> lista = Arrays.asList(Trabajo.values());
			Iterator<Trabajo> it = lista.iterator();
			
			while(!encontrado && it.hasNext()) {
				Trabajo aux = it.next();
				if(aux.toString().compareToIgnoreCase(trabajo) == 0) {
					encontrado = true;
					sueldo = aux.getsueldo();
				}
			}
			
			return sueldo;
		}
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	private String trabajo;
	private Double sueldo;
	
	public Empleado() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 */
	public Empleado(Integer id, String nombre, String trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo ;
		this.sueldo = Trabajo.obtenersueldoPorTrabajo(trabajo);
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getnombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @return the sueldo
	 */
	public Double getsueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setsueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	
}