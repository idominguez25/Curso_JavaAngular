/**
 * 
 */
package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio1.dto.Fabricante;

public interface IFabricanteDao extends JpaRepository<Fabricante, Long> {

}
