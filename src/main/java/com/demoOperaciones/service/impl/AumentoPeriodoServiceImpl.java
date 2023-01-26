/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.AumentoPeriodo;
import com.demoOperaciones.repository.AumentoPeriodoRepository;
import com.demoOperaciones.request.AumentoPeriodoRequestDTO;
import com.demoOperaciones.response.AumentoPeriodoResponseDTO;
import com.demoOperaciones.service.AumentoPeriodoService;

/**
 * @author Marcos Tulisso
 *
 */
@Service
public class AumentoPeriodoServiceImpl implements AumentoPeriodoService {
	@Autowired 
	private AumentoPeriodoRepository aumentoPeriodoRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<AumentoPeriodoResponseDTO> findAll() {
		List<AumentoPeriodo> lstAumentoPeriodo = this.aumentoPeriodoRepository.findAll(); 
		return lstAumentoPeriodo.stream().map(aumentoPeriodo ->  this.modelMapper.map(aumentoPeriodo, AumentoPeriodoResponseDTO.class)).collect(Collectors.toList());
	}	

	@Override
	public AumentoPeriodoResponseDTO generate(AumentoPeriodoRequestDTO entity) {
		//
		AumentoPeriodo aumentoPeriodo = new AumentoPeriodo();
		aumentoPeriodo.setPeriodo(entity.getPeriodo());
		aumentoPeriodo.setPorcentajeAumento(entity.getPorcentajeAumento());
		aumentoPeriodo.setPorcentajeBonificacion(entity.getPorcentajeBonificacion());
		return this.modelMapper.map(this.aumentoPeriodoRepository.save(aumentoPeriodo), AumentoPeriodoResponseDTO.class);
	}
	


}
