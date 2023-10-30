package com.SistemaBiblioteca2023.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_localizacion")
public class Localizacion {
	
	@Id
	@Column(name="id_localizacion")
	private Integer idLocalizacion;
	
	@Column(name="estante")
	private String estande;
	
	@Column(name="seccion")
	private String seccion;
	
	@Column(name="nivel")
	private String nivel;
	
	@OneToMany(mappedBy = "localizacion")
	private List<Libro> listaLibro;
	

	public Integer getIdLocalizacion() {
		return idLocalizacion;
	}

	public void setIdLocalizacion(Integer idLocalizacion) {
		this.idLocalizacion = idLocalizacion;
	}

	public String getEstande() {
		return estande;
	}

	public void setEstande(String estande) {
		this.estande = estande;
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

	public List<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(List<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}	
}
