/**
 * 
 */
package com.demoOperaciones.response;

import com.demoOperaciones.models.Departamento;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class MunicipioResponseDTO {
	private Long id;
	private String nombre;
	private String codigoPostal;
	private Departamento departamento;
}
