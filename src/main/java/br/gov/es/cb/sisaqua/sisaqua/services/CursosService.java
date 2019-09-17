package br.gov.es.cb.sisaqua.sisaqua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.Cursos;
import br.gov.es.cb.sisaqua.sisaqua.repositores.CursosRepository;

@Service
public class CursosService {
	
	@Autowired
	private CursosRepository cursosRepository;
	
	
	
	
	public java.util.List<Cursos> getList(){
		
		java.util.List<Cursos> list = cursosRepository.findAll();
		
		return list;
	}
	
}
