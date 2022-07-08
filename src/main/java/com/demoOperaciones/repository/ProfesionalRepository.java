/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Profesional;

/**
 * @author MarcosTulisso
 *
 */
public interface ProfesionalRepository extends JpaRepository<Profesional, Long> {

}
