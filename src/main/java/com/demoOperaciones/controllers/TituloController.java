/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.models.Titulo;
import com.demoOperaciones.request.TituloRequestDTO;
import com.demoOperaciones.response.TituloResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Título", description="Gestión de títulos")
public interface TituloController {
	@Operation(summary = "obtenerUno")
	public ResponseEntity<Titulo> find(@PathVariable Long Id) throws Exception;
	
	@Operation(summary = "obtenerTodos")
	public List<Titulo> findAll();
	
	public void delete(Long Id);
	
	@Operation(summary = "Alta de un título")
	public ResponseEntity<TituloResponseDTO> generate(@Valid @RequestBody TituloRequestDTO entity);

}

