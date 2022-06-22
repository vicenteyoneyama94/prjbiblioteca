package com.myconpany.projetoteste.model;

import com.myconpany.projetoteste.entidade.Pessoa;

public class Armario extends Aluno{
    
    private int id;
    Aluno aluno;
    private boolean livre;

    public Armario() {
    }

    public Armario(int id, Aluno aluno, boolean livre,
            Pessoa pessoa, Double ra, Curso curso, Turma turma,
            String nome, String endereco, Double cpf, Double telefone) {
        super(pessoa, ra, curso, turma, nome, endereco, cpf, telefone);
        this.id = id;
        this.aluno = aluno;
        this.livre = livre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }
    
}
