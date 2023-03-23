package com.example.cadastrodeusuario.persistence.model;

import jakarta.persistence.*;

@Entity
public class AlunoBreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne()
//    @JoinColumn(name = "professorBreno_id", referencedColumnName = "id")
    @JoinColumn(name = "professorBreno_id")
    private ProfessorBreno professorBreno;

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

    public ProfessorBreno getProfessorBreno() {
        return professorBreno;
    }

    public void setProfessorBreno(ProfessorBreno professorBreno) {
        this.professorBreno = professorBreno;
    }
}
