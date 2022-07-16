/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.models.Municipio;
import com.demoOperaciones.request.MunicipioRequestDTO;
import com.demoOperaciones.response.MunicipioResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Municipio", description="Gestión de municipios")
public interface MunicipioController {
	@Operation(summary = "obtenerUno")
	public ResponseEntity<Municipio> find(@PathVariable Long Id) throws Exception;
		
	@Operation(summary = "obtenerTodos")	
	public List<Municipio> findAll();
	
	@Operation(summary = "nuevoMunicipio")
	public ResponseEntity<MunicipioResponseDTO> generate(@Valid @RequestBody MunicipioRequestDTO entity) throws Exception;
}
