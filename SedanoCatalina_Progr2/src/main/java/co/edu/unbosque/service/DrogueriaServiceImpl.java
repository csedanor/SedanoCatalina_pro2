package co.edu.unbosque.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.model.Inventario;
import co.edu.unbosque.model.Proveedores;
import co.edu.unbosque.model.Trabajadores;
import co.edu.unbosque.model.Ventas;
import co.edu.unbosque.repository.ProveedoresRepository;
import co.edu.unbosque.repository.TrabajadorRepository;
import co.edu.unbosque.repository.VentasRepository;
import co.edu.unbosque.repository.InventarioRepository;

@Service
public class DrogueriaServiceImpl implements DrogueriaService {

	@Autowired
	private TrabajadorRepository trare;
	@Autowired
	private ProveedoresRepository prore;
	@Autowired
	private InventarioRepository inre;
	@Autowired
	private VentasRepository venre;


	public List<Trabajadores> listar() {
		return (List<Trabajadores>) trare.findAll();
	}

	@Override
	public List<Ventas> listarVentas() {
		return venre.findAll();
	}

	@Override
	public Trabajadores guardarFormulario(Trabajadores trabajadores) {
		return trare.save(trabajadores);
	}
	@Override
	public Inventario guardarInventario(Inventario inventario) {
		return inre.save(inventario);
	}


	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		return prore.save(proveedores);
	}

	@Override
	public Ventas guardarVentas(Ventas ventas) {
		return venre.save(ventas);
	}

	@Override
	public Optional<Ventas> listarSede(String sede) {
		return venre.findBySede(sede);
	}

	@Override
	public List<Ventas> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
