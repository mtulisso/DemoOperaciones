/**
 * 
 */
package com.demoOperaciones.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoOperaciones.models.Contacto;
import com.demoOperaciones.models.Estado;
import com.demoOperaciones.models.Profesional;
import com.demoOperaciones.repository.MunicipioRepository;
import com.demoOperaciones.repository.ProfesionalRepository;
import com.demoOperaciones.repository.TituloRepository;
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
	@Autowired
	private TituloRepository tituloRepository;
	@Autowired
	private MunicipioRepository municipioRepository;
	
	@Override
	public Profesional findById(Long id) throws Exception {
		return this.profesionalRepository.findById(id).get();
	}
	
//	.orElseThrow(() -> new Exception("No se encontró el ID = "+ id +" que entró como parámetro."))

	public List<Profesional> findAll(){
		return profesionalRepository.findAll();
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public ProfesionalResponseDTO generate(ProfesionalRequestDTO entity) throws Exception {
//		Contacto
		Contacto contacto = new Contacto();
		contacto.setDireccion(entity.getDireccion());
		contacto.setEmail(entity.getEmail());
		contacto.setTelefono(entity.getTelefono());
		contacto.setTelefonoAlternativo(entity.getTelefonoAlternativo());
		contacto.setMunicipio(this.municipioRepository.findById(entity.getMunicipio()).orElseThrow(() -> new Exception("No se encontró el ID")));
//		Profesional
		Profesional profesional = new Profesional();
		profesional.setNombre(entity.getNombre());
		profesional.setApellido(entity.getApellido());
		profesional.setDni(entity.getDni());
		profesional.setCuit(entity.getCuit());
		profesional.setFoto(entity.getFoto());
//		seteo el estado 
		profesional.setEstado(Estado.GENERADO);
		profesional.setTitulo(this.tituloRepository.findById(entity.getTitulo()).orElseThrow(() -> new Exception("No se encontró el ID")));
		profesional.setContacto(contacto);
//		profesional.setFechaAlta(entity.getFechaAlta());
//		profesional.setNroMatricula(entity.getNroMatricula());
		return this.modelMapper.map(this.profesionalRepository.save(profesional), ProfesionalResponseDTO.class);
	}

}
