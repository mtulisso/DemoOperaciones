/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.models.Municipio;
import com.demoOperaciones.request.MunicipioRequestDTO;
import com.demoOperaciones.response.MunicipioResponseDTO;

/**
 * @author MarcosTulisso
 *
 */
public interface MunicipioService {
	public Municipio findById(Long id) throws Exception;

	public List<Municipio> findAll();
	
	public void delete(Long id);
	
	MunicipioResponseDTO generate(MunicipioRequestDTO entity) throws Exception;
}

