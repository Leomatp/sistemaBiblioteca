package com.SistemaBiblioteca2023.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.SistemaBiblioteca2023.model.Localizacion;
import com.SistemaBiblioteca2023.repository.LocalizacionRepository;

@Service
public class LocalizacionServices extends ICRUDImpl<Localizacion, Integer>{

	@Autowired
	private LocalizacionRepository repo;
		
	@Override
	public JpaRepository<Localizacion, Integer> getRepository() {
		return repo;
	}

}
