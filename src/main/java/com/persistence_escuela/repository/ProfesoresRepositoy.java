package com.persistence_escuela.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence_escuela.entity.Profesores;

public interface ProfesoresRepositoy extends JpaRepository<Profesores, Integer>{
	
	@Query("SELECT p FROM Profesores p WHERE p.nombre = :name")
	Optional<Profesores> findByName(@Param("name") String name);

}
