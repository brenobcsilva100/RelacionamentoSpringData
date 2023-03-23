package com.example.cadastrodeusuario.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProfessorBreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "professorBreno")
    private List<AlunoBreno> alunoBrenos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AlunoBreno> getAlunoBrenos() {
        return alunoBrenos;
    }

    public void setAlunoBrenos(List<AlunoBreno> alunoBrenos) {
        this.alunoBrenos = alunoBrenos;
    }
}
