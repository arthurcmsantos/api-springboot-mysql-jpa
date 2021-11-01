package br.com.arthurcleiton.exemploapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arthurcleiton.exemploapi.modelos.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
