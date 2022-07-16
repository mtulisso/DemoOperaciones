/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.demoOperaciones.models.Historico;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Histórico", description="Gestión de históricos")
public interface HistoricoController {
	@Operation(summary = "obtenerUno")
	public ResponseEntity<Historico> find(@PathVariable Long Id) throws Exception;
	
	@Operation(summary = "obtenerTodos")
	public List<Historico> findAll();
}

