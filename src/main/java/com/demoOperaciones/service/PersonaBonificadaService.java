/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.request.PersonaBonificadaRequestDTO;
import com.demoOperaciones.response.PersonaBonificadaResponseDTO;

/**
 * @author Marcos Tulisso
 *
 */
public interface PersonaBonificadaService {
	
	public List<PersonaBonificadaResponseDTO> findAll();
	
	PersonaBonificadaResponseDTO generate(PersonaBonificadaRequestDTO entity);
	
}
	