package br.gov.es.cb.sisaqua.sisaqua.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Data
@Entity
public class Unidade implements Serializable{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome; 
	
	@Nullable
	@OneToMany(cascade = CascadeType.ALL,mappedBy="unidade")	
	@JsonIgnore
	private List<Municipio> municipios = new ArrayList<Municipio>(); 
	
	@Nullable
	@OneToMany(mappedBy="unidade")
	@JsonIgnore	
	private List<Usuario> usuarios = new ArrayList<Usuario>();


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unidade other = (Unidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}	
	
}
