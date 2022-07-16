/**
 * 
 */
package com.demoOperaciones.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoOperaciones.controllers.HistoricoController;
import com.demoOperaciones.models.Historico;
import com.demoOperaciones.service.HistoricoService;

/**
 * @author MarcosTulisso
 *
 */
@RestController
@RequestMapping("/historico")
public class HistoricoControllerImpl implements HistoricoController {
	@Autowired
	private HistoricoService historicoService;
	
	@Override
	@GetMapping("{Id}")
	public ResponseEntity<Historico> find(Long Id) throws Exception{
		return new ResponseEntity<Historico>(this.historicoService.findById(Id), HttpStatus.OK);
	}

	@Override
	@GetMapping()
	public List<Historico> findAll() {
		return historicoService.findAll();
	}

}


