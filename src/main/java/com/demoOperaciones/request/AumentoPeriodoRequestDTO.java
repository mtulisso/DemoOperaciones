/**
 * 
 */
package com.demoOperaciones.request;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author Marcos Tulisso
 *
 */
@Data
public class AumentoPeriodoRequestDTO {
	@NotNull 
	private Integer periodo;
	@NotNull
	private Double porcentajeAumento;
	@NotNull
	private Double porcentajeBonificacion;
}
