/**
 * 
 */
package com.demoOperaciones.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MarcosTulisso
 *
 */
@Entity
@Table(name="departamentos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Departamento implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
//	@Column(name="id_departamento")
	private Long id;
	private String nombre;	
	
	private static final long serialVersionUID = 5407163161161021013L;
}
