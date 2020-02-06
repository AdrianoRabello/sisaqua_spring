package br.gov.es.cb.sisaqua.sisaqua.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.gov.es.cb.sisaqua.sisaqua.domain.Unidade;
import br.gov.es.cb.sisaqua.sisaqua.dtos.UnidadeDTO;
import br.gov.es.cb.sisaqua.sisaqua.services.UnidadeService;

@RestController
@RequestMapping(value = "unidades")
@CrossOrigin
public class UnidadeResource {
	
	@Autowired
	private UnidadeService service;
	
	@GetMapping
	public ResponseEntity<List<?>> get(){
		
		List<?> list = service.get(); 
		
		return new ResponseEntity<List<?>>(list,HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		
		UnidadeDTO object = service.findUnidadeDTOById(id); 
		
		return new ResponseEntity<>(object,HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Unidade object){
		
		
		
		Unidade response = this.service.save(object);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	@PatchMapping(value="/{id}")
	public ResponseEntity<?> edit(@PathVariable Long id,@RequestBody Unidade object){
		
		Unidade response = service.findById(id);
		
		response.setNome(object.getNome());
		
		this.service.save(response);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		
		service.delete(id); 
		
		return new ResponseEntity<>(null,HttpStatus.OK); 
	}

}
