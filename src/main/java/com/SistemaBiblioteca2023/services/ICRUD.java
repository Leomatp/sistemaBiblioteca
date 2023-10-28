package com.SistemaBiblioteca2023.services;

import java.util.List;

public interface ICRUD<T,ID> {
	T registrar(T bean);
	T actualizar(T bean);
	void eliminarPorID(ID cod);
	T buscarPorID(ID cod);
	List<T> listarTodos();
}
