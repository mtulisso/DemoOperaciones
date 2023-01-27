/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.PersonaBonificada;

/**
 * @author Marcos Tulisso
 *
 */
public interface PersonaBonificadaRepository extends JpaRepository<PersonaBonificada, Integer> {
		
}
