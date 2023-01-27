/**
 * 
 */
package com.demoOperaciones.controllers.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoOperaciones.controllers.AumentoPeriodoController;
import com.demoOperaciones.request.AumentoPeriodoRequestDTO;
import com.demoOperaciones.response.AumentoPeriodoResponseDTO;
import com.demoOperaciones.service.AumentoPeriodoService;

/**
 * @author Marcos Tulisso
 *
 */
@RestController
@RequestMapping("/api/aumentosPeriodos")
public class AumentoPeriodoControllerImpl implements AumentoPeriodoController {
	@Autowired
	private AumentoPeriodoService aumentoPeriodoService;
	
	@Override
	@GetMapping()
	public List<AumentoPeriodoResponseDTO> findAll() {
		return aumentoPeriodoService.findAll();
	}

	@Override
	@PostMapping()
	public ResponseEntity<AumentoPeriodoResponseDTO> generate(@Valid AumentoPeriodoRequestDTO entity) {
		return new ResponseEntity<AumentoPeriodoResponseDTO>(this.aumentoPeriodoService.generate(entity), HttpStatus.CREATED);
	}

}
