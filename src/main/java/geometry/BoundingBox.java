package geometry;

public class BoundingBox extends Rectangle{

    private Point topleft;

    public BoundingBox(Point topLeft, int width, int height) {
        super(topLeft, width, height);
        this.topleft = topLeft;
    }

    public Point getTopLeft() {
        return topleft;
    }

    public Point getTopRight() {
        return new Point(position.getX() + getWidth(), position.getY());
    }

    public Point getBottomLeft() {
        return new Point(position.getX(), position.getY() + getHeight());
    }

    public Point getBottomRight() {
        return new Point(position.getX() + getWidth(), position.getY() + getHeight());
    }

    public boolean isInsideRectangle(Point e) {
        Point a = this.getTopLeft();
        Point b = this.getTopRight();
        Point d = this.getBottomLeft();

        return e.getX() >= a.getX() &&
                e.getX() <= b.getX() &&
                e.getY() >= a.getY() &&
                e.getY() <= d.getY();
    }

    public boolean isSelfinsideOtherRectangle(BoundingBox box, Point e) {
        Point a = box.getTopLeft();
        Point b = box.getTopRight();
        Point d = box.getBottomLeft();

        return e.getX() >= a.getX() &&
                e.getX() <= b.getX() &&
                e.getY() >= a.getY() &&
                e.getY() <= d.getY();
    }

    public boolean intersects(BoundingBox box) {
        return this.isInsideRectangle(box.topleft) &&
                this.isInsideRectangle(box.getTopRight()) &&
                this.isInsideRectangle(box.getBottomLeft()) &&
                this.isInsideRectangle(box.getBottomRight()) &&
                this.isSelfinsideOtherRectangle(box, this.topleft) &&
                this.isSelfinsideOtherRectangle(box, this.getBottomLeft()) &&
                this.isSelfinsideOtherRectangle(box, this.getTopRight()) &&
                this.isSelfinsideOtherRectangle(box, this.getBottomRight());
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }
}
