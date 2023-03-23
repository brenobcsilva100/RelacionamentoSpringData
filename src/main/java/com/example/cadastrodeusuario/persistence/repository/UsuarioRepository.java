package com.example.cadastrodeusuario.persistence.repository;

import com.example.cadastrodeusuario.persistence.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
