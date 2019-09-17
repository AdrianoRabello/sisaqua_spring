package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.es.cb.sisaqua.sisaqua.domain.Unidade;
import br.gov.es.cb.sisaqua.sisaqua.services.UnidadeService;

@RestController
@RequestMapping(value = "unidade")
public class UnidadeResource {
	
	@Autowired
	private UnidadeService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Unidade>> list(){
		
		List<Unidade> list = service.list();
		
		return new ResponseEntity<List<Unidade>>(list,HttpStatus.OK);
	}

}
