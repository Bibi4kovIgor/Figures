/**
 * It's a subclass of Figure that represents a circle
 */
package edu.oop.simple;

import java.io.Closeable;
import java.io.Serializable;

/**
 * It's a subclass of Figure that represents a circle
 */
public class Circle extends Figure implements Cloneable, Serializable {

    // It's a field that stores the radius of the circle.
    private final double radius;

    // It's a constructor that calls the constructor of the superclass and initializes the radius field.
    public Circle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        radius = FigureUtils.calculateSide(x1, y1, x2, y2);
    }

    /**
     * The perimeter of a circle is the circumference of the circle.
     *
     * @return The perimeter of the circle.
     */
    @Override
    protected double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    /**
     * The calculateArea() function returns the area of the circle.
     *
     * @return The area of the circle.
     */
    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * The print function prints the coordinates of the two points that define the circle.
     */
    @Override
    public void print() {
        System.out.println("Circle: "
                + "x1 = " + point1.getX() + " "
                + "y1 = " + point1.getY() + " "
                + "x2 = " + point2.getX() + " "
                + "y2 = " + point2.getY());
    }

    // It's overriding the clone method of the Object class.
    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
