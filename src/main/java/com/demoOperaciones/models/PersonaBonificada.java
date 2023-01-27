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
//@Table(name = "DDJJ_PERSONAS_BONIFICADAS", schema = "LIQUI")
@Table (name = "DDJJ_PERSONAS_BONIFICADAS")
@Data @AllArgsConstructor @NoArgsConstructor
public class PersonaBonificada implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column (name="PERIODO")
	private Integer periodo;
	
	@NotNull
	@Column (name="CUENTA_ID")
	private Integer cuenta;
	
	@NotNull
	@Column (name="PERSONA_NUMERO")
	private Integer persona;
	
	@Column (name="CUIL")
	private Long cuil;
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}


