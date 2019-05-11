package com.uca.capas.domain;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User {
	
	@Size(message="La longitud debe ser máximo 30 caracteres",max=10)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="La longitud debe ser máximo 30 caracteres",max=10)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String marca;
	
	@Size(message="La longitud debe ser máximo 30 caracteres",max=10)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@Size(message="La longitud debe ser máximo 30 caracteres",max=10)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String categoria;
	
	@Size(message="La longitud debe ser máximo 30 caracteres",max=10)
	@NotEmpty(message="Este campo no puede estar vacio")
	@DecimalMin(value="0", inclusive=false)
	private String precio;
	
	@Pattern(regexp="^[0-9]{2}/[0-9]{2}/[1-9]{2}[0-9]{2}", message="Formato incorrecto, Formato: dd/mm/yy, Ejemplo: 13/05/2020.")
	@NotEmpty(message="Este campo no puede estar vacio")
	private String fecha;

	public User(
			@Size(message="La longitud debe ser máximo 30 caracteres",max=10) @NotEmpty(message = "Este campo no puede estar vacio") String nombre,
			@Size(message="La longitud debe ser máximo 30 caracteres",max=10) @NotEmpty(message = "Este campo no puede estar vacio") String marca,
			@Size(message="La longitud debe ser máximo 30 caracteres",max=10) @NotEmpty(message = "Este campo no puede estar vacio") String descripcion,
			@Size(message="La longitud debe ser máximo 30 caracteres",max=10) @NotEmpty(message = "Este campo no puede estar vacio") String categoria,
			@Size(message="La longitud debe ser máximo 30 caracteres",max=10) @NotEmpty(message = "Este campo no puede estar vacio") @DecimalMin(value="0", inclusive=false) String precio,
			@Pattern(regexp="^[0-9]{2}/[0-9]{2}/[1-9]{2}[0-9]{2}", message="Formato incorrecto, Formato: dd/mm/yy, Ejemplo: 13/05/2020.") @NotEmpty(message = "Este campo no puede estar vacio") String fecha) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fecha = fecha;
	}

	public User() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		

}