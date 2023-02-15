package edu.oop.simple;

import java.io.Closeable;
import java.io.Serializable;

public class Circle extends Figure implements Cloneable, Serializable {

    private final double radius;

    public Circle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        radius = FigureUtils.calculateSide(x1, y1, x2, y2);
    }

    @Override
    protected double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle: "
                + "x1 = " + point1.getX() + " "
                + "y1 = " + point1.getY() + " "
                + "x2 = " + point2.getX() + " "
                + "y2 = " + point2.getY());
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
