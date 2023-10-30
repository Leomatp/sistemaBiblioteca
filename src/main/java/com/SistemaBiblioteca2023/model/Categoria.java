package com.SistemaBiblioteca2023.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	
	@Id
	@Column(name="id_categoria")
	private Integer idCategoria;
	
	@Column(name="nombre_categoria")
	private String nombreCategoria;
	
	@OneToMany(mappedBy = "categoria")
	private List<Libro> listaLibros;

}
