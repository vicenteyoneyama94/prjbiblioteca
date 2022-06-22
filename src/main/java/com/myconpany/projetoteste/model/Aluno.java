package com.myconpany.projetoteste.model;

import com.myconpany.projetoteste.entidade.Pessoa;

public class Aluno extends Pessoa{
    
    Pessoa pessoa;
    private Double ra;
    Curso curso;
    Turma turma;

    public Aluno() {
    }

    public Aluno(Pessoa pessoa, Double ra, Curso curso, Turma turma,
            String nome, String endereco, Double cpf, Double telefone) {
        super(nome, endereco, cpf, telefone);
        this.pessoa = pessoa;
        this.ra = ra;
        this.curso = curso;
        this.turma = turma;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getRa() {
        return ra;
    }

    public void setRa(Double ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
}
