package br.gov.es.cb.sisaqua.sisaqua.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.es.cb.sisaqua.sisaqua.domain.GuardaVida;

@Repository
public interface GuardaVidaRepository extends JpaRepository<GuardaVida, Integer> {

}
