package com.simulado;

public class Saida {

    String produtoNome,tipo;
    double preco;

    public Saida(String produtoNome, String tipo, double preco){
        this.produtoNome = produtoNome;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return String.format("{produtoNome: \"%s\", preco: %.2f, tipo: \"%s\"}", produtoNome, preco, tipo);
    }
}
