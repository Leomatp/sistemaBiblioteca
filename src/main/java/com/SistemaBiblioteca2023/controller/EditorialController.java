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

import com.SistemaBiblioteca2023.model.Editorial;
import com.SistemaBiblioteca2023.servicesimpl.EditorialServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/editorial")
public class EditorialController {

	@Autowired
	private EditorialServices servicioEditorial;

	@GetMapping("/lista")
	public ResponseEntity<List<Editorial>> lista() {
		return new ResponseEntity<>(servicioEditorial.listarTodos(), HttpStatus.OK);
	}

	@PostMapping("/registrar")
	public ResponseEntity<Editorial> registrar(@RequestBody Editorial bean) {
		Editorial obj = servicioEditorial.registrar(bean);

		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}
}
