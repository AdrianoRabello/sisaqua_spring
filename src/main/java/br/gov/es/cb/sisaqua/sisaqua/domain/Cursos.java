package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class Cursos implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCurso")
	private Integer idCurso;
	
	@Column(name = "nomeCurso") 
	private String nomeCurso;
	
	private String descricao;
	
	private Date dataValidade;
	
	@Column(name = "cargaHoraria")
	private Integer cargaHoraria;
	
	
	
	
	public Cursos() { 
	
	}
	
	
	public Cursos(Integer idCurso, String nomeCurso, String descricao, Date dataValidade, Integer cargaHoraria) {
		super();
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public Integer getId() {
		return idCurso;
	}
	public void setId(Integer id) {
		this.idCurso = id;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
}
