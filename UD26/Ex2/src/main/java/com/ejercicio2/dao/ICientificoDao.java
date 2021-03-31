package com.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio2.dto.Cientifico;

public interface ICientificoDao extends JpaRepository<Cientifico, String> {

}
