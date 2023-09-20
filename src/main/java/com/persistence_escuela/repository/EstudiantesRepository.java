package com.persistence_escuela.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence_escuela.entity.Estudiantes;

public interface EstudiantesRepository extends JpaRepository<Estudiantes, Integer> {

	@Query("SELECT e FROM Estudiantes e WHERE e.nombre = :name")
	Optional<Estudiantes> findByName(@Param("name") String name);
}
