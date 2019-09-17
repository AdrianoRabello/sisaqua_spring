package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "usuario")
public class Usuario implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@Column(name = "idUsuario")	
	private Integer idUsuario;
	private String nomeUsuario;
	private String funcional;
	private String login;
	private String senha;
	private String email;	
	
	@ManyToOne
	//@JoinColumn(name = "idUnidade")
	private Unidade idUnidade;
	
	//@ManyToOne
	@JoinColumn(name = "idCargo")
	private Cargo idCargo; 
	
	
	public Usuario() {
		
	}
	
	
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Unidade getIdUnidade() {
		return idUnidade;
	}
	public void setIdUnidade(Unidade unidade) {
		this.idUnidade = unidade;
	}
	public Cargo getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(Cargo cargo) {
		idCargo = cargo;
	}
	
	
	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}
	
	
	
	
	
	
}
