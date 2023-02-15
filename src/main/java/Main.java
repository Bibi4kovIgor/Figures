import edu.oop.simple.Circle;
import edu.oop.simple.Figure;
import edu.oop.simple.Simple;
import edu.oop.simple.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[2];
        figures[0] = new Circle(0, 0, 5, 5);
        figures[1] = new Triangle(0, 0, 2, 2, 5, 5 );

        Circle circle = new Circle(0, 0, 5, 5);
        Circle circle2 = circle.clone();
        System.out.println(circle2);

        for (Figure figure : figures) {
            figure.print();
            System.out.println(figure);
            figure.printMessage();
            Simple.printStaticMessage();
        }
    }
}
