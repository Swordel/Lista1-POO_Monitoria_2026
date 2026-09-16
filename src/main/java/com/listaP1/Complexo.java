package com.listaP1;

public class Complexo {
    private double a; // parte real
    private double b; // parte imaginária

    //O this só é obrigatório quando há ambiguidade de nomes, como no construtor.
    public Complexo(double a, double b){
        this.a = a;
        this.b = b;
    }

    //soma e multiplica retornam um novo objeto Complexo em vez de modificar o atual 
    // Isso é boa prática porque números em geral não deveriam ser mutáveis.

    public Complexo soma(Complexo outro){               //É só somar o real dos dois e depois o imaginário dos dois.
        return new Complexo(a + outro.a, b + outro.b);
    }

    public Complexo multiplica(Complexo outro){
        //parte real = a * c - b * d
        //parte img = a * d + b * c
        // Sendo a (real) e b (img) do primeiro
        // c (real) e d (img) do segundo
        double real = (a * outro.a) - (b * outro.b);
        double imaginario = (a * outro.b) + (b * outro.a);
        return new Complexo(real, imaginario);
    }

    // Sem isso, apareceria um monte de código no print
    // É um método que toda classe em Java herda. Por padrão ele retorna aquele código de memória (Complexo@1b6d3586). 
    // Quando você sobrescreve com @Override, o System.out.println(objeto) passa a chamar o seu toString automaticamente
    @Override
    public String toString(){
        return a + (b >= 0 ? " + " : " - ") + Math.abs(b) + "i";
    }

    /* Sem operador ternário:
    @Override
    public String toString(){
    if(b < 0)
        return a + " - " + Math.abs(b) + "i";
    return a + " + " + b + "i";
    }
    */

    public double modulo(){
        return Math.sqrt((a * a) + (b * b));
    }

    public double argumentoPrincipal(){
        return Math.atan(b / a); //A função Math.atan() retorna o arco tangente (o inverso da tangente) de um número, expresso em radianos
    }
}
