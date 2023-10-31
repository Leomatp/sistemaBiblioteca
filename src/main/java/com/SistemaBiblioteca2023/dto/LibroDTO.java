package com.SistemaBiblioteca2023.dto;

import java.util.Collection;

public class LibroDTO {
	private Integer idLibro;
	private String titulo;
	private String ISBN;
	private int aniopublicacion;
	private int cantidad;
	private Collection<AutorDTO> autoresDTO;
	private Collection<EditorialDTO> editorialesDTO;
	//
	private Collection<CategoriaDTO> categoriasDTO;
	//
	private Collection<LocalizacionDTO> localizacionesDTO;
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getAniopublicacion() {
		return aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		this.aniopublicacion = aniopublicacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Collection<AutorDTO> getAutoresDTO() {
		return autoresDTO;
	}
	public void setAutoresDTO(Collection<AutorDTO> autoresDTO) {
		this.autoresDTO = autoresDTO;
	}
	public Collection<EditorialDTO> getEditorialesDTO() {
		return editorialesDTO;
	}
	public void setEditorialesDTO(Collection<EditorialDTO> editorialesDTO) {
		this.editorialesDTO = editorialesDTO;
	}
	public Collection<CategoriaDTO> getCategoriasDTO() {
		return categoriasDTO;
	}
	public void setCategoriasDTO(Collection<CategoriaDTO> categoriasDTO) {
		this.categoriasDTO = categoriasDTO;
	}
	public Collection<LocalizacionDTO> getLocalizacionesDTO() {
		return localizacionesDTO;
	}
	public void setLocalizacionesDTO(Collection<LocalizacionDTO> localizacionesDTO) {
		this.localizacionesDTO = localizacionesDTO;
	}
	
	
	
	
}
