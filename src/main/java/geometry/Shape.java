package geometry;

public abstract class Shape {
    protected Point position;
    protected Color fill;

    protected abstract double calculateArea();
    protected abstract double calculateCircumference();

    protected Point getPosition() {
        return position;
    }

    protected void setPosition(Point position) {
        this.position = position;
    }

    protected Color getFill() {
        return fill;
    }

    protected void setFill(Color fill) {
        this.fill = fill;
    }
}
