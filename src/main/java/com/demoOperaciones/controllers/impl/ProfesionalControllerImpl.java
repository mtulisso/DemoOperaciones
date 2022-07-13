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

import com.demoOperaciones.controllers.ProfesionalController;
import com.demoOperaciones.models.Profesional;
import com.demoOperaciones.request.ProfesionalRequestDTO;
import com.demoOperaciones.response.ProfesionalResponseDTO;
import com.demoOperaciones.service.ProfesionalService;

/**
 * @author MarcosTulisso
 *
 */
@RestController
@RequestMapping("/profesional")
public class ProfesionalControllerImpl implements ProfesionalController {
	@Autowired
	private ProfesionalService profesionalService;
	
	@Override
	@GetMapping("{Id}")
	public ResponseEntity<Profesional> find(Long Id) throws Exception {
		return new ResponseEntity<Profesional>(this.profesionalService.findById(Id), HttpStatus.OK);	
	}
		
	@Override
	@GetMapping()
	public List<Profesional> findAll() {
		return profesionalService.findAll();
	}

	@Override
	@PostMapping
	public ResponseEntity<ProfesionalResponseDTO> generate(@Valid ProfesionalRequestDTO entity) throws Exception {
		return new ResponseEntity<ProfesionalResponseDTO>(this.profesionalService.generate(entity), HttpStatus.CREATED);
	}

}
