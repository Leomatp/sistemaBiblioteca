package com.SistemaBiblioteca2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.SistemaBiblioteca2023.model.Libro;
import com.SistemaBiblioteca2023.servicesimpl.LibroServices;
import com.SistemaBiblioteca2023.utils.NotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private LibroServices servicioLibro;

	@GetMapping("/lista")
	public ResponseEntity<List<Libro>> lista() {
		return new ResponseEntity<>(servicioLibro.listarTodos(), HttpStatus.OK);
	}

	@PostMapping("/registrar")
	public ResponseEntity<Libro> registrar(@RequestBody Libro bean) {
		Libro obj = servicioLibro.registrar(bean);

		return new ResponseEntity<>(obj, HttpStatus.CREATED);
	}

	@PutMapping("/actualizar")
	public ResponseEntity<Libro> actualizar(@RequestBody Libro bean) {
		Libro lib = servicioLibro.buscarPorID(bean.getIdLibro());
		if (lib == null)
			throw new NotFoundException();
		else
			lib = servicioLibro.actualizar(bean);

		return new ResponseEntity<>(lib, HttpStatus.OK);
	}

	
	@DeleteMapping("/eliminar/{codigo}")
	public ResponseEntity<Void> eliminar(@PathVariable("codigo") Integer cod) {
		// buscar còdigo
		Libro lib = servicioLibro.buscarPorID(cod);
		// validar
		if (lib == null)
			throw new NotFoundException();
		else
			servicioLibro.eliminarPorID(cod);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	// anotaciòn (direcciòn URL)para buscar empleado segùn còdigo
	@GetMapping("/buscar/{cod}")
	public ResponseEntity<Libro> buscar(@PathVariable("cod") Integer codi) {
		// buscar còdigo
		Libro lib = servicioLibro.buscarPorID(codi);
		// validar
		if (lib == null)
			throw new NotFoundException();
		else
			lib = servicioLibro.buscarPorID(codi);

		return new ResponseEntity<>(lib, HttpStatus.OK);
	}

}
