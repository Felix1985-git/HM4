package com.company;

public class Main {

    public static void main(String[] args) {
// Квадрат (x=y)
        Rectangle Rectangle1 = new Rectangle(1.5);
        Rectangle1.printRectangleKind();
        Rectangle1.printArea();
        System.out.println(Rectangle1.isTheSameRectangle(Rectangle1));
        System.out.println();

// Прямоугольник 1
        Rectangle Rectangle2 = new Rectangle(1.2, 1.5);
        Rectangle2.printRectangleKind();
        Rectangle2.printArea();
        System.out.println(Rectangle2.isTheSameRectangle(Rectangle1));
        System.out.println();

// Прямоугольник 2
        Rectangle Rectangle3 = new Rectangle(1.1, 1.2);
        Rectangle3.printRectangleKind();
        Rectangle3.printArea();
        System.out.println(Rectangle3.isTheSameRectangle(Rectangle2));
        System.out.println();
        Rectangle.printRectangleCount();
        System.out.println();
        Rectangle.printClassName(true);
    }
}
