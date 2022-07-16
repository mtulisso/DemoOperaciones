/**
 * 
 */
package com.demoOperaciones.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class DepartamentoRequestDTO {
	@NotBlank(message = "Nombre no puede ser nulo")
	private String nombre;
}
