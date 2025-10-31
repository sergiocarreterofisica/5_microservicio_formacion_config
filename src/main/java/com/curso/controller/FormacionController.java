package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin("*")
@RestController
@RequestMapping("/formacion")
@Tag(name = "Servicio de formación", description = "Este servicio proporciona operaciones sobre cursos de formación")
public class FormacionController {

	@Autowired
	private FormacionService formacionService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Obtención de todos los cursos de formación", description = "Obtiene el listado completo de todos los cursos de formación")
	public List<Formacion> listadoFormacion() {
		return formacionService.getAllCursos();
	}

	@Operation(summary = "Alta de un curso de formación", description = "Da de alta un curso de formación a partir de sus datos: nombre del curso, número de asignaturas que tiene y precio.")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearCurso(
			@Parameter(description = "Datos del curso de formación: nombre, número de asignaturas y precio") @RequestBody Formacion formacion) {
		formacionService.addCurso(formacion);
	}

}
