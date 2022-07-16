/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Municipio;
import com.demoOperaciones.repository.DepartamentoRepository;
import com.demoOperaciones.repository.MunicipioRepository;
import com.demoOperaciones.request.MunicipioRequestDTO;
import com.demoOperaciones.response.MunicipioResponseDTO;
import com.demoOperaciones.service.MunicipioService;

/**
 * @author MarcosTulisso
 *
 */
@Service
public class MunicipioServiceImpl implements MunicipioService {
	@Autowired 
	private MunicipioRepository municipioRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public Municipio findById(Long id) throws Exception {
		return this.municipioRepository.findById(id).get();
	}

	@Override
	public List<Municipio> findAll() {
		return municipioRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public MunicipioResponseDTO generate(MunicipioRequestDTO entity) throws Exception {
		Municipio municipio = new Municipio();
		municipio.setNombre(entity.getNombre());
		municipio.setCodigoPostal(entity.getCodigoPostal());
		municipio.setDepartamento(this.departamentoRepository.findById(entity.getDepartamento()).orElseThrow(() -> new Exception("No se encontró el ID")));
		return this.modelMapper.map(this.municipioRepository.save(municipio), MunicipioResponseDTO.class);
	}
	
}
