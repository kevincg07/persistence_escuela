package com.persistence_escuela.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence_escuela.entity.Materias;

public interface MateriasRepository extends JpaRepository<Materias, Integer>{

	@Query("SELECT m FROM Materias m WHERE m.materia = :materia")
	Optional<Materias> findByNombre(@Param("materia") String materia);
}
