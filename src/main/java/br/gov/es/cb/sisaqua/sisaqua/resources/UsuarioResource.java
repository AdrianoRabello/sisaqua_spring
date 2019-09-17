package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Usuario;
import br.gov.es.cb.sisaqua.sisaqua.repositores.UsuarioRepository;
import br.gov.es.cb.sisaqua.sisaqua.services.UsuarioService;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> list() {
		
		List<Usuario> list = service.list();
		
		return new ResponseEntity<List<Usuario>>(list,HttpStatus.OK);
		
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Usuario> findByID(@PathVariable Integer id) {
		
		Usuario usuario = service.findById(9);
		
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
		
	}
	
	
	
}
