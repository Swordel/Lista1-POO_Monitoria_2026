package com.listaP1;

public class Apartamento {

    private int identificador;

    public Apartamento(int identificador){
        this.identificador = identificador;
    }

    public int getIdentificador(){
        return identificador;
    }

    public void mostrar(){
        System.out.println("Apartamento: " + identificador);
    }

    //método extra pra printar o apartamento buscado na main sem o mostrar()
    @Override
    public String toString(){
        return "Apartamento: " + identificador;
}

}
