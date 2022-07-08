/**
 * 
 */
package com.demoOperaciones.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class ProfesionalRequestDTO {
	@NotBlank(message = "El nombre no puede estar en blanco")
	private String nombre;
	@NotBlank(message = "El nombre no puede estar en blanco")
	private String apellido;
	private Long dni;
	private String cuit;
	private Integer nroMatricula;
	private String foto;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "America/Argentina/Buenos_Aires")
	private LocalDate fechaAlta;	
}
