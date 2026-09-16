package com.listaP1;

public class Cliente {
    private String nome;
    private double saldo, limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    // apenas se saldo+limite > quantia
    public void sacar(double quantia){
        if(quantia > 0 && checarSaldo() >= quantia)
            saldo -= quantia; //saldo = saldo - deposito;
        else
            System.out.println("Saldo e limite insuficientes.");
    }

    public void depositar(double deposito){
        if(deposito>0)
            saldo += deposito;  //saldo = saldo + deposito;
        else
            System.out.println("O deposito precisa ser maior que zero!"); //msg opcional
    }

    public double checarSaldo(){
        return saldo + limite;
    }

    public String obterNome(){
        return nome;
    }

    //Desnecessário, existe apenas para ver o saldo sozinho/fins didáticos
    public double getSaldo() {
        return saldo;
    }



}
