package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.Unidade;
import br.gov.es.cb.sisaqua.sisaqua.repositores.UnidadeRepository;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository repository;
		
	
	public List<Unidade> list(){
		
		return repository.findAll();
	}
}
