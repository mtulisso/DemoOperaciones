/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Municipio;

/**
 * @author MarcosTulisso
 *
 */
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

}
