package com.shapes;

import java.util.Comparator;

class Shape implements Comparator<Shape> {
    private double area;


    public Shape() {//default constructor
    }

    public Shape(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Shape & Area= " + area;
    }


    @Override
    public int compare(Shape shape1, Shape shape2) {

        return Double.compare(shape2.getArea(), shape1.getArea());
    }
}


