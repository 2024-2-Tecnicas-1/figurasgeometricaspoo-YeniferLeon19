package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        FiguraGeometrica figura = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el nombre de la figura");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura(1: Circulo, 2: Rectángulo, 3:\n"
                + "Triángulo)");

        int tipo = Integer.parseInt(sc.nextLine());

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio = Double.parseDouble(sc.nextLine());
                figura = new Circulo(radio, color, nombre);
                break;

            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                double lado1 = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = Double.parseDouble(sc.nextLine());
                figura = new Rectangulo(lado1, lado2, color, nombre);
                break;

            case 3:
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = sc.nextDouble();
                figura = new Triangulo(base, altura, nombre, color);
                break;
            
            default:
                System.out.println("No valido");
                break;
        }
        
        if (figura!= null){
            System.out.println("Area de "+ figura.getNombre() + ": " + figura.obtenerArea());
            System.out.println("Perimetro de "+ figura.getNombre() + ": " + figura.obtenerPerimetro());
        }
        
    }
}
