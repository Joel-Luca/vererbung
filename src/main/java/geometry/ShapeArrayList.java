package geometry;

import java.util.ArrayList;

public class ShapeArrayList extends ArrayList<Shape> {

    public int getAmountOfCircles() {
        int number = 0;

        for (Shape shape : this) {
            if (shape instanceof Circle) {
                number++;
            }
        }

        return number;
    }

    public int getAmountOfRectangles() {
        int number = 0;

        for (Shape shape : this) {
            if (shape instanceof Rectangle) {
                number++;
            }
        }

        return number;
    }

    public ArrayList<Circle> getAllCircles() {
        ArrayList<Circle> circles = new ArrayList<>();

        for(Shape shape : this) {
            if(shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circles.add(circle);
            }
        }

        return circles;
    }

    public ArrayList<Rectangle> getAllRectangles() {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        for(Shape shape : this) {
            if(shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangles.add(rectangle);
            }
        }

        return rectangles;
    }
}
