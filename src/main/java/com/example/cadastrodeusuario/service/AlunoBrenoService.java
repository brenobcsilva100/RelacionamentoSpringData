package com.example.cadastrodeusuario.service;

import com.example.cadastrodeusuario.persistence.model.AlunoBreno;
import com.example.cadastrodeusuario.persistence.model.Usuario;
import com.example.cadastrodeusuario.persistence.repository.AlunoBrenoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoBrenoService {

    private final AlunoBrenoRepository alunoBrenoRepository;

    public AlunoBrenoService(AlunoBrenoRepository alunoBrenoRepository) {
        this.alunoBrenoRepository = alunoBrenoRepository;
    }


    public AlunoBreno salvar(AlunoBreno alunoBreno) {
        return alunoBrenoRepository.save(alunoBreno);
    }

    public List<AlunoBreno> mostrar() {
        return alunoBrenoRepository.findAll();
    }
}
