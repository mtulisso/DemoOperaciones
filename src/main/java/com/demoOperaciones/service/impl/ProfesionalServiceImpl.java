/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Estado;
import com.demoOperaciones.models.Profesional;
import com.demoOperaciones.repository.ProfesionalRepository;
import com.demoOperaciones.request.ProfesionalRequestDTO;
import com.demoOperaciones.response.ProfesionalResponseDTO;
import com.demoOperaciones.service.ProfesionalService;

/**
 * @author MarcosTuilisso
 *
 */
@Service
public class ProfesionalServiceImpl implements ProfesionalService {
	@Autowired
	private ProfesionalRepository profesionalRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Profesional findById(Long id) throws Exception {
		return this.profesionalRepository.findById(id).orElseThrow(() -> new Exception("No se encontró el ID = "+ id +" que entró como parámetro."));
	}

	public List<Profesional> findAll(){
		return profesionalRepository.findAll();
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public ProfesionalResponseDTO generate(ProfesionalRequestDTO entity) {
		Profesional profesional = new Profesional();
		profesional.setNombre(entity.getNombre());
		profesional.setApellido(entity.getApellido());
		profesional.setDni(entity.getDni());
		profesional.setCuit(entity.getCuit());
		profesional.setNroMatricula(entity.getNroMatricula());
		profesional.setFoto(entity.getFoto());
		profesional.setFechaAlta(entity.getFechaAlta());
//		le seteamos el estado 
		profesional.setEstado(Estado.GENERADO);
		return this.modelMapper.map(this.profesionalRepository.save(profesional), ProfesionalResponseDTO.class);
	}
	
}
