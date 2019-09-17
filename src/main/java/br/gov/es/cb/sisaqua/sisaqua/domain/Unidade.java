package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "unidade")
public class Unidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUnidade")
	private Integer idUnidade;
	
	@Column(name = "nomeUnidade")
	private String nomeUnidade; 
	
	@JsonIgnore
	@OneToMany(mappedBy = "idUnidade")
	private List<Usuario> usuarios = new ArrayList<>();
	
	
	
	public Integer getIdUnidade() {
		return idUnidade;
	}
	public void setIdUnidade(Integer idUnidade) {
		this.idUnidade = idUnidade;
	}
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) { 
		this.nomeUnidade = nomeUnidade;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUnidade == null) ? 0 : idUnidade.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidade other = (Unidade) obj;
		if (idUnidade == null) {
			if (other.idUnidade != null)
				return false;
		} else if (!idUnidade.equals(other.idUnidade))
			return false;
		return true;
	}
	
	
	
	
	
	
}
