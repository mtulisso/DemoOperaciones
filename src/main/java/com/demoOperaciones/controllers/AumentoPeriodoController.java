/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.request.AumentoPeriodoRequestDTO;
import com.demoOperaciones.response.AumentoPeriodoResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Marcos Tulisso
 *
 */
@Tag(name= "Aumentos Períodos", description="Gestión de aumentos según el período")
public interface AumentoPeriodoController {

	@Operation(summary = "Obtener todos los Aumentos por Períodos")
	public List<AumentoPeriodoResponseDTO> findAll();
	
	@Operation(summary = "Alta de un Aumento")
	public ResponseEntity<AumentoPeriodoResponseDTO> generate(@Valid @RequestBody AumentoPeriodoRequestDTO entity);
}
