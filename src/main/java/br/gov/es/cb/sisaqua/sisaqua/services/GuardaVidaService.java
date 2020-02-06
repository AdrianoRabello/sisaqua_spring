package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.GuardaVida;
import br.gov.es.cb.sisaqua.sisaqua.repositores.GuardaVidaRepository;

@Service
public class GuardaVidaService {

	@Autowired
	private GuardaVidaRepository repository;

	@Autowired
	private CursoGuardaVidaService cursoGuardaVidaService;

	public List<GuardaVida> list() {

		return repository.findAll();
	}

	public GuardaVida save(GuardaVida object) {
		// TODO Auto-generated method stub

		return repository.save(object);
	}

}
