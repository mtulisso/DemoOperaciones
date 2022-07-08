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
	
	public void delete(Long id);
	
	public List<Titulo> findAll();
	
	TituloResponseDTO generate(TituloRequestDTO entity);
}
