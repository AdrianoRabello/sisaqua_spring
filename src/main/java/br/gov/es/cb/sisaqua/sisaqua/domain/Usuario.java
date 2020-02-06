package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
public class Usuario implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String nome;
	private String funcional;
	private String login;
	private String senha;
	private String email;	
	
	@ManyToOne	
	private Unidade unidade;
	
	
	@ManyToOne	
	private Cargo cargo; 
	
	
	@OneToMany
	@JsonIgnore
	private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
	
	@OneToMany
	@JsonIgnore
	private List<RelatorioDiario> relatorioDiario = new ArrayList<RelatorioDiario>();
	
	


	
	
	
	
	
}
