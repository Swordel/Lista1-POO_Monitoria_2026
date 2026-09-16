package com.listaP1;

import java.util.Random;

public class Jogo {
    private int numeroSorteado;

    public void sortear(){
        Random r = new Random();
        numeroSorteado = r.nextInt(100);
    }
    //O nextInt(100) gera um número de 0 a 99: o argumento é o limite exclusivo, então 100 nunca é gerado.

  public boolean adivinhar(int chute){
        return chute == numeroSorteado;
    }

    //teste
    public int getNumeroSorteado() {
        return numeroSorteado;
    }

}
