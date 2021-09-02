package com.freegunity.freegunity.repository;

import com.freegunity.freegunity.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//INTERFACE REPOSITORY REPONSÁVEL PELA COMUNICAÇÃO DA API COM O BD
@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	// BUSCAR DADOS SEM LEVAR EM CONSIDERAÇÃO LETRA MAIÚSCULA OU MINÚSCULA
	public List<Tema> findAllByTituloContainingIgnoreCase(String titulo);
}
