package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio1.dto.Pieza;

public interface IPiezaDao extends JpaRepository<Pieza, Long> {

}
