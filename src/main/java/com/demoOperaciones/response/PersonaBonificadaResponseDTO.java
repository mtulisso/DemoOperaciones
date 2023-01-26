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
public class PersonaBonificadaResponseDTO { 
	private Integer id;
	private Integer periodo;
	private String cuenta;
	private String persona;
	private Long cuit;
}
