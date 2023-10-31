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

import com.SistemaBiblioteca2023.model.Categoria;
import com.SistemaBiblioteca2023.servicesimpl.CategoriaServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaServices serCategoria;
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Categoria>> lista(){
		return new ResponseEntity<>(serCategoria.listarTodos(),HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Categoria> registrar(@RequestBody Categoria bean){
		Categoria obj = serCategoria.registrar(bean);
		return new ResponseEntity<>(obj,HttpStatus.CREATED);
	}
	

}
