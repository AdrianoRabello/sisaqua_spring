package br.gov.es.cb.sisaqua.sisaqua.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.es.cb.sisaqua.sisaqua.domain.Usuario;
import br.gov.es.cb.sisaqua.sisaqua.repositores.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Long id) { 

		Optional<Usuario> usuario = repository.findById(id);  

		return usuario.orElse(null);
	}

	public List<Usuario> list() {

		List<Usuario> usuarios = repository.findAll();

		return usuarios;
	}

	public Usuario findByFuncional(String nf) {
		// TODO Auto-generated method stub
		return this.repository.findByFuncional(nf);
	}
}
