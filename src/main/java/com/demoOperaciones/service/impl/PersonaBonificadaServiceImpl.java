/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.PersonaBonificada;
import com.demoOperaciones.repository.PersonaBonificadaRepository;
import com.demoOperaciones.request.PersonaBonificadaRequestDTO;
import com.demoOperaciones.response.PersonaBonificadaResponseDTO;
import com.demoOperaciones.service.PersonaBonificadaService;

/**
 * @author Marcos Tulisso
 *
 */
@Service
public class PersonaBonificadaServiceImpl implements PersonaBonificadaService {
	@Autowired 
	private PersonaBonificadaRepository personaBonificadaRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<PersonaBonificadaResponseDTO> findAll() {
		List<PersonaBonificada> lstPersonaBonificada = this.personaBonificadaRepository.findAll(); 
		return lstPersonaBonificada.stream().map(personaBonificada ->  this.modelMapper.map(personaBonificada, PersonaBonificadaResponseDTO.class)).collect(Collectors.toList());
	}

	@Override
	public PersonaBonificadaResponseDTO generate(PersonaBonificadaRequestDTO entity) {
		//DDJJ
		PersonaBonificada personaBonificada = new PersonaBonificada();
		personaBonificada.setPeriodo(entity.getPeriodo());
		personaBonificada.setCuenta(entity.getCuenta());
		personaBonificada.setPersona(entity.getPersona());
		personaBonificada.setCuil(entity.getCuil());
		return this.modelMapper.map(this.personaBonificadaRepository.save(personaBonificada), PersonaBonificadaResponseDTO.class);
	}
	
}
