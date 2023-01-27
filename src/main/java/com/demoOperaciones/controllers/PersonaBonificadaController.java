/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.exception.ErrorDetails;
import com.demoOperaciones.request.PersonaBonificadaRequestDTO;
import com.demoOperaciones.response.PersonaBonificadaResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Marcos Tulisso
 *
 */
@Tag(name= "DDJJ Personas Bonificadas ", description="Gestión de pesonas que presentan DDJJ")
public interface PersonaBonificadaController {

	@Parameters({
		@Parameter(name = "periodo", description = "Buscar por período", in = ParameterIn.QUERY, schema = @Schema(type = "integer")),
		@Parameter(name = "cuenta", description = "Buscar por cuenta", in = ParameterIn.QUERY, schema = @Schema(type = "integer"))
	})
	@Operation(summary = "Obtener todas las Personas Bonificadas")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Consulta exitosa", content = @Content(schema = @Schema(implementation = PersonaBonificadaResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Petición inválida", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "401", description = "Token inválido", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "404", description = "No se encontraron datos", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "500", description = "Error interno al procesar una respuesta", content = @Content(schema = @Schema(implementation = ErrorDetails.class)))
			})
	public List<PersonaBonificadaResponseDTO> findAll();
	
	@Operation(summary = "Alta de una DDJJ")
	public ResponseEntity<PersonaBonificadaResponseDTO> generate(@Valid @RequestBody PersonaBonificadaRequestDTO entity);
	
}
