package geometry;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        super.setPosition(topLeft);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }
}
