package com.SistemaBiblioteca2023.dto;

public class AutorDTO {
	private Integer idAutor;
	private String nombres;
	private String nacionalidad;
	private LibroDTO libroDTO;
	
	
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
	public LibroDTO getLibroDTO() {
		return libroDTO;
	}
	public void setLibroDTO(LibroDTO libroDTO) {
		this.libroDTO = libroDTO;
	}
	
	
	
}
