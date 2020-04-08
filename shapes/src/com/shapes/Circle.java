package com.shapes;

class Circle extends Shape {

    public Circle(double radius) {
        super(radius * radius * Math.PI);
    }

    public String toString() {
        return "Circle & Area= " + this.getArea();
    }
}