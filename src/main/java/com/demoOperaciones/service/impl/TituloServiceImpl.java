/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Titulo;
import com.demoOperaciones.repository.TituloRepository;
import com.demoOperaciones.request.TituloRequestDTO;
import com.demoOperaciones.response.TituloResponseDTO;
import com.demoOperaciones.service.TituloService;

/**
 * @author MarcosTulisso
 *
 */
@Service
public class TituloServiceImpl implements TituloService {
	@Autowired
	private TituloRepository tituloRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Titulo findById(Long id) throws Exception {
		return this.tituloRepository.findById(id).get();
	}

	@Override
	public List<Titulo> findAll() {
		return tituloRepository.findAll();
	}
	
	@Override
	public void delete(Long id) {
	}

	@Override
	public TituloResponseDTO generate(TituloRequestDTO entity) {
		Titulo titulo = new Titulo();
		titulo.setNombre(entity.getNombre());
		return this.modelMapper.map(this.tituloRepository.save(titulo), TituloResponseDTO.class);
	}
	
}
