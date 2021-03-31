package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio1.dto.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, String> {

}
