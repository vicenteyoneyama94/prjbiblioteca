package com.myconpany.projetoteste.model;

import com.myconpany.projetoteste.entidade.Pessoa;

public class Bibliotecario extends Pessoa{
    
    private int siape;
    Pessoa pessoa;

    public Bibliotecario() {
    }

    public Bibliotecario(int siape, Pessoa pessoa, String nome,
            String endereco, Double cpf, Double telefone) {
        super(nome, endereco, cpf, telefone);
        this.siape = siape;
        this.pessoa = pessoa;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
