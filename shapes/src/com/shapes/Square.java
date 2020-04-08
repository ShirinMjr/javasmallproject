package com.shapes;

public class Square extends Shape {

    public Square(double side) {
        super(side * side);
    }

    @Override
    public String toString() {
        return "Square & Area= " + this.getArea();
    }
}

