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
import javax.validation.constraints.Size;

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
	private Integer personaNumero;
	
	@NotNull
	@Column (name="PERSONA_TITULAR")
	private Character personaTitular;
	
	@NotNull
	@Column (name="CUENTA_ID")
	private Integer cuenta;
	
	@NotNull
	@Column (name="SUBCUENTA_ID")
	private Short subcuenta;
	
	@NotNull
	@Column (name="SECUENCIA_ID")
	private Short secuencia;
	
	@NotNull
	@Column (name="PRODUCTO_ID")
	private Short producto;
	
	@NotNull
	@Column (name="SUBPRODUCTO_ID")
	private Short subproducto;
	
	@NotNull
	@Size (max = 5)
	@Column (name="PLAN_ID")
	private String plan;
	
	@NotNull
	@Column (name="CUENTA_CANTIDAD_CAPITAS")
	private Short cuentaCantidadCapitas;
	
	@NotNull
	@Column (name="GRILLA_ID")
	private Integer grilla;
	
	@NotNull
	@Column (name="GRILLA_EDAD_HASTA")
	private Short grillaEdadHasta;
	
	@NotNull
	@Column (name="GRILLA_EDAD_DESDE")
	private Short grillaEdadDesde;
	
	@Column (name="GRILLA_CANTIDAD_CAPITAS")
	private Short grillaCantidadCapitas;
	
	@Column (name="GRILLA_TIPO")
	private Character grillaTipo;
	
	@NotNull
	@Column (name="VALOR_PLAN")
	private Double valorPlan;
	
	@NotNull
	@Column (name="VALOR_PLAN_TOTAL")
	private Double valorPlanTotal;
	
	@NotNull
	@Column (name="REGISTRA_DDJJ")
	private Character registraDDJJ;
	
	@NotNull
	@Column (name="IMPORTE_BONIFICADO_POR_DDJJ")
	private Double importeBonificado;
	
	@NotNull
	@Column (name="PORCENTAJE_BONIFICADO_POR_DDJJ")
	private Double porsentajeBonificado;
	
	@NotNull
	@Column (name="IMPORTE_AUMENTO_SSS")
	private Double importeeAumento;
	
	@NotNull
	@Column (name="PORCENTAJE_AUMENTO_SSS")
	private Double porcentajeAumento;
	
	@NotNull
	@Column (name="LIQUIDACION_ID")
	private Integer provisoria;
	
	@NotNull
	@Column (name="LIQUIDACION_ID_CONFIRMACION")
	private Integer definitiva;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -833244739076429231L;

}
