package com.SistemaBiblioteca2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaBiblioteca2023.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
