package co.edu.unbosque.service;

import java.util.List;

import java.util.Optional;

import co.edu.unbosque.model.Inventario;
import co.edu.unbosque.model.Proveedores;
import co.edu.unbosque.model.Trabajadores;
import co.edu.unbosque.model.Ventas;


public interface DrogueriaService {
	
	public List<Ventas> listarVentas();
	public Optional <Ventas> listarSede (String sede);
	public Trabajadores guardarFormulario(Trabajadores trabajadores);
	public Proveedores guardarProveedores(Proveedores proveedores);
	public Inventario guardarInventario(Inventario inventario);
	public Ventas guardarVentas(Ventas ventas);
	public List<Ventas> findAll();
}
