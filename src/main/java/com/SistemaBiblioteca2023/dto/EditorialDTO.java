package com.SistemaBiblioteca2023.dto;

public class EditorialDTO {
	private Integer idEditorial;
	private String nombres;
	private LibroDTO libroDTO;
	public Integer getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public LibroDTO getLibroDTO() {
		return libroDTO;
	}
	public void setLibroDTO(LibroDTO libroDTO) {
		this.libroDTO = libroDTO;
	}
	
	
}
