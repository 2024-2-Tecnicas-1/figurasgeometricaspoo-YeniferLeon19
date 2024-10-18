package com.mycompany.figurasgeometricas;

public class FiguraGeometrica {

    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor() {
        this.color = color;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public double obtenerArea() {
        return 0;
    }

    public double obtenerPerimetro() {
        return 0;
    }
}
