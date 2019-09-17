package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Cursos;
import br.gov.es.cb.sisaqua.sisaqua.services.CursosService;

@RestController
@RequestMapping(value = "cursos")
public class CursosResource {
	
	@Autowired 
	private CursosService cursosService;
	
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Cursos> getCurso(@PathVariable Integer id){
		
		Cursos curso = cursosService.find(id);
		
		return new ResponseEntity<Cursos>(curso,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Cursos>> getList(){
		
		
		return new ResponseEntity<List<Cursos>>(cursosService.getList(),HttpStatus.OK);
	}
	
	
	
	
}
