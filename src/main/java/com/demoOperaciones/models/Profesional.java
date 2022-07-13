/**
 * 
 */
package com.demoOperaciones.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MarcosTulisso
 *
 */
@Entity
@Table(name="profesionales")
// schema = "COLEGIO"
@Data @AllArgsConstructor @NoArgsConstructor
public class Profesional implements Serializable {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_profesional")
	private Long id;
	@Column (name="nro_matricula")
	private Integer nroMatricula;
	@Column (name="nro_matricula_str")
	private String nroMatriculaStr;
	private String apellido;
	private String nombre;
	private Long dni;
	private String cuit;
	@Column(columnDefinition="text")
	private String foto;
	@Column (name="fecha_alta", columnDefinition="DATE")
	private LocalDate fechaAlta;

	@OneToOne
	@JoinColumn(name="id_titulo", referencedColumnName="id")
	private Titulo titulo;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Estado estado;
	
	@OneToMany(mappedBy="profesional")
    private Set<Historico> historicos;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_contacto", referencedColumnName="id")
	private Contacto contacto;
	
	private static final long serialVersionUID = -1352224565462419572L;
}
