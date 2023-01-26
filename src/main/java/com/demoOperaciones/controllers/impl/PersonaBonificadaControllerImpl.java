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

import com.demoOperaciones.controllers.PersonaBonificadaController;
import com.demoOperaciones.request.PersonaBonificadaRequestDTO;
import com.demoOperaciones.response.PersonaBonificadaResponseDTO;
import com.demoOperaciones.service.PersonaBonificadaService;

/**
 * @author Marcos Tulisso
 *
 */
@RestController
@RequestMapping("/personasBonificadas")
public class PersonaBonificadaControllerImpl implements PersonaBonificadaController {
	@Autowired 
	private PersonaBonificadaService personaBonificadaService;
		
	@Override
	@GetMapping()
	public List<PersonaBonificadaResponseDTO> findAll() {
		return personaBonificadaService.findAll();
	}

	@Override
	@PostMapping()
	public ResponseEntity<PersonaBonificadaResponseDTO> generate(@Valid PersonaBonificadaRequestDTO entity) {
		return new ResponseEntity<PersonaBonificadaResponseDTO>(this.personaBonificadaService.generate(entity), HttpStatus.CREATED);
	}
}
