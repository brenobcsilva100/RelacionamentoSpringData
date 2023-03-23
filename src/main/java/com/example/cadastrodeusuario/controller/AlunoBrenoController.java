package com.example.cadastrodeusuario.controller;

import com.example.cadastrodeusuario.persistence.model.AlunoBreno;
import com.example.cadastrodeusuario.persistence.model.Usuario;
import com.example.cadastrodeusuario.service.AlunoBrenoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/alunoBreno")
public class AlunoBrenoController {

    private final AlunoBrenoService alunoBrenoService;

    public AlunoBrenoController(AlunoBrenoService alunoBrenoService) {
        this.alunoBrenoService = alunoBrenoService;
    }


    @PostMapping("/salvar")
    private ResponseEntity<AlunoBreno> cadastrarAlunoBreno(@RequestBody AlunoBreno alunoBreno){
        return new ResponseEntity<>(alunoBrenoService.salvar(alunoBreno), HttpStatus.CREATED);
    }

    @GetMapping("/mostrar")
    public ResponseEntity<?> mostrarAlunoBreno(){
        return new ResponseEntity<>(alunoBrenoService.mostrar(), HttpStatus.OK);
    }
}
