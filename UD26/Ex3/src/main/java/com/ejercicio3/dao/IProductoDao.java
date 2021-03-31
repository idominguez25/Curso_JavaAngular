package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio3.dto.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
