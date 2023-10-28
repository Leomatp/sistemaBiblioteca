package com.SistemaBiblioteca2023.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.SistemaBiblioteca2023.model.Editorial;
import com.SistemaBiblioteca2023.repository.EditorialRepository;

@Service
public class EditorialServices extends ICRUDImpl<Editorial, Integer> {

	@Autowired
	private EditorialRepository repo;

	@Override
	public JpaRepository<Editorial, Integer> getRepository() {
		// TODO Auto-generated method stub
		return repo;
	}
}
