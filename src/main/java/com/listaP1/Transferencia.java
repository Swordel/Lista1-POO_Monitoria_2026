package com.listaP1;

public class Transferencia {

    public static void transferir(Cliente c1, Cliente c2, double quantia){
            if(quantia<=0){
                System.out.println("invalido");
                return;
            }

            if(c2.checarSaldo() >= quantia){
                c2.sacar(quantia);
                c1.depositar(quantia);

                System.out.println("Sucesso!");
                System.out.println("Transferencia de R$" + quantia + 
                " de " + c2.obterNome() + " para " + c1.obterNome() + " concluida!");
            } 

            else
                System.out.println("Saldo insuficiente");
    }
}
