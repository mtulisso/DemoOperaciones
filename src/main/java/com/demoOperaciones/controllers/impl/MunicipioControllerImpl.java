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

import com.demoOperaciones.controllers.MunicipioController;
import com.demoOperaciones.models.Municipio;
import com.demoOperaciones.request.MunicipioRequestDTO;
import com.demoOperaciones.response.MunicipioResponseDTO;
import com.demoOperaciones.service.MunicipioService;

/**
 * @author MarcosTulisso
 *
 */
@RestController
@RequestMapping("/municipio")
public class MunicipioControllerImpl implements MunicipioController {
	@Autowired
	private MunicipioService municipioService;
	
	@Override
	@GetMapping("{Id}")
	public ResponseEntity<Municipio> find(Long Id) throws Exception {
		return new ResponseEntity<Municipio>(this.municipioService.findById(Id), HttpStatus.OK);	
	}

	@Override
	@GetMapping()
	public List<Municipio> findAll() {
		return municipioService.findAll();
	}

	@Override
	@PostMapping
	public ResponseEntity<MunicipioResponseDTO> generate(@Valid MunicipioRequestDTO entity) throws Exception {
		return new ResponseEntity<MunicipioResponseDTO>(this.municipioService.generate(entity), HttpStatus.CREATED);
	}

}
