package com.myconpany.projetoteste.model;

public class Turma extends Curso {

    Curso curso;
    private int anoTurma;
    private int anoInicio;

    public Turma() {
    }

    public Turma(Curso curso, int anoTurma, int anoInicio,
            int id, String nome, String tipo) {
        super(id, nome, tipo);
        this.curso = curso;
        this.anoTurma = anoTurma;
        this.anoInicio = anoInicio;
    }

}
