package com.company;

public class Rectangle {
    public double x;
    public double y;
    private static int createdRectangle;

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
}
