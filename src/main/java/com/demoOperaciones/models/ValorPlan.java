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
//@Table(name = "VALOR_PLAN_PERSONAS_PERIODO", schema = "LIQUI")
@Table (name = "VALOR_PLAN_PERSONAS_PERIODO")
@Data @AllArgsConstructor @NoArgsConstructor
public class ValorPlan implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column (name="PERIODO")
	private Integer periodo;
	
	@NotNull
	@Column (name="PERSONA_NUMERO")
	private Integer persona;
	
	@NotNull
	@Column (name="CUENTA_ID")
	private Integer cuenta;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -833244739076429231L;

}
