package com.SistemaBiblioteca2023.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.SistemaBiblioteca2023.model.Usuario;
import com.SistemaBiblioteca2023.repository.UsuarioRepository;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUsersDetailsService implements UserDetailsService  {
	@Autowired
	private UsuarioRepository usuariosRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuariosRepo.findByLogin(username);
        //validar
        if(usuario==null)
        	 new UsernameNotFoundException("Usuario no encontrado");
        
        Set<GrantedAuthority> data=new HashSet<GrantedAuthority>();
        data.add(new SimpleGrantedAuthority(usuario.getRol().getDescripcion()));
        
        return new User(usuario.getLogin(), usuario.getClave(), data);
        
    }
}
