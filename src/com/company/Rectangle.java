package com.company;

public class Rectangle {
    public double x;
    public double y;
    private static int createdRectangle;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangle++;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangle++;
    }

    //  Площадь
    public double calculateArea() {
        double calculateArea = x * y;
        return calculateArea;

    }

    // Вывод в терминал
    public void printArea() {
        System.out.println("Площадь: " + calculateArea());
    }

    public void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        } else if (x != y) {
            System.out.println("Это прямоугольник");
        }
    }

    public boolean isTheSameRectangle(Rectangle rectangle) {
        return this.x == rectangle.x && this.y == rectangle.y;
    }

    static void printRectangleCount() {
        System.out.println("Всего было создано " + Rectangle.createdRectangle + " прямоугольника");
    }

    static boolean printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else System.out.println(ENGLISH_CLASS_NAME);

        return printlnRussian;
    }
}
