/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.models.Profesional;
import com.demoOperaciones.request.ProfesionalRequestDTO;
import com.demoOperaciones.response.ProfesionalResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Profesional", description="Gestión de profesionales")
public interface ProfesionalController {

	public ResponseEntity<Profesional> find(@PathVariable Long Id) throws Exception;
	
	public List<Profesional> findAll();
	
	@Operation(summary = "Alta de un profesional")
	public ResponseEntity<ProfesionalResponseDTO> generate(@Valid @RequestBody ProfesionalRequestDTO entity);
}
