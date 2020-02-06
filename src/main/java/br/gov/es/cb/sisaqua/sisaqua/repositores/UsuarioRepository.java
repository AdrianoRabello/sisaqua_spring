package br.gov.es.cb.sisaqua.sisaqua.repositores;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.es.cb.sisaqua.sisaqua.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByFuncional(String nf);

	Optional<Usuario> findById(Long id);

	
	
	
}
