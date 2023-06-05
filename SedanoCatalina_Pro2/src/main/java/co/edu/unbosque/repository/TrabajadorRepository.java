package co.edu.unbosque.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import co.edu.unbosque.model.Trabajadores;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajadores, Integer> {

	
}
