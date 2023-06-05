package co.edu.unbosque.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.model.Ventas;


@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer>{

	 Optional<Ventas> findBySede(String sede);
	
}


