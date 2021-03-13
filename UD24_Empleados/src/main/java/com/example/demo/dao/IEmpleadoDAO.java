package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer> {

	//Listar Trabajadores por campo "trabajo"
	public List<Empleado> findByTrabajo(String trabajo);
}