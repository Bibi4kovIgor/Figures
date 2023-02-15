package edu.oop.simple;

public class Triangle extends Figure {

    private final Point point3;

    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double x1, double y1,
                    double x2, double y2,
                    double x3, double y3) {
        super(x1, y1, x2, y2);
        point3 = new Point(x3, y3);
        side1 = FigureUtils.calculateSide(x1, y1, x2, y2);
        side2 = FigureUtils.calculateSide(x1, y1, x3, y3);
        side3 = FigureUtils.calculateSide(x3, y3, x2, y2);
    }

    @Override
    protected double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    protected double calculateArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void print() {

        System.out.println( "Triangle: "
                + "x1 = " + point1.getX() + " "
                + "y1 = " + point1.getY() + " "
                + "x2 = " + point2.getX() + " "
                + "y2 = " + point2.getY() + " "
                + "x3 = " + point3.getX() + " "
                + "y3 = " + point3.getY());
    }

    @Override
    public void printMessage() {
        System.out.println("Message from triangle");
    }
}
