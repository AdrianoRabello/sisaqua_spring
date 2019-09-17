package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.Cursos;
import br.gov.es.cb.sisaqua.sisaqua.repositores.CursosRepository;

@Service
public class CursosService {
	
	@Autowired
	private CursosRepository repository;
	
	
	
	
	public List<Cursos> getList(){
		
		//System.out.println("dentro do meotdo list ");
		List<Cursos> list = repository.findAll();
		
		return list;
	}
	
	public Cursos find(Integer id) {
		
		System.out.println("dentro do meotdo find ");
		Optional<Cursos> curso =  repository.findById(id);
		
		return curso.orElse(null);
		
	}
	
}
