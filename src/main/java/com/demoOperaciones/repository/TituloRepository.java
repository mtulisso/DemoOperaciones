/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Titulo;

/**
 * @author MarcosTulisso
 *
 */
public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
