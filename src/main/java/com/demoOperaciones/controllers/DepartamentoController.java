/**
 * 
 */
package com.demoOperaciones.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demoOperaciones.models.Departamento;
import com.demoOperaciones.request.DepartamentoRequestDTO;
import com.demoOperaciones.response.DepartamentoResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author MarcosTulisso
 *
 */
@Tag(name= "Departamento", description="Gestión de departamentos")
public interface DepartamentoController {
	@Operation(summary = "obtenerUno")
	public ResponseEntity<Departamento> find(@PathVariable Long Id) throws Exception;
	
	@Operation(summary = "obtenerTodos")
	public List<Departamento> findAll();
	
	public void delete(Long Id);
	
	@Operation(summary = "Alta de un departamento")
	public ResponseEntity<DepartamentoResponseDTO> generate(@Valid @RequestBody DepartamentoRequestDTO entity);
}
