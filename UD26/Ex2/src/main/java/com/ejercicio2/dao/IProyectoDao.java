package com.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio2.dto.Proyecto;

public interface IProyectoDao extends JpaRepository<Proyecto, String> {

}
