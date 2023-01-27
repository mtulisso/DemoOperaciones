/**
 * 
 */
package com.demoOperaciones.request;

import lombok.Data;

/**
 * @author Marcos Tulisso
 *
 */
@Data
public class ValorPlanRequestDTO {
	private Integer periodo;
	private Integer cuenta;
	private Integer provisoria;
	private Integer definitiva;	
}
