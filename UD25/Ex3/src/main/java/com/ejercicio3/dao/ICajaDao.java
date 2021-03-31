package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio3.dto.Caja;

public interface ICajaDao extends JpaRepository<Caja, String> {

}
