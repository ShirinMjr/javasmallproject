package com.shapes;

import java.util.*;

public class Main {

    public static void main(String arg[]) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle1 = new Circle(20.00);
        Circle circle2 = new Circle(20.00);
        Square square1 = new Square(10.00);
        Square square2 = new Square(20.00);
        Rectangular rectangle1 = new Rectangular(10.00, 20.00);
        Rectangular rectangle2 = new Rectangular(20.00, 30.00);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        Collections.sort(shapes, new Shape());

        System.out.printf(shapes.toString());
    }
}

