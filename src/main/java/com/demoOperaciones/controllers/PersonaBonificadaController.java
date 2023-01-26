/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.request.PersonaBonificadaRequestDTO;
import com.demoOperaciones.response.PersonaBonificadaResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Marcos Tulisso
 *
 */
@Tag(name= "DDJJ Personas Bonificadas ", description="Gestión de pesonas que presentan DDJJ")
public interface PersonaBonificadaController {

	@Operation(summary = "Obtener todas las Personas Bonificadas")
	public List<PersonaBonificadaResponseDTO> findAll();
	
	@Operation(summary = "Alta de una DDJJ")
	public ResponseEntity<PersonaBonificadaResponseDTO> generate(@Valid @RequestBody PersonaBonificadaRequestDTO entity);
	
}
