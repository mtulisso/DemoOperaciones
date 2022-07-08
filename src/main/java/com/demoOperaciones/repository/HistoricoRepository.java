/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.Historico;

/**
 * @author MarcosTulisso
 *
 */
public interface HistoricoRepository extends JpaRepository<Historico, Long> {

}
