package com.SistemaBiblioteca2023.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_autor")
public class Autor {
	@Id
	@Column(name="id_autor")
	private Integer idAutor;
	@Column(name="nombres",nullable = false)
	private String nombres;
	@Column(name="nacionalidad",nullable = false)
	private String nacionalidad;
	
	@JsonIgnore
	@OneToMany(mappedBy = "autor")
	private List<Libro> listaLibrosAutor;

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Libro> getlistaLibrosAutor() {
		return listaLibrosAutor;
	}

	public void setlistaLibrosAutor(List<Libro> listaLibrosAutor) {
		this.listaLibrosAutor = listaLibrosAutor;
	}
	
	
}
