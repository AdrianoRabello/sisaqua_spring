package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.Unidade;
import br.gov.es.cb.sisaqua.sisaqua.dtos.UnidadeDTO;
import br.gov.es.cb.sisaqua.sisaqua.repositores.UnidadeRepository;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository repository;

	@Autowired
	private MunicipioService municipioService;

	public List<Unidade> get() {

		return repository.findAll();
	}

	public Unidade findById(Long id) {

		Optional<Unidade> response = this.repository.findById(id);

		// UnidadeDTO response = this.findUnidadeDTOById(id);

		return response.orElse(null);
	}

	public Unidade save(Unidade object) {

		System.out.println(object);
		Unidade response = this.repository.save(object);

		return response;
	}

	public void delete(Long id) {

		this.repository.deleteById(id);
	}

	public UnidadeDTO findUnidadeDTOById(Long id) {

		Optional<Unidade> unidade = this.repository.findById(id);

		return this.toDTO(unidade.orElse(null));
	}



	public UnidadeDTO toDTO(Unidade unidade) {

		UnidadeDTO dto = new UnidadeDTO();
		dto.setId(unidade.getId());
		dto.setNome(unidade.getNome());
		dto.setMunicipios(unidade.getMunicipios());
		dto.setUsuario(unidade.getUsuarios());

		return dto;
	}

}
