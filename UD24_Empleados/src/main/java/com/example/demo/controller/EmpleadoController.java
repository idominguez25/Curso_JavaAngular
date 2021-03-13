package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleado(){
		return empleadoServiceImpl.listarEmpleado();
	}
	
	@PostMapping("/empleados")
	public Empleado añadirEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.añadirEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado getOneEmpleado(@PathVariable(name = "id") Integer id) {
		return empleadoServiceImpl.getOneEmpleado(id);
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Integer id, @RequestBody Empleado Empleado) {
		Empleado empleado1 = new Empleado();
		
		empleado1 = empleadoServiceImpl.getOneEmpleado(id);
		
		empleado1.setnombre(Empleado.getnombre());
		empleado1.setTrabajo(Empleado.getTrabajo());
		empleado1.setsueldo(Empleado.getsueldo());
		
		return empleadoServiceImpl.actualizarEmpleado(empleado1);
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") Integer id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	//listar empleados por campo trabajo
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name="trabajo") String trabajo) {
	    return empleadoServiceImpl.listarEmpleadoXTrabajo(trabajo);
	}
}