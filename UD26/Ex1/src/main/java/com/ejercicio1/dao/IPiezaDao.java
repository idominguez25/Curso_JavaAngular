/**
 * 
 */
package com.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.dto.Pieza;


/**
 * @author Miguel A. Sastre
 *
 */
public interface IPiezaDao extends JpaRepository<Pieza, Long> {

}