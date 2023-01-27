/**
 * 
 */
package com.demoOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoOperaciones.models.ValorPlan;

/**
 * @author Marcos Tulisso
 *
 */
public interface ValorPlanRepository extends JpaRepository<ValorPlan, Integer>{
	
//	@Transactional(readOnly=true)
//	@Query("select vp.periodo from ValorPlan vp where vp.periodo = ?1 and vp.cuenta = ?2")
//  public ValorPlan findByPeriodoAndCuenta(Integer periodo, Integer Cuenta);
	
}
