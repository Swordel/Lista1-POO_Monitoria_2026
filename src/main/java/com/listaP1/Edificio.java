package com.listaP1;

public class Edificio {

    private Apartamento[] apartamentos;
    public static final int QT_MAX = 3;
    private int topo;

    public Edificio(){
        apartamentos = new Apartamento[QT_MAX];
    }

     public void adicionar(Apartamento a){
        if(a == null){
            System.out.println("Apartamento inválido.");
            return;
        }
        if(topo >= QT_MAX){
            System.err.println("Edificio cheio."); //stack overflow
            return;
        }

        apartamentos[topo++] = a;
    }

    public void listarTodos(){
        for(int i = 0; i < topo; i++)
            apartamentos[i].mostrar();
    }

    public Apartamento buscar(int id){
        for(int i = 0; i < topo; i++){
            if(apartamentos[i].getIdentificador() == id)
                return apartamentos[i];
        }

        System.out.println("Apartamento nao encontrado.");
        return null;
    }

}
