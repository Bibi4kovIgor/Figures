package edu.oop.simple;

public interface Simple {
    default void printMessage() {
        System.out.println("Hello from interface");
        System.out.println(string);
    }

    String string = "Some static string";

    static void printStaticMessage() {
        System.out.println(string);
    }

}
