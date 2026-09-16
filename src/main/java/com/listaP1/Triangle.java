package com.listaP1;

public class Triangle {
    private double lado;
    private double perimetro;
    private double area;

    public Triangle(double lado){
        this.lado = lado;
    }

    public void calcArea(){
        area = (lado * lado * Math.sqrt(3)) / 4;
    }

    public void calcPerimetro(){
        perimetro = 3 * lado;
    }

    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

}
