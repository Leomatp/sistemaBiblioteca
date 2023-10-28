package com.SistemaBiblioteca2023.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Código no existe")
public class NotFoundException extends RuntimeException{

}
