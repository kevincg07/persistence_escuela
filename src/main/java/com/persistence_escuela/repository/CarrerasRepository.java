package com.persistence_escuela.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence_escuela.entity.Carreras;

public interface CarrerasRepository extends JpaRepository<Carreras, Integer>{
	
	@Query("SELECT c FROM Carreras c WHERE c.nombre = :nombre")
	Optional<Carreras> findByName(@Param("nombre") String nombre);

}
