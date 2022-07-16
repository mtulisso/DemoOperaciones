/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.models.Titulo;
import com.demoOperaciones.request.TituloRequestDTO;
import com.demoOperaciones.response.TituloResponseDTO;

/**
 * @author MarcosTulisso
 *
 */
public interface TituloService {
	public Titulo findById(Long id) throws Exception;
	
	public List<Titulo> findAll();
	
	public void delete(Long id);
	
	TituloResponseDTO generate(TituloRequestDTO entity);
}
