/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Contacto;

/**
 * @author MarcosTulisso
 *
 */
public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
