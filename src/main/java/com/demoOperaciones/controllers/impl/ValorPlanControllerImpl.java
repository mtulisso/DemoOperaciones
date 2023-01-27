/**
 * 
 */
package com.demoOperaciones.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoOperaciones.controllers.ValorPlanController;
import com.demoOperaciones.response.ValorPlanResponseDTO;
import com.demoOperaciones.service.ValorPlanService;

/**
 * @author Marcos Tulisso
 *
 */
@RestController
@RequestMapping("/api/valorPlanes")
public class ValorPlanControllerImpl implements ValorPlanController {
	@Autowired 
	private ValorPlanService valorPlanService;
		
	@Override
	@GetMapping()
	public List<ValorPlanResponseDTO> findAll() {
		return valorPlanService.finAll();
	}

}
