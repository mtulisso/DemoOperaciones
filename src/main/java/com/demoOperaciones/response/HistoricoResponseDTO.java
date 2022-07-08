/**
 * 
 */
package com.demoOperaciones.response;

import java.time.LocalDate;

import com.demoOperaciones.models.Estado;
import com.demoOperaciones.models.Profesional;

import lombok.Data;

/**
 * @author MarcosTulisso
 *
 */
@Data
public class HistoricoResponseDTO {
	private Long id;
	private LocalDate fecha;
	private String observacion;
	private Estado estado;
	private Profesional profesional;
}
