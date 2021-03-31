package com.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio2.dto.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, String> {

}
