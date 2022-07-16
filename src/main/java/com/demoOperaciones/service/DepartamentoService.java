/**
 * 
 */
package com.demoOperaciones.service;

import java.util.List;

import com.demoOperaciones.models.Departamento;
import com.demoOperaciones.request.DepartamentoRequestDTO;
import com.demoOperaciones.response.DepartamentoResponseDTO;

/**
 * @author MarcosTulisso
 *
 */
public interface DepartamentoService {
	public Departamento findById(Long id) throws Exception;
	
	public List<Departamento> findAll();
	
	public void delete(Long id);
	
	DepartamentoResponseDTO generate(DepartamentoRequestDTO entity);
}
