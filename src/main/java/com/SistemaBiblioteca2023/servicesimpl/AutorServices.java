package com.SistemaBiblioteca2023.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.SistemaBiblioteca2023.model.Autor;
import com.SistemaBiblioteca2023.repository.AutorRepository;

@Service
public class AutorServices extends ICRUDImpl<Autor, Integer>{

	@Autowired
	private AutorRepository repo;
	
	@Override
	public JpaRepository<Autor, Integer> getRepository() {
		return repo;
	}
	

}
