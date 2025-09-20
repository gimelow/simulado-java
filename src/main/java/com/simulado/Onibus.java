
package com.simulado;

import java.util.ArrayList;
import java.util.List;


public class Onibus {
    //classe onibus possui passageiros(list), precopassagem, if estudante paga meia, listar passageiro, estudante, total passagens
    double precoPassagem;
    public List<Passageiro> passageiros = new ArrayList<>();

    public Onibus(double preco){
        this.precoPassagem = preco;
    }

    public void adicionarPassageiro(Passageiro p){
        passageiros.add(p);
    }

    public void listarPassageiros(){
        for(Passageiro p : passageiros){
            System.out.println(p.getNome());
        }
    }

    public void listarEstudantes(){
        for(Passageiro p : passageiros){
            if(p.isEstudante()){
                System.out.println(p.getNome());
            }
        }
    }

    public double totalPassagens(){
        double total = 0;
        for(Passageiro p : passageiros){
            total += p.isEstudante() ? precoPassagem / 2 : precoPassagem;
        }
        return total;
    }






}
