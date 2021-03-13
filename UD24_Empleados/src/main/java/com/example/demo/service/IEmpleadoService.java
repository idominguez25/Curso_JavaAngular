package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleado();
	
	public Empleado añadirEmpleado(Empleado empleado);
	
	public Empleado getOneEmpleado(Integer id);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Integer id);
	
	public List<Empleado> listarEmpleadoXTrabajo(String trabajo);
	
}