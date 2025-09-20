
package com.simulado;

public class Semaforo {
    private Estado estado;

    public Semaforo(Estado estado){
        this.estado = estado;
    }

    public void mudarProximo(){
        switch(estado){
            case VERDE -> estado = Estado.AMARELO;
            case AMARELO -> estado = Estado.VERMELHO;
            case VERMELHO -> estado = Estado.VERDE;
        }
    }

    public void mostrarEstado(){
        System.out.println(estado);
    }

    public void indicar(){
        switch(estado){
            case VERDE -> System.out.println("ande com o carro");
            case AMARELO -> System.out.println("desacelere, o semaforo vai fechar!");
            case VERMELHO -> System.out.println("PARE");
        }
    }
}
