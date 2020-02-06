package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class GuardaVida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String genero;

	@UniqueElements
	private String cpf;
	
	
	@UniqueElements
	private String rg;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date nascimento;
	private String email;
	private String telefone;
	private String escolaridade;

}
