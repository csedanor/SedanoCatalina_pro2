package co.edu.unbosque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{

}
