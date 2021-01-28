package geometry;

public abstract class Shape {
    protected Point position;
    protected Color fill;

    protected abstract double calculateArea();
    protected abstract double calculateCircumference();

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }
}
