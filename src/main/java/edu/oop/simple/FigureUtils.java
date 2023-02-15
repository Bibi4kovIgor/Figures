package edu.oop.simple;

public class FigureUtils {
    public static double calculateSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2));
    }
}
