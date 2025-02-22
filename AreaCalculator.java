package org.example;

public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("Calculadora de área para diferentes figuras.");
        double radius = 5.0;
        double width = 8;
        double height = 10.0;

        // LLamo a los métodos
        double resultadoCirculo = circleArea(radius);
        double resultadoRectangulo = rectangleArea(width, height);

        System.out.println("El área de un círculo con radio " + radius + " es: " + resultadoCirculo);
        System.out.println("El área de un rectángulo con base " + width + " y altura " + height + " es: " + resultadoRectangulo);
    }

    public static double circleArea(double radius) {

        return Math.PI * radius * radius;
    }

    // Añadir métodos para calcular el área de un rectángulo y un triángulo
    public static double rectangleArea(double width, double height) {
        return width * height;
    }


}