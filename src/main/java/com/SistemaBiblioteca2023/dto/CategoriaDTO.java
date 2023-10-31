package com.SistemaBiblioteca2023.dto;

public class CategoriaDTO {
	
	private Integer idCategoria;
	private String nombreCategoria;
	private LibroDTO libroDTO;
	
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public LibroDTO getLibroDTO() {
		return libroDTO;
	}
	public void setLibroDTO(LibroDTO libroDTO) {
		this.libroDTO = libroDTO;
	}	

}
