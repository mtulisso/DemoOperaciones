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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MarcosTulisso
 *
 */
@Entity
@Table(name="contactos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Contacto implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String direccion;
	private String telefono;
	@Column(name = "telefono_alternativo")
	private String telefonoAlternativo;
	private String email;
	
	@OneToOne
	@JoinColumn(name="id_municipio", referencedColumnName="id")
	private Municipio municipio;
	
	private static final long serialVersionUID = -8905202753953841988L;
}
