package com.SistemaBiblioteca2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SistemaBiblioteca2023.dto.DtoAuthRespuesta;
import com.SistemaBiblioteca2023.dto.DtoLogin;
import com.SistemaBiblioteca2023.security.JwtGenerador;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth/")
public class UsuarioController {
	@Autowired
    private AuthenticationManager authenticationManager;

	@Autowired
    private JwtGenerador jwtGenerador;
	
    //Método para poder logear un usuario y obtener un token
    @PostMapping("login")
    public ResponseEntity<DtoAuthRespuesta> login(@RequestBody DtoLogin dtoLogin) {
    	try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    dtoLogin.getUsername(), dtoLogin.getPassword()));
            	SecurityContextHolder.getContext().setAuthentication(authentication);
            	
            	String token = jwtGenerador.generarToken(authentication);
            	return new ResponseEntity<>(new DtoAuthRespuesta(token), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new DtoAuthRespuesta("No existe"), HttpStatus.NOT_FOUND);
		}
    }


}
