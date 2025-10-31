package com.curso.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Clase que representa un curso de formación")
public class Formacion {

	@Schema(description = "Nombre del curso")
	private String nombreCurso;
	@Schema(description = "Número de asignaturas del curso")
	private Integer numAsignaturas;
	@Schema(description = "Precio del curso")
	private Double precio;

	public Formacion(String nombreCurso, Integer numAsignaturas, Double precio) {
		super();
		this.nombreCurso = nombreCurso;
		this.numAsignaturas = numAsignaturas;
		this.precio = precio;
	}

	public Formacion() {
		super();
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Integer getNumAsignaturas() {
		return numAsignaturas;
	}

	public void setNumAsignaturas(Integer numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
