package com.SistemaBiblioteca2023.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_rol")
public class Rol {
	@Id
	@Column(name="cod_rol")
	private Integer codigoRol;
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "rol")
	private List<Usuario> listaUsuario;
	
	public Integer getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(Integer codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
