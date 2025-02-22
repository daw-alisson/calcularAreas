package org.example;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
        double base = 5;
        double height = 10;
        double resultadoTriangulo = circleArea(5);

        System.out.println("El área del triángulo es: " + resultadoTriangulo);

    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
// Añadir métodos para calcular el área de un rectángulo y un triángulo
    // Código de alumno B
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
