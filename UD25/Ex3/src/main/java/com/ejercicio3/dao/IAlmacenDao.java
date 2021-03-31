package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio3.dto.Almacen;

public interface IAlmacenDao extends JpaRepository<Almacen, Long> {

}
