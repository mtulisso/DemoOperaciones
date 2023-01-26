/**
 * 
 */
package com.demoOperaciones.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Marcos Tulisso
 *
 */
@Entity
//@Table(name = "AUMENTOS_PERIODO", schema = "LIQUI")
@Table (name = "AUMENTOS_PERIODO")
@Data @AllArgsConstructor @NoArgsConstructor
public class AumentoPeriodo implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column (name="PERIODO")
	private Integer periodo;
	
	@NotNull
	@Column (name="PORCENTAJE_AUMENTO")
	private Double porcentajeAumento;
	
	@NotNull
	@Column (name="PORCENTAJE_BONIFICACION_POR_DDJJ")
	private Double porcentajeBonificacion;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
