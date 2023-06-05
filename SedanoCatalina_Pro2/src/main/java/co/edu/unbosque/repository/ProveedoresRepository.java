package co.edu.unbosque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.model.Proveedores;


@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer>{

}
