package com.SistemaBiblioteca2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SistemaBiblioteca2023.model.Autor;
import com.SistemaBiblioteca2023.servicesimpl.AutorServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	private AutorServices servicioAutor;

	@GetMapping("/lista")
	public ResponseEntity<List<Autor>> lista() {
		return new ResponseEntity<>(servicioAutor.listarTodos(), HttpStatus.OK);
	}

	@PostMapping("/registrar")
	public ResponseEntity<Autor> registrar(@RequestBody Autor bean) {
		Autor obj = servicioAutor.registrar(bean);

		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
}
