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


import com.SistemaBiblioteca2023.model.Localizacion;
import com.SistemaBiblioteca2023.servicesimpl.LocalizacionServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/localizacion")
public class LocalizacionController {
	
	@Autowired
	private LocalizacionServices serLoc;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Localizacion>> lista() {
		return new ResponseEntity<>(serLoc.listarTodos(), HttpStatus.OK);
	}

	@PostMapping("/registrar")
	public ResponseEntity<Localizacion> registrar(@RequestBody Localizacion bean) {
		Localizacion obj = serLoc.registrar(bean);
		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}

}
