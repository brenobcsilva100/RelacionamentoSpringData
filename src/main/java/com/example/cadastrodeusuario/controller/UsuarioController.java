package com.example.cadastrodeusuario.controller;

import com.example.cadastrodeusuario.persistence.model.Usuario;
import com.example.cadastrodeusuario.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/salvar")
    private ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.salvar(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/mostrar")
    public ResponseEntity<?> mostrarUsuario(){
        return new ResponseEntity<>(usuarioService.mostrar(), HttpStatus.OK);
    }
}
