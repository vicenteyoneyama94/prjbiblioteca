package com.mycompany.projetoteste;

import com.myconpany.projetoteste.model.Armario;

public class Principal {
    
    public static void main(String[] args) {
        
        Armario armario = new Armario();
        System.out.println("Digite o ID: ");
        armario.getId();
        System.out.println("Digite o seu nome; ");
        armario.getAluno();
        System.out.println("Informe sua turna: ");
        armario.getTurma();
        armario.isLivre();
        
        System.out.println("");
    }
}
