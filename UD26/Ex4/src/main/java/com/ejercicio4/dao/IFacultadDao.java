package com.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio4.dto.Facultad;

public interface IFacultadDao extends JpaRepository<Facultad, Long> {

}
