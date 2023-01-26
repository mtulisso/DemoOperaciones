/**
 * 
 */
package com.demoOperaciones.response;

import lombok.Data;

/**
 * @author Marcos Tulisso
 *
 */
@Data
public class AumentoPeriodoResponseDTO {
	private Integer id;
	private Integer periodo;
	private Double porcentajeAumento;
	private Double porcentajeBonificacion;
}
