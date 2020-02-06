package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Usuario;
import br.gov.es.cb.sisaqua.sisaqua.services.UsuarioService;

@RestController
@RequestMapping(value = "usuario")
@CrossOrigin
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> list() {
		
		List<Usuario> list = service.list();
		
		return new ResponseEntity<List<Usuario>>(list,HttpStatus.OK);
		
	}
	
	/*@GetMapping("/{id}")
	public ResponseEntity<Usuario> findByID(@PathVariable Integer id) {
		
		Usuario usuario = service.findById(id); 
		
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
		
	}*/
	
	@GetMapping("/funcional/{nf}")
	public ResponseEntity<Usuario> findByNF(@PathVariable String nf) {
		
		Usuario usuario = service.findByFuncional(nf); 
		
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
		
	}
	
	
	
}
