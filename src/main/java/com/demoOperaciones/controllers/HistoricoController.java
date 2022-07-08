/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.demoOperaciones.models.Historico;

import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Histórico", description="Gestión de históricos")
public interface HistoricoController {
	public ResponseEntity<Historico> find(@PathVariable Long Id) throws Exception;
	
	public List<Historico> findAll();
}

