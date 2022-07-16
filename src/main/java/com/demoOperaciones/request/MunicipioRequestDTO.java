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
public class MunicipioRequestDTO {
	@NotBlank(message = "Nombre no puede ser nulo")
	private String nombre;
	@NotBlank
	private String codigoPostal;
	@NotNull
	private Long departamento;
}
