package com.listaP1;

public class Churrasco {
    private double qtdCarne;

    public void verificarConsumo(Pessoa p){
    if(p.isVegetariana() || p.getIdade() <= 3)
        qtdCarne = 0;

    else if(p.getIdade() <= 12)
        qtdCarne = 1;

    else
        qtdCarne = 2;
    }

    public double getQtdCarne() {
        return qtdCarne;
    }

}