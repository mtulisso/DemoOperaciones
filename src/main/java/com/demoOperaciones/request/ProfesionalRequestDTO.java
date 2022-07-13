/**
 * 
 */
package com.demoOperaciones.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class ProfesionalRequestDTO {
	@NotBlank(message = "El nombre no puede estar en blanco")
	private String nombre;
	@NotBlank
	private String apellido;
	@NotNull
	private Long dni;
	@NotBlank
	private String cuit;
	@NotBlank
	private String foto;
	@NotNull
	private Long titulo;
//Contacto
	@NotBlank
	private String direccion;
	@NotBlank
	private String telefono;
	private String telefonoAlternativo;
	@NotBlank
	private String email;
//Municipio
	private Long municipio;
	
	
//	private Integer nroMatricula;
//	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "America/Argentina/Buenos_Aires")
//	private LocalDate fechaAlta;		
}
