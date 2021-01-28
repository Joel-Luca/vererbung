package geometry;


public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object a) {
        if(a instanceof Point) {
            Point point = (Point) a;
            return point.getY() == y && point.getX() == x;
        }
        return false;
    }
}
