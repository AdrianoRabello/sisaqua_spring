package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Usuario;
import br.gov.es.cb.sisaqua.sisaqua.repositores.UsuarioRepository;

@RestController
@RequestMapping(value = "usuario",method = RequestMethod.GET)
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping("/{id}")
	public Usuario findByID(@PathVariable Integer id) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(9);
		
		return usuario.orElse(null);
		
	}
}
