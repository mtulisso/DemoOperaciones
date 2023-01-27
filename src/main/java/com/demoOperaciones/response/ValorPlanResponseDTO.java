/**
 * 
 */
package com.demoOperaciones.response;

import lombok.Data;

/**
 * @author Marcos Tulisso
 *
 */
@Data
public class ValorPlanResponseDTO {
	private Integer id;
	private Integer periodo;
	private Integer personaNumero;
	private Character personaTitular;
	private Integer cuenta;
	private Short subcuenta;
	private Short secuencia;
	private Short producto;
	private Short subproducto;
	private String plan;
	private Short cuentaCantidadCapitas;
	private Integer grilla;
	private Short grillaEdadHasta;
	private Short grillaEdadDesde;
	private Short grillaCantidadCapitas;
	private Character grillaTipo;
	private Double valorPlan;
	private Double valorPlanTotal;
	private Character registraDDJJ;
	private Double importeBonificado;
	private Double porsentajeBonificado;
	private Double importeeAumento;
	private Double porcentajeAumento;
	private Integer provisoria;
	private Integer definitiva;
	
}
