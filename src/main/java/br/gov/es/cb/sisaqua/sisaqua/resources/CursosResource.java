package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Cursos;
import br.gov.es.cb.sisaqua.sisaqua.services.CursosService;

@RestController(value = "cursos")
public class CursosResource {
	
	@Autowired
	private CursosService cursosService;
	
	
	@GetMapping
	public ResponseEntity<List<Cursos>> getList(){
		
		
		return new ResponseEntity<List<Cursos>>(cursosService.getList(),HttpStatus.OK);
	}
	
	
}
