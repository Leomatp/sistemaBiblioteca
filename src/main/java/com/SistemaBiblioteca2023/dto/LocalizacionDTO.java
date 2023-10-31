package com.SistemaBiblioteca2023.dto;

public class LocalizacionDTO {
	private Integer idLocalizacion;
	private String estante;
	private String seccion;
	private String nivel;
	private LibroDTO libroDTO;
	public Integer getIdLocalizacion() {
		return idLocalizacion;
	}
	public void setIdLocalizacion(Integer idLocalizacion) {
		this.idLocalizacion = idLocalizacion;
	}
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public LibroDTO getLibroDTO() {
		return libroDTO;
	}
	public void setLibroDTO(LibroDTO libroDTO) {
		this.libroDTO = libroDTO;
	}
	
}
