package co.edu.unbosque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="proveedores")
public class Proveedores {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String sede;
		private String nombre;
		private String correo;
		private String fecha;
		private String categorias;
		private String productos;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getSede() {
			return sede;
		}
		public void setSede(String sede) {
			this.sede = sede;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		public String getProductos() {
			return productos;
		}
		public void setProductos(String productos) {
			this.productos = productos;
		}
		public String getCategorias() {
			return categorias;
		}
		public void setCategorias(String categorias) {
			this.categorias = categorias;
		}
		
		
		
		
}
