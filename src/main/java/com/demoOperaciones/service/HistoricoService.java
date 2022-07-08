/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.models.Historico;

/**
 * @author MarcosTulisso
 *
 */
public interface HistoricoService {
	public Historico findById(Long id) throws Exception;
		
	public List<Historico> findAll();
	
	public void delete(Long id);
}
