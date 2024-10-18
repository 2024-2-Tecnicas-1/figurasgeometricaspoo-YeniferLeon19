package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2, String color, String nombre) {
        super(color, nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1() {
        this.lado1 = lado1;
    }

    public void setLado2() {
        this.lado2 = lado2;
    }

    public double obtenerArea() {
        return lado1 * lado2;
    }

    public double obtenerPerimetro() {
        return (2 * lado1) + (2 * lado2);
    }
        
}
