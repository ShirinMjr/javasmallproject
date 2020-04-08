package com.shapes;

class Rectangular extends Shape {


    public Rectangular(double side1, double side2) {//creates a rectangle
        super(side1 * side2);
    }

    @Override
    public String toString() {
        return "Rectangular & Area= " + this.getArea();
    }
}
