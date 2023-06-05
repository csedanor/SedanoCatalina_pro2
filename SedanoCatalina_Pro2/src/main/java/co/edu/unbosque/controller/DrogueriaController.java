package co.edu.unbosque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import co.edu.unbosque.model.Proveedores;
import co.edu.unbosque.model.Trabajadores;
import co.edu.unbosque.model.Ventas;
import co.edu.unbosque.model.Inventario;
import co.edu.unbosque.service.DrogueriaService;

@Controller
@RequestMapping
public class DrogueriaController {
	
	@Autowired
	private DrogueriaService service;
	
	@GetMapping ("/")
	public String index () {
		return "index";
	}
	

	@GetMapping ("/listar")
	public String listarTra (Model model) {
	model.addAttribute("ventas", service.listarVentas());	
	return "listar";
	}
	@GetMapping ("/trabajadores")
	public String formulario (Model model) {
		model.addAttribute("trabajadores", new Trabajadores());
		return "formulario";
	}
	@PostMapping("/save")
	public String guardarTrabajadores (@ModelAttribute("trabajadores") Trabajadores trabajadores) {
		service.guardarFormulario(trabajadores);	
		return "index";
		}
	
	@GetMapping ("/proveedores")
	public String proveedores (Model model) {
		model.addAttribute("proveedores", new Proveedores());
		return "proveedores";
	}
	@PostMapping("/savepro")
	public String guardarProveedores(@ModelAttribute("proveedores") Proveedores proveedores) {
		service.guardarProveedores(proveedores);
		return "index";
		}
	@GetMapping ("/inventario")
	public String Inventario (Model model) {
		model.addAttribute("inventario", new Inventario());
		return "inventario";
	}
	@PostMapping("/savein")
	public String guardarIn(@ModelAttribute("inventario") Inventario inventario) {
		service.guardarInventario(inventario);
		return "index";
		}
	
	@GetMapping ("/ventas")
	public String ventas (Model model) {
		model.addAttribute("ventas", new Ventas());
		return "ventas";
	}
	@PostMapping("/saveventas")
	public String guardarVentas(@ModelAttribute("ventas") Ventas ventas) {
		service.guardarVentas(ventas);
		return "index";
		}
	
	}

