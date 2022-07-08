/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Historico;
import com.demoOperaciones.repository.HistoricoRepository;
import com.demoOperaciones.service.HistoricoService;

/**
 * @author MarcosTulisso
 *
 */
@Service
public class HistoricoServiceImpl implements HistoricoService {
	@Autowired
	private HistoricoRepository historicoRepository;
	
	@Override
	public Historico findById(Long id) throws Exception {
		return this.historicoRepository.findById(id).orElseThrow(() -> new Exception("No se encontró el ID = "+ id +"."));
//		return this.historicoRepository.findById(id).get();
	}

	@Override
	public List<Historico> findAll() {
		return historicoRepository.findAll();
	}

	@Override
	public void delete(Long id) {	
	}

}
