/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.request.AumentoPeriodoRequestDTO;
import com.demoOperaciones.response.AumentoPeriodoResponseDTO;

/**
 * @author Marcos Tulisso
 *
 */
public interface AumentoPeriodoService {
	
	public List<AumentoPeriodoResponseDTO> findAll();
	
	AumentoPeriodoResponseDTO generate(AumentoPeriodoRequestDTO entity);

}
