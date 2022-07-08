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

import com.demoOperaciones.controllers.TituloController;
import com.demoOperaciones.models.Titulo;
import com.demoOperaciones.request.TituloRequestDTO;
import com.demoOperaciones.response.TituloResponseDTO;
import com.demoOperaciones.service.TituloService;

/**
 * @author MarcosTulisso
 *
 */
@RestController
@RequestMapping("/titulo")
public class TituloControllerImpl implements TituloController {
	@Autowired
	private TituloService tituloService;
	
	@Override
	public ResponseEntity<Titulo> find(Long Id) throws Exception {
		return new ResponseEntity<Titulo>(this.tituloService.findById(Id), HttpStatus.OK);
	}

	@Override
	@GetMapping()
	public List<Titulo> findAll() {
		return tituloService.findAll();
	}

	@Override
	@PostMapping
	public ResponseEntity<TituloResponseDTO> generate(@Valid TituloRequestDTO entity) {
		return new ResponseEntity<TituloResponseDTO>(this.tituloService.generate(entity), HttpStatus.CREATED);
	}

}
