/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.models.Profesional;
import com.demoOperaciones.request.ProfesionalRequestDTO;
import com.demoOperaciones.response.ProfesionalResponseDTO;

/**
 * @author MarcosTulisso
 *
 */
public interface ProfesionalService {
	
	public Profesional findById(Long id) throws Exception;

	public void delete(Long id);
	
	public List<Profesional> findAll();
	
	ProfesionalResponseDTO generate(ProfesionalRequestDTO entity) throws Exception;
}
