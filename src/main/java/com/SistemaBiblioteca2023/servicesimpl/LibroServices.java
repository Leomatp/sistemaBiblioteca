package com.SistemaBiblioteca2023.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.SistemaBiblioteca2023.model.Libro;
import com.SistemaBiblioteca2023.repository.LibroRepository;
@Service
public class LibroServices  extends ICRUDImpl<Libro, Integer>{

	@Autowired
	private LibroRepository repo;

	@Override
	public JpaRepository<Libro, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}
}
