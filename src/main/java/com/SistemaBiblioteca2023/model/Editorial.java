package com.SistemaBiblioteca2023.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_editorial")
public class Editorial {
	@Id
	@Column(name="id_editorial")
	private Integer idEditorial;
	@Column(name="nombre_editorial")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "editorial")
	private List<Libro> listaLibrosEditorial;

	public Integer getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getListaLibrosEditorial() {
		return listaLibrosEditorial;
	}

	public void setListaLibrosEditorial(List<Libro> listaLibrosEditorial) {
		this.listaLibrosEditorial = listaLibrosEditorial;
	}
	
	
}
