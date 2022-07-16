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

import com.demoOperaciones.controllers.DepartamentoController;
import com.demoOperaciones.models.Departamento;
import com.demoOperaciones.request.DepartamentoRequestDTO;
import com.demoOperaciones.response.DepartamentoResponseDTO;
import com.demoOperaciones.service.DepartamentoService;

/**
 * @author MarcosTulisso
 *
 */
@RestController
@RequestMapping("/deparamento")
public class DepartamentoControllerImpl implements DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService;
	
	@Override
	@GetMapping("{Id}")
	public ResponseEntity<Departamento> find(Long Id) throws Exception {
		return new ResponseEntity<Departamento>(this.departamentoService.findById(Id), HttpStatus.OK);
	}

	@Override
	@GetMapping()
	public List<Departamento> findAll() {
		return departamentoService.findAll();
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
	}

	//alta_departamento
	@Override
	@PostMapping
	public ResponseEntity<DepartamentoResponseDTO> generate(@Valid DepartamentoRequestDTO entity) {
		return new ResponseEntity<DepartamentoResponseDTO>(this.departamentoService.generate(entity), HttpStatus.CREATED);
	}

}
