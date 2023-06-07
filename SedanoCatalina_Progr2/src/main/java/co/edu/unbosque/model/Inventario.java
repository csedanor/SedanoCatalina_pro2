package co.edu.unbosque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Inventario {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Integer id;
			private String categoria;
			private String cantidad;
			private String producto;
			private int valorU;
			
			
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getCantidad() {
				return cantidad;
			}
			public void setCantidad(String cantidad) {
				this.cantidad = cantidad;
			}
			public String getProducto() {
				return producto;
			}
			public void setProducto(String producto) {
				this.producto = producto;
			}
			public int getValorU() {
				return valorU;
			}
			public void setValorU(int valorU) {
				this.valorU = valorU;
			}
			public String getCategoria() {
				return categoria;
			}
			public void setCategoria(String categoria) {
				this.categoria = categoria;
			}
			
			
			
}
