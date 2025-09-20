package com.simulado;

public class Passageiro {

    private String nome;
    private boolean estudante;

    //classe passageiro, tem nome e estudante/nao
    //classe onibus possui passageiros(list), precopassagem, if estudante paga meia, listar passageiro, estudante, total passagens
    public Passageiro(String nome, boolean estudante){
        this.nome = nome;
        this.estudante = estudante;
    }

    public boolean isEstudante(){
        return this.estudante;
    }

     public String getNome(){
        return this.nome;
    }

}
