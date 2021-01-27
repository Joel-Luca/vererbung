package geometry;

public class Circle extends Shape {
    private int radius;

    public Circle(Point position, int radius) {
        this.radius = radius;
        super.setPosition(position);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }
}
