/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import com.demoOperaciones.exception.ErrorDetails;
import com.demoOperaciones.response.ValorPlanResponseDTO;

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
@Tag(name= "Valor Plan Personas Bonificadas ", description="Gestión de valor plan personas bonificadas")
public interface ValorPlanController {

	@Parameters({
		@Parameter(name = "periodo", description = "Buscar por período", in = ParameterIn.QUERY, schema = @Schema(type = "integer")),
		@Parameter(name = "cuenta", description = "Buscar por cuenta", in = ParameterIn.QUERY, schema = @Schema(type = "integer")),
		@Parameter(name = "liquidacionProvisoriaId", description = "Buscar por Id de liquidación provisoria", in = ParameterIn.QUERY, schema = @Schema(type = "integer")),
		@Parameter(name = "liquidacionDefinitivaId", description = "Buscar por Id de liquidación definitiva", in = ParameterIn.QUERY, schema = @Schema(type = "integer"))
	})
	@Operation(summary = "Obtener todos los nose")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Consulta exitosa", content = @Content(schema = @Schema(implementation = ValorPlanResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Petición inválida", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "401", description = "Token inválido", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "404", description = "No se encontraron datos", content = @Content(schema = @Schema(implementation = ErrorDetails.class))),
			@ApiResponse(responseCode = "500", description = "Error interno al procesar una respuesta", content = @Content(schema = @Schema(implementation = ErrorDetails.class)))
			})
	public List<ValorPlanResponseDTO> findAll();
	
}
