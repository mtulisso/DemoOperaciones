/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Departamento;

/**
 * @author MarcosTulisso
 *
 */
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
