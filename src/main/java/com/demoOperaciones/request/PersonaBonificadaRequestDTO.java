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
public class PersonaBonificadaRequestDTO {
	@NotNull 
	private Integer periodo;
	@NotNull
	private Integer cuenta;
	@NotNull
	private Integer persona;
	@NotNull
	private Long cuil;
}
