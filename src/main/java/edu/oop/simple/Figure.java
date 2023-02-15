package edu.oop.simple;

public abstract class Figure implements Printable, Simple {

    protected static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

    protected Point point1;
    protected Point point2;

    public Figure(double x1, double y1, double x2, double y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();

    @Override
    public String toString() {
        return  "Area = " + calculateArea() + " "
                + "Perimeter = " + calculatePerimeter();
    }
}
