package com.example.cadastrodeusuario.service;

import com.example.cadastrodeusuario.persistence.model.Usuario;
import com.example.cadastrodeusuario.persistence.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> mostrar() {
        return usuarioRepository.findAll();
    }
}
