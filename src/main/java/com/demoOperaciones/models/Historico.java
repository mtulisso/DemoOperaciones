/**
 * 
 */
package com.demoOperaciones.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MarcosTulisso
 *
 */
@Entity
@Table(name="historicos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Historico implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name="fecha", columnDefinition="DATE")
	private LocalDate fecha;
	private String observacion;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Estado estado;
	
	@ManyToOne
    @JoinColumn(name="id_profesional", nullable=false)
    private Profesional profesional;
	
	private static final long serialVersionUID = -4501042828286421257L;
}
