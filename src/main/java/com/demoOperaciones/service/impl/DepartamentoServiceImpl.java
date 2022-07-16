/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Departamento;
import com.demoOperaciones.repository.DepartamentoRepository;
import com.demoOperaciones.request.DepartamentoRequestDTO;
import com.demoOperaciones.response.DepartamentoResponseDTO;
import com.demoOperaciones.service.DepartamentoService;

/**
 * @author MarcosTulisso
 *
 */
@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	@Autowired
	private DepartamentoRepository departamentoRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Departamento findById(Long id) throws Exception {
		return this.departamentoRepository.findById(id).get();
//		return this.departamentoRepository.findById(id).orElseThrow(() -> new Exception("No se encontró el ID = "+ id +"."));
	}

	@Override
	public List<Departamento> findAll() {
		return departamentoRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

	//generar_departamento
	@Override
	public DepartamentoResponseDTO generate(DepartamentoRequestDTO entity) {
		Departamento departamento = new Departamento();
		departamento.setNombre(entity.getNombre());
		return this.modelMapper.map(this.departamentoRepository.save(departamento), DepartamentoResponseDTO.class);
	}

}
