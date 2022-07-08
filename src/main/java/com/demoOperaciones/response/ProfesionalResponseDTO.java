/**
 * 
 */
package com.demoOperaciones.response;

import java.time.LocalDate;

import com.demoOperaciones.models.Contacto;
import com.demoOperaciones.models.Estado;
import com.demoOperaciones.models.Titulo;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class ProfesionalResponseDTO {
	private Long id;
	private Integer nroMatricula;
	private String nroMatriculaStr;
	private String apellido;
	private String nombre;
	private Long dni;
	private String cuit;
	private String foto;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaAlta;
	
	private Titulo titulo;
	private Estado estado;
//	private Set<Historico> historicos;
	private Contacto contacto;
}
