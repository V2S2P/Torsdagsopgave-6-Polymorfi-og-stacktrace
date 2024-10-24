package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeBuilder shapeBuilder = new ShapeBuilder(shapes);

        shapes.add(new Circle(20));
        shapes.add(new Square(10));

        System.out.println("Circle Area: " + shapes.getFirst().getArea());
        System.out.println("Square Area: " + shapes.getLast().getArea());

        double totalArea = shapeBuilder.getTotalArea();
        System.out.println("\nTotal Area of all shapes: " + totalArea);
    }
}
