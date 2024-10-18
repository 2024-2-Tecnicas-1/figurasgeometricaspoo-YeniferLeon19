package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre, String color) {

        super(nombre, color);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura() {
        this.altura = altura;
    }

    public void setBase() {
        this.base = base;
    }

    public double obtenerArea() {
        return (base * altura) / 2;
    }
    
    public double obtenerPerimetro(){
        return base * 3;
    }    
}
