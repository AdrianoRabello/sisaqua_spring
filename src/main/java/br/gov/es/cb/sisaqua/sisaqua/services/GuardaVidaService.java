package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.GuardaVida;
import br.gov.es.cb.sisaqua.sisaqua.repositores.GuardaVidaRepository;

@Service
public class GuardaVidaService {

	@Autowired
	private GuardaVidaRepository repository;

	public List<GuardaVida> list() {

		return repository.findAll();
	}

	public GuardaVida find(Integer id) {

		Optional<GuardaVida> guardaVida = repository.findById(id);

		return guardaVida.orElse(null);
	}
}
