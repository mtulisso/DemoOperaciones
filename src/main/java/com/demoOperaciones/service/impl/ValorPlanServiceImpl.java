/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.ValorPlan;
import com.demoOperaciones.repository.ValorPlanRepository;
import com.demoOperaciones.response.ValorPlanResponseDTO;
import com.demoOperaciones.service.ValorPlanService;

/**
 * @author Marcos Tulisso
 *
 */
@Service
public class ValorPlanServiceImpl implements ValorPlanService {
	@Autowired 
	private ValorPlanRepository valorPlanRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<ValorPlanResponseDTO> finAll() {
		List<ValorPlan> lstValorPlan = this.valorPlanRepository.findAll(); 
		return lstValorPlan.stream().map(valorPlan ->  this.modelMapper.map(valorPlan, ValorPlanResponseDTO.class)).collect(Collectors.toList());
	}

}
