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
import br.gov.es.cb.sisaqua.sisaqua.domain.GuardaVida;
import br.gov.es.cb.sisaqua.sisaqua.services.GuardaVidaService;

@RestController
@RequestMapping(value = "guarda_vida")
public class GuardaVidaResource {
	
	@Autowired
	private GuardaVidaService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<GuardaVida> getCurso(@PathVariable Integer id){
		
		GuardaVida guardaVida = service.find(id);
		
		return new ResponseEntity<GuardaVida>(guardaVida,HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity<List<GuardaVida>> list(){
		
		 List<GuardaVida> list = service.list();
		 
		 return new ResponseEntity<List<GuardaVida>>(list,HttpStatus.OK);
	}
}
