package com.listaP1;

public class Eq2Grau {

    private double a, b, c;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

     public double delta() {
        return b * b - 4 * a * c;
    }

     public double raiz1() {
        double d = delta();
        if (d >= 0) 
            return (-b + Math.sqrt(d)) / (2 * a);
        
        return Double.NaN;
    }

    public double raiz2() {
        double d = delta();
        if (d >= 0) 
            return (-b - Math.sqrt(d)) / (2 * a);
        
        return Double.NaN;
    }

    //NaN significa "Not a Number":
    //é um valor especial do tipo double que representa um resultado indefinido/inválido.

}
