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
@Table(name="municipios")
@Data @AllArgsConstructor @NoArgsConstructor
public class Municipio implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	@OneToOne
	@JoinColumn(name="id_departamento", referencedColumnName="id")
	private Departamento departamento;
	
	private static final long serialVersionUID = -8043474415018738056L;
}
