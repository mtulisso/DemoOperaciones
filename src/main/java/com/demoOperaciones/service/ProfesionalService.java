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

	public List<Profesional> findAll();
	
	public void delete(Long id);
	
	ProfesionalResponseDTO generate(ProfesionalRequestDTO entity) throws Exception;
}
