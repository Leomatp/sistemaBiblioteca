package com.SistemaBiblioteca2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaBiblioteca2023.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    //Método para poder buscar un usuario mediante su nombre
	//spring data JPA
    Usuario findByLogin(String username);
    
    //@Query("select u from Usuario u where u.login=?1")
    //public Usuario iniciarSesion(String vLogin)
    
    //Método para poder verificar si un usuario existe en nuestra base de datos
    Boolean existsByLogin(String username);
}
