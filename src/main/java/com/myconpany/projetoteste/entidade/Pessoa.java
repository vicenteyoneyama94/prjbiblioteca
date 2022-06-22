package com.myconpany.projetoteste.entidade;

public class Pessoa {
    private String nome;
    private String endereco;
    private Double cpf;
    private Double telefone;
    
    public Pessoa(){
    
    }
    public Pessoa(String nome, String endereco,
                  Double cpf, Double telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    } 
}
