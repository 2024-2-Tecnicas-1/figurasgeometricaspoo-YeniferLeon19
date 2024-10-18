package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio, String color, String nombre) {

        super(color, nombre);
        this.radio = radio;

    }

    public double getRadio() {

        return radio;
    }

    public void setRadio() {
        this.radio = radio;
    }

    public double obtenerArea() {
        return radio * radio * Math.PI;
    }
    
    public double obtenerPerimetro (){
        return radio * 2 * Math.PI;
    }
}
