package com.listaP1;

public class Lampada {
    private Estado estado;
    private int contagem; //primitivo já começa com 0

    public Lampada(){
        estado = Estado.APAGADA;
    }

    public void click(){
    estado = (estado == Estado.ACESA) ? Estado.APAGADA : Estado.ACESA;

    if(estado == Estado.ACESA)
        qtdAcendimentos();
    }

    public void qtdAcendimentos(){
        contagem++;
    }

    //seria o getter
    public Estado checaEstado(){
        return estado;
    }

    public int getContagem() {
        return contagem;
    }

    
    //método com if-else
    /*
    public void click(){
        if(estado == Estado.ACESA)
            estado = Estado.APAGADA;
        else {
            estado = Estado.ACESA;
            qtdAcendimentos(); // chamado aqui dentro
        }
    }
    */

   /* Outra interpretação do enunciado -> Considerando que qtdAcendimentos é getter direto
   public void click(){
    estado = (estado == Estado.ACESA) ? Estado.APAGADA : Estado.ACESA;
    if(estado == Estado.ACESA)
        contagem++;
    }

    public int qtdAcendimentos(){  -> e chama direto na main: l.qtdAcendimentos
    return contagem;
    }
   */

}
